package com.sp.fanikiwa.business.MakeOffer;

import java.util.List;

import com.sp.fanikiwa.entity.Member;

public class GroupOfferee  extends Offeree {
	private String GroupName;
	private List<Member> members;	
		
	public GroupOfferee(String groupName) {
		super();
		GroupName = groupName;
		//Fill Members
		FillMembers(groupName);
	}
	

	public String getGroupName() {
		return GroupName;
	}
	public void setGroupName(String groupName) {
		GroupName = groupName;
	}
	public List<Member> getMembers() {
		return members;
	}

	//called recursively
	private void FillMembers(String groupname)
	{
		
	}

}
