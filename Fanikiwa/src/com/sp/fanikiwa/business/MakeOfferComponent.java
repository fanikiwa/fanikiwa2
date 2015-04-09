package com.sp.fanikiwa.business;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.io.*;

import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.response.ConflictException;
import com.google.api.server.spi.response.ForbiddenException;
import com.google.api.server.spi.response.NotFoundException;
import com.sp.fanikiwa.Enums.OffereeIdType;
import com.sp.fanikiwa.api.AccountEndpoint;
import com.sp.fanikiwa.api.MemberEndpoint;
import com.sp.fanikiwa.api.OfferEndpoint;
import com.sp.fanikiwa.business.MakeOffer.EmailOfferee;
import com.sp.fanikiwa.business.MakeOffer.GroupOfferee;
import com.sp.fanikiwa.business.MakeOffer.MemberOfferee;
import com.sp.fanikiwa.business.MakeOffer.Offeree;
import com.sp.fanikiwa.business.MakeOffer.OffereeToken;
import com.sp.fanikiwa.business.MakeOffer.TelephoneOfferee;
import com.sp.fanikiwa.entity.Member;
import com.sp.fanikiwa.entity.Offer;
import com.sp.fanikiwa.entity.OfferDTO;
import com.sp.fanikiwa.entity.OfferModel;
import com.sp.fanikiwa.entity.OfferReceipient;
import com.sp.utils.GLUtil;
import com.sp.utils.MailUtil;
import com.sp.utils.StringExtension;

public class MakeOfferComponent {

	private Offer createOfferDTO(OfferDTO offerDto) throws Exception {
		Offer o = new Offer();
		o.setAmount(offerDto.getAmount());
		o.setCreatedDate(offerDto.getCreatedDate());
		o.setDescription(offerDto.getDescription());
		o.setExpiryDate(offerDto.getExpiryDate());
		o.setInterest(offerDto.getInterest());

		Member member = SearchMemberByEmail(offerDto.getEmail());

		o.setMember(member);
		// o.setOfferees(offerDto.getOfferees());
		o.setOfferType(offerDto.getOfferType());
		o.setPartialPay(offerDto.isPartialPay());
		o.setPublicOffer(offerDto.isPublicOffer());
		o.setStatus(offerDto.getStatus());
		o.setTerm(offerDto.getTerm());

		// Create OffereeIds
		String delimiters = "\\,+|\\;+"; // | delimeted

		List<Member> offerees = new ArrayList<Member>();
		for (String s : offerDto.getOfferees().split(delimiters)) {
			List <Member> members = GetRecipient(s);
			if(members != null) offerees.addAll(members);
		}
		
		// Save offer and its receipients in a transaction
		Offer newOffer = InsertOffer(new OfferModel( o, offerees));

		return newOffer;
	}

	private List<Member> GetRecipient(String s) throws Exception {
		List<Member> members = new ArrayList<Member>();
		// create
		Offeree of = CreateOffereeFromString(s);

		// save
		if (of instanceof GroupOfferee) {
			GroupOfferee go = (GroupOfferee) of;
			for (Member m : go.getMembers()) {
				if(m != null)
				members.add(m);
			}
		} else if (of instanceof EmailOfferee) {
			EmailOfferee eo = (EmailOfferee) of;
			Member m = eo.getMember();
			if(m != null)
				members.add(m);
		} else if (of instanceof TelephoneOfferee) {
			TelephoneOfferee to = (TelephoneOfferee) of;
			Member m = to.getMember();
			if(m != null)
				members.add(m);
		} else if (of instanceof MemberOfferee) {
			MemberOfferee mo = (MemberOfferee) of;
			Member m = mo.getMember();
			if(m != null)
				members.add(m);
		}
		
		return members;
	}



	private Offeree CreateOffereeFromString(String s) throws Exception {
		OffereeToken ot = CreateOfferTokenFromString(s);
		if(ot != null)
		{
		switch (ot.getOffereeType()) {
		case Email:
			return StringExtension.parseObjectFromString(ot.getValue(),
					EmailOfferee.class);
		case Telephone:
			return StringExtension.parseObjectFromString(ot.getValue(),
					TelephoneOfferee.class);
		case Member:
			return StringExtension.parseObjectFromString(ot.getValue(),
					MemberOfferee.class);
		case Group:
			return StringExtension.parseObjectFromString(ot.getValue(),
					GroupOfferee.class);
		}
		}
		return null;
	}

	private OffereeToken CreateOfferTokenFromString(String s) {
		//checking simple syntaz
		//Scanner sc = new Scanner(s);
		//Email
		if (MailUtil.isValidEmailAddress(s))
			return new OffereeToken(OffereeIdType.Email, s);

		//Test telephone - startswith(T(Number)| 0 | +254 )
		if (StringExtension.isKenyaMobileNumber(s)  )
			return new OffereeToken(OffereeIdType.Telephone, s);
		
		//Test Member - M(Id)
		if (StringExtension.isNumeric(s))
				return new OffereeToken(OffereeIdType.Member, s);
				
		//Test Group - Any alphanumeric
		if (StringExtension.isAlphaNumeric(s))
		return new OffereeToken(OffereeIdType.Group, s);
		
		return null;
	}

	public Offer MakeOffer(OfferDTO offerDto) throws Exception {
		if (offerDto.getOfferType().toUpperCase().equals("L")) {
			return MakeLendOffer(offerDto);
		} else {
			return MakeBorrowOffer(offerDto);
		}
	}

	private Offer MakeBorrowOffer(OfferDTO offerModel) throws Exception {
		return createOfferDTO(offerModel);
	}

	private Offer MakeLendOffer(OfferDTO offerModel) throws Exception {
		// Step 1 - Block funds.
		Member member = SearchMemberByEmail(offerModel.getEmail());

		// calls GLs funds block service.
		AccountEndpoint sPostingClient = new AccountEndpoint();
		if (GLUtil.GetAvailableBalance(member.getCurrentAccount()) < offerModel
				.getAmount())
			throw new ForbiddenException("Insufficient funds");

		// BlockFunds function checks all account status before the actual block
		sPostingClient.BlockFunds(member.getCurrentAccount(),
				offerModel.getAmount());

		// Step 2 - Calling Create on Offer.

		return createOfferDTO(offerModel);
	}

	private Member SearchMember(Long MemberId) {
		MemberEndpoint mep = new MemberEndpoint();
		Member member = mep.getMemberByID(MemberId);
		return member;
	}

	private Member SearchMemberByEmail(String email) {
		MemberEndpoint mep = new MemberEndpoint();
		Member member = mep.GetMemberByEmail(email);
		return member;
	}

	private Offer InsertOffer(OfferModel offerModel) throws NotFoundException,
			ConflictException {
		OfferEndpoint oep = new OfferEndpoint();
		return oep.saveOffer(offerModel);
	}

}
