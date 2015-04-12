package com.sp.fanikiwa.business.MakeOffer;

import com.sp.fanikiwa.api.MemberEndpoint;
import com.sp.fanikiwa.entity.Member;

public class EmailOfferee extends Offeree {

	private String Email;
	public EmailOfferee(String Email) {
		super();
		this.Email = Email;
	}
	private Member Member = null;
	public Member getMember() {
		return Member;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String Email) {
		this.Email = Email;
		MemberEndpoint mep = new MemberEndpoint();
		this.Member = mep.GetMemberByEmail(Email);
	}
	
}
