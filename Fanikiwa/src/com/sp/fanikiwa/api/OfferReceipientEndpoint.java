package com.sp.fanikiwa.api;

import com.sp.fanikiwa.entity.Member;
import com.sp.fanikiwa.entity.Offer;
import com.sp.fanikiwa.entity.OfferReceipient;

public class OfferReceipientEndpoint {

	public void insertOfferReceipient(OfferReceipient or) {
		// TODO Auto-generated method stub
		
		//Make sure it is idempotent
	}

	public boolean isOfferAvaiable(Offer offer, Member member) {
		// TODO Auto-generated method stub
		return false;
	}
	

}
