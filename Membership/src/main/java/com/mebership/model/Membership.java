 package com.mebership.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="membership")
public class Membership {
	//@Id
	String  membershipName;
	String Freewash;
	String polishing;
	public Membership() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Membership(String membershipName, String Freewash, String polishing) {
		super();
		this.membershipName = membershipName;
		this.Freewash = Freewash;
		this.polishing = polishing;
	}
	public String getMembershipName() {
		return membershipName;
	}
	public void setMembershipName(String membershipName) {
		this.membershipName = membershipName;
	}
	public String getFreewash() {
		return Freewash;
	}
	public void setFreewash(String freewash) {
		this.Freewash = freewash;
	}
	public String getPolishing() {
		return polishing;
	}
	public void setPolishing(String polishing) {
		this.polishing = polishing;
	}
	@Override
	public String toString() {
		return "Membership [membershipName=" + membershipName + ", Freewash=" + Freewash + ", polishing=" + polishing
				+ "]";
	}
	
	
	
	
	
	
}
