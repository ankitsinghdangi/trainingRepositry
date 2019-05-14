package com.carwash.demo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="MemberShip")
public class Membership 
{
	private String MemberShipName;
	private String Washing;
	private String Polishing;
	
	public Membership() 
	{
		super();
		
	}
	
	public Membership(String memberShipName, String washing, String polishing)
	{
		super();
		MemberShipName = memberShipName;
		Washing = washing;
		Polishing = polishing;
	}
	
	public String getMemberShipName()
	{
		return MemberShipName;
	}
	
	public void setMemberShipName(String memberShipName)
	{
		MemberShipName = memberShipName;
	}
	
	public String getWashing()
	{
		return Washing;
	}
	
	public void setWashing(String washing) 
	{
		Washing = washing;
	}
	
	public String getPolishing() 
	{
		return Polishing;
	}
	
	public void setPolishing(String polishing) 
	{
		Polishing = polishing;
	}
	
	@Override
	public String toString() 
	{
		return "Membership [MemberShipName=" + MemberShipName + ", Washing=" + Washing + ", Polishing=" + Polishing
				+ "]";
	}

}
