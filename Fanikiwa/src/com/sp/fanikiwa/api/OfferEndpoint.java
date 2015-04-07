package com.sp.fanikiwa.api;

import static com.sp.fanikiwa.api.OfyService.ofy;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.ConflictException;
import com.google.api.server.spi.response.ForbiddenException;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.googlecode.objectify.cmd.Query;
import com.sp.fanikiwa.entity.Account;
import com.sp.fanikiwa.entity.Member;
import com.sp.fanikiwa.entity.Offer;
import com.sp.fanikiwa.entity.OfferDTO;
import com.sp.fanikiwa.entity.OfferModel;
import com.sp.fanikiwa.entity.OfferReceipient;
import com.sp.fanikiwa.entity.OfferStatus;
import com.sp.utils.GLUtil;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Named;

@Api(name = "offerendpoint", namespace = @ApiNamespace(ownerDomain = "sp.com", ownerName = "sp.com", packagePath = "fanikiwa.entity"))
public class OfferEndpoint {


	private Member SearchMemberByEmail(String email) {
		MemberEndpoint mep = new MemberEndpoint();
		Member member = mep.GetMemberByEmail(email);
		return member;
	}

	public OfferEndpoint() {

	}

	/**
	 * This method lists all the entities inserted in datastore. It uses HTTP
	 * GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 *         persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listOffer")
	public CollectionResponse<Offer> listOffer(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("count") Integer count) {

		Query<Offer> query = ofy().load().type(Offer.class);
		return GetOffersFromQuery(query, cursorString, count);
	}

	@ApiMethod(name = "selectOffersByMember")
	public CollectionResponse<Offer> selectOffersByMember(
			@Named("memberid") long MemberId,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("count") Integer count) {

		Member member = SearchMember( MemberId);
		Query<Offer> query = ofy().load().type(Offer.class)
				.filter("member", member);
		return GetOffersFromQuery(query, cursorString, count);
	}
	@ApiMethod(name = "ListMyLendOffers")
	public CollectionResponse<Offer> ListMyLendOffers(
			@Named("memberid") long MemberId,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("count") Integer count) {

		Member member = ofy().load().type(Member.class).id(MemberId).now();
		Query<Offer> query = ofy().load().type(Offer.class)
				.filter("offerType", "L")
				.filter("member", member);
		return GetOffersFromQuery(query, cursorString, count);
	}
	@ApiMethod(name = "ListBorrowOffers")
	public CollectionResponse<Offer> ListBorrowOffers(
			@Named("memberid") long MemberId,
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("count") Integer count) {

		Member member = ofy().load().type(Member.class).id(MemberId).now();
		Query<Offer> query = ofy().load().type(Offer.class)
				.filter("offerType", "B")
				.filter("member", member);
		return GetOffersFromQuery(query, cursorString, count);
	}
	
	
//	@ApiMethod(name = "PrivateOffersToMember")
//	public CollectionResponse<Offer> PrivateOffersToMember(
//			@Named("memberid") long MemberId,
//			@Nullable @Named("cursor") String cursorString,
//			@Nullable @Named("count") Integer count) {
//
//		Member member = ofy().load().type(Member.class).id(MemberId).now();
//		Query<Offer> query = ofy().load().type(Offer.class)
//				.filter("publicOffer", false).filter("offerrees", member)
//				.filter("status", "Open").filter("expiryDate >", new Date());
//		return GetOffersFromQuery(query, cursorString, count);
//	}

	@ApiMethod(name = "retrievePublicOffers")
	public CollectionResponse<Offer> retrievePublicOffers(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("count") Integer count) {

		Query<Offer> query = ofy().load().type(Offer.class)
				.filter("publicOffer", true)
				.filter("status","Open")
				.filter("expiryDate >", new Date());
		return GetOffersFromQuery(query, cursorString, count);
	}

	private CollectionResponse<Offer> GetOffersFromQuery(Query<Offer> query,
			String cursorString, Integer count) {

		if (count != null)
			query.limit(count);
		if (cursorString != null && cursorString != "") {
			query = query.startAt(Cursor.fromWebSafeString(cursorString));
		}

		List<Offer> records = new ArrayList<Offer>();
		QueryResultIterator<Offer> iterator = query.iterator();
		int num = 0;
		while (iterator.hasNext()) {
			records.add(iterator.next());
			if (count != null) {
				num++;
				if (num == count)
					break;
			}
		}

		// Find the next cursor
		if (cursorString != null && cursorString != "") {
			Cursor cursor = iterator.getCursor();
			if (cursor != null) {
				cursorString = cursor.toWebSafeString();
			}
		}
		return CollectionResponse.<Offer> builder().setItems(records)
				.setNextPageToken(cursorString).build();
	}

	 

	/**
	 * This method gets the entity having primary key id. It uses HTTP GET
	 * method.
	 *
	 * @param id
	 *            the primary key of the java bean.
	 * @return The entity with primary key id.
	 */
	@ApiMethod(name = "getOfferByID")
	public Offer getOfferByID(@Named("id") Long id) {
		return findRecord(id);
	}

	/**
	 * This method is used for updating an existing entity. If the entity does
	 * not exist in the datastore, an exception is thrown. It uses HTTP PUT
	 * method.
	 *
	 * @param Offer
	 *            the entity to be updated.
	 * @return The updated entity.
	 * @throws NotFoundException
	 */
	@ApiMethod(name = "updateOffer")
	public Offer updateOffer(Offer Offer) throws NotFoundException {
		Offer record = findRecord(Offer.getId());
		if (record == null) {
			throw new NotFoundException("Record does not exist");
		}
		ofy().save().entities(Offer).now();
		return Offer;
	}

	/**
	 * This method removes the entity with primary key id. It uses HTTP DELETE
	 * method.
	 *
	 * @param id
	 *            the primary key of the entity to be deleted.
	 * @throws NotFoundException
	 */
	@ApiMethod(name = "removeOffer")
	public void removeOffer(@Named("id") Long id) throws NotFoundException {
		Offer record = findRecord(id);
		if (record == null) {
			throw new NotFoundException("Record does not exist");
		}
		ofy().delete().entity(record).now();
	}

	private Offer findRecord(Long id) {
		return ofy().load().type(Offer.class).id(id).now();
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity
	 * already exists in the datastore, an exception is thrown. It uses HTTP
	 * POST method.
	 *
	 * @param Offer
	 *            the entity to be inserted.
	 * @return The inserted entity.
	 * @throws ConflictException
	 */
	//@ApiMethod(name = "insertOffer")
	private Offer insertOffer(Offer offer) throws NotFoundException,
			ConflictException {
		if (offer.getId() != null) {
			if (findRecord(offer.getId()) != null) {
				throw new ConflictException("Object already exists");
			}
		}
		ofy().save().entities(offer).now();
		return offer;
	}

	private Offer createOfferDTO(OfferDTO offerDto) throws NotFoundException,
			ConflictException {
		Offer o = new Offer();
		o.setAmount(offerDto.getAmount());
		o.setCreatedDate(offerDto.getCreatedDate());
		o.setDescription(offerDto.getDescription());
		o.setExpiryDate(offerDto.getExpiryDate());
		o.setInterest(offerDto.getInterest());
		
		Member member = SearchMemberByEmail(offerDto.getEmail());
		
		o.setMember(member);
		o.setOfferees(offerDto.getOfferees());
		o.setOfferType(offerDto.getOfferType());
		o.setPartialPay(offerDto.isPartialPay());
		o.setPublicOffer(offerDto.isPublicOffer());
		o.setStatus(offerDto.getStatus());
		o.setTerm(offerDto.getTerm());
		return insertOffer(o);
	}

	@ApiMethod(name = "MakeOffer")
	public Offer MakeOffer( OfferDTO offerDto) throws NotFoundException,
			ConflictException, ForbiddenException {
		if(offerDto.getOfferType().toUpperCase().equals("L"))
		{
			return MakeLendOffer( offerDto);
		}
		else
		{
			return MakeBorrowOffer( offerDto);
		}
	}
	
	private Offer MakeBorrowOffer(OfferDTO offerModel) throws NotFoundException, ConflictException
    {
		return  createOfferDTO(offerModel);
    }
	private Offer MakeLendOffer(OfferDTO offerModel) throws ForbiddenException, NotFoundException, ConflictException
    {
        // Step 1 - Block funds.
        Member member = SearchMemberByEmail(offerModel.getEmail());

        // calls GLs funds block service.
        AccountEndpoint sPostingClient = new AccountEndpoint();
        if (GLUtil.GetAvailableBalance(member.getCurrentAccount()) < offerModel.getAmount())
            throw new ForbiddenException("Insufficient funds");

        //BlockFunds function checks all account status before the actual block
        sPostingClient.BlockFunds(member.getCurrentAccount(), offerModel.getAmount());


        // Step 2 - Calling Create on Offer.

        return  createOfferDTO(offerModel);
    }
	

	private Member SearchMember(Long MemberId) {
		MemberEndpoint mep = new MemberEndpoint();
		Member member = mep.getMemberByID(MemberId);
		return member;
	}


}