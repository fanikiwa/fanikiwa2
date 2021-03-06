package com.sp.fanikiwa.api;

import static com.sp.fanikiwa.api.OfyService.ofy;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.google.api.server.spi.config.Nullable;
import com.google.api.server.spi.response.CollectionResponse;
import com.google.api.server.spi.response.ConflictException;
import com.google.api.server.spi.response.NotFoundException;
import com.google.appengine.api.datastore.Cursor;
import com.google.appengine.api.datastore.QueryResultIterator;
import com.googlecode.objectify.cmd.Query;
import com.sp.fanikiwa.Enums.AccountLimitStatus;
import com.sp.fanikiwa.entity.Account;
import com.sp.fanikiwa.entity.AccountType;
import com.sp.fanikiwa.entity.Coadet;
import com.sp.fanikiwa.entity.Customer;
import com.sp.fanikiwa.entity.Member;
import com.sp.fanikiwa.entity.MemberDTO;
import com.sp.fanikiwa.entity.Organization;
import com.sp.fanikiwa.entity.Userprofile;
import com.sp.utils.Config;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.inject.Named;

@Api(name = "memberendpoint", namespace = @ApiNamespace(ownerDomain = "sp.com", ownerName = "sp.com", packagePath = "fanikiwa.entity"))
public class MemberEndpoint {

	/**
	 * This method lists all the entities inserted in datastore. It uses HTTP
	 * GET method and paging support.
	 *
	 * @return A CollectionResponse class containing the list of all entities
	 *         persisted and a cursor to the next page.
	 */
	@SuppressWarnings({ "unchecked", "unused" })
	@ApiMethod(name = "listMember")
	public CollectionResponse<Member> listMember(
			@Nullable @Named("cursor") String cursorString,
			@Nullable @Named("count") Integer count) {

		Query<Member> query = ofy().load().type(Member.class);
		if (count != null)
			query.limit(count);
		if (cursorString != null && cursorString != "") {
			query = query.startAt(Cursor.fromWebSafeString(cursorString));
		}

		List<Member> records = new ArrayList<Member>();
		QueryResultIterator<Member> iterator = query.iterator();
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
		return CollectionResponse.<Member> builder().setItems(records)
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
	@ApiMethod(name = "getMemberByID")
	public Member getMemberByID(@Named("id") Long id) {
		return findRecord(id);
	}

	/**
	 * This inserts a new entity into App Engine datastore. If the entity
	 * already exists in the datastore, an exception is thrown. It uses HTTP
	 * POST method.
	 *
	 * @param Member
	 *            the entity to be inserted.
	 * @return The inserted entity.
	 * @throws ConflictException
	 */
	// @ApiMethod(name = "insertMember")

	/**
	 * This method is used for updating an existing entity. If the entity does
	 * not exist in the datastore, an exception is thrown. It uses HTTP PUT
	 * method.
	 *
	 * @param Member
	 *            the entity to be updated.
	 * @return The updated entity.
	 * @throws NotFoundException
	 */
	@ApiMethod(name = "updateMember")
	public Member updateMember(Member Member) throws NotFoundException {
		Member record = findRecord(Member.getMemberId());
		if (record == null) {
			throw new NotFoundException("Record does not exist");
		}
		ofy().save().entities(Member).now();
		return Member;
	}

	/**
	 * This method removes the entity with primary key id. It uses HTTP DELETE
	 * method.
	 *
	 * @param id
	 *            the primary key of the entity to be deleted.
	 * @throws NotFoundException
	 */
	@ApiMethod(name = "removeMember")
	public void removeMember(@Named("id") Long id) throws NotFoundException {
		Member record = findRecord(id);
		if (record == null) {
			throw new NotFoundException("Record does not exist");
		}
		ofy().delete().entity(record).now();
	}

	private Member findRecord(Long id) {
		return ofy().load().type(Member.class).id(id).now();
	}

	private Member insertMember(Member member) throws ConflictException {
		if (member.getMemberId() != null) {
			if (findRecord(member.getMemberId()) != null) {
				throw new ConflictException("Object already exists");
			}
		}
		ofy().save().entities(member).now();
		return member;
	}

	// Non CRUD
	@ApiMethod(name = "GetMemberByEmail")
	public Member GetMemberByEmail(@Named("email") String email) {
		return ofy().load().type(Member.class)
				.filter("email", email).first()
				.now();
	}

	@ApiMethod(name = "Register")
	public Member Register(MemberDTO memberDTO) throws ConflictException,
			NotFoundException {

		// Create the user
		Userprofile user = new Userprofile();
		user.setCreateDate(new Date());
		user.setPwd(memberDTO.getPwd()); // think of encrypting
		user.setUserId(memberDTO.getEmail());
		user.setTelephone(memberDTO.getTelephone());

		UserprofileEndpoint upep = new UserprofileEndpoint();
		upep.insertUserprofile(user);
  
		Customer customer = new Customer();
		// at this point, fill the customer with the details from the UI
		customer.setName(memberDTO.getSurname());
		customer.setEmail(memberDTO.getEmail());
		customer.setTelephone(memberDTO.getTelephone());
		customer.setCreatedDate(new Date());
		customer.setOrganization(new Organization(Config.GetLong("CURRENT_ORG")));

		CustomerEndpoint cep = new CustomerEndpoint();
		Customer customerReturned = cep.insertCustomer(customer);

		// Step 3. Create 3 accounts. Currentaccount, loanaccount and
		// invesmentaccount using the customerReturned
		Account currentAccount = new Account();
		currentAccount.setAccountName(customerReturned.getName() + " Curr A/c");
		currentAccount.setCustomer(customerReturned);
		currentAccount.setCoadet(new Coadet(Config
				.GetLong("CURRENT_ACC_COA_ID")));
		currentAccount.setAccounttype(new AccountType(Config
				.GetLong("CURRENT_ACC_TYPE_ID"))); 
		currentAccount.setBookBalance(0.00);
		currentAccount.setClearedBalance(0.00);
		currentAccount.setLimit(0.00);
		currentAccount.setInterestRate(0.00);
		currentAccount.setAccruedInt(0.00);
		currentAccount
				.setLimitFlag(AccountLimitStatus.PostingOverDrawingProhibited
						.getValue());

		Account loanaccount = new Account();
		loanaccount.setAccountName(customerReturned.getName() + " Loan A/c");
		loanaccount.setCustomer(customerReturned);
		loanaccount.setCoadet(new Coadet(Config.GetLong("LOAN_ACC_COA_ID")));
		loanaccount.setAccounttype(new AccountType(Config
				.GetLong("LOAN_ACC_COA_ID"))); 
		loanaccount.setBookBalance(0.00);
		loanaccount.setClearedBalance(0.00);
		loanaccount.setLimit(0.00);
		loanaccount.setInterestRate(0.00);
		loanaccount.setAccruedInt(0.00);

		Account invesmentaccount = new Account();
		invesmentaccount.setAccountName(customerReturned.getName()
				+ " Investment A/c");
		invesmentaccount.setCustomer(customerReturned);
		invesmentaccount.setCoadet(new Coadet(Config
				.GetLong("INVESTMENT_ACC_COA_ID")));
		invesmentaccount.setAccounttype(new AccountType(Config
				.GetLong("INVESTMENT_ACC_TYPE_ID")));
		invesmentaccount.setBookBalance(0.00);
		invesmentaccount.setClearedBalance(0.00);
		invesmentaccount.setLimit(0.00);
		invesmentaccount.setInterestRate(0.00);
		invesmentaccount.setAccruedInt(0.00);
		invesmentaccount
				.setLimitFlag(AccountLimitStatus.PostingOverDrawingProhibited
						.getValue());

		AccountEndpoint aep = new AccountEndpoint();
		Account currentAccountReturned = aep.insertAccount(currentAccount);
		Account loanAccountReturned = aep.insertAccount(loanaccount);
		Account investmentAccountReturned = aep.insertAccount(invesmentaccount);

		// Step 4. Update the member account created in step1 with the three
		// accounts
		Member member = new Member();
		member.setEmail(memberDTO.getEmail());
		member.setPwd(memberDTO.getPwd());
		member.setTelephone(memberDTO.getTelephone());
		member.setSurname(memberDTO.getSurname());
		member.setDateJoined(new Date());
		member.setStatus("A");
		member.setCurrentAccount(currentAccountReturned);
		member.setLoanAccount(loanAccountReturned);
		member.setInvestmentAccount(investmentAccountReturned);
		member.setCustomer(customerReturned);
		Member newMember = insertMember(member);

		// Step 5. Update the customer id
		customerReturned.setMemberId(newMember.getMemberId());
		cep.updateCustomer(customerReturned);

		// Step 6. Create ROOT Mailing Group for member
		// MailingGroupsComponent mc = new MailingGroupsComponent();
		// mc.CreateRootMailingGroup(_Member.MemberId);

		return newMember;
	}

	@ApiMethod(name = "DeRegister")
	public void DeRegister(Member member) {
	}

	@ApiMethod(name = "getMemberByTelephone")
	public Member GetMemberByTelephone(@Named("telephone") String telephone) {
		return ofy().load().type(Member.class)
				.filter("telephone", telephone).first()
				.now();
	}

	@ApiMethod(name = "getMemberByNationalID", path="member/nationalid")
	public Member getMemberByNationalID(@Named("nationalId") String nationalId) {
		return ofy().load().type(Member.class)
				.filter("nationalID", nationalId).first()
				.now();
	}

}
