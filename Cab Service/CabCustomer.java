package com.akshu.methods_collection;

public class CabCustomer 
{
	private Integer custId ;
	private String custName ;
	private String pickupLocation ;
	private String dropLocation ;
	private Integer distance ;
	private String phoneNumber ;
	
	public CabCustomer()
	{
	}
	
	public CabCustomer(Integer custId, String custName, String pickupLocation, String dropLocation, Integer distance,
			String phoneNumber) 
	{
		super();
		this.custId = custId;
		this.custName = custName;
		this.pickupLocation = pickupLocation;
		this.dropLocation = dropLocation;
		this.distance = distance;
		this.phoneNumber = phoneNumber;
	}

	public Integer getCustId()
	{
		return custId;
	}

	public String getCustName() {
		return custName;
	}

	public String getPickupLocation() {
		return pickupLocation;
	}

	public String getDropLocation() {
		return dropLocation;
	}

	public Integer getDistance() {
		return distance;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
	
	
	
	
}
