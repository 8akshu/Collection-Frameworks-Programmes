package com.akshu.methods_collection;

public class Hospital
{
	private Integer hospitalCode;
	private String hospitalName;
	private String listOfTreatment;
	private String contactPerson;
	private String contactNumber;
	private String location;

	public Hospital()
	{
		
	}
	
	public Hospital(Integer hospitalCode, String hospitalName, String contactPerson, String contactNumber,
			String location, String listOfTreatment) 
	{
		super();
		this.hospitalCode = hospitalCode;
		this.hospitalName = hospitalName;
		this.contactPerson = contactPerson;
		this.contactNumber = contactNumber;
		this.location = location;
		this.listOfTreatment = listOfTreatment;
	}
	
	public Integer getHospitalCode() {
		return hospitalCode;
	}

	public String getHospitalName() {
		return hospitalName;
	}

	public String getContactPerson() {
		return contactPerson;
	}

	public String getContactNumber() {
		return contactNumber;
	}

	public String getLocation() {
		return location;
	}

	public String getListOfTreatment() {
		return listOfTreatment;
	}

	@Override
	public String toString()
	{
		return "Hospital [hospitalCode=" + hospitalCode + ", hospitalName=" + hospitalName + ", contactPerson="
				+ contactPerson + ", contactNumber=" + contactNumber + ", location=" + location + ", listOfTreatment="
				+ listOfTreatment + "]";
	}

	public void setHospitalCode(Integer hospitalCode) {
		this.hospitalCode = hospitalCode;
	}

	public void setHospitalName(String hospitalName) {
		this.hospitalName = hospitalName;
	}

	public void setContactPerson(String contactPerson) {
		this.contactPerson = contactPerson;
	}

	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public void setListOfTreatment(String listOfTreatment) {
		this.listOfTreatment = listOfTreatment;
	}
}