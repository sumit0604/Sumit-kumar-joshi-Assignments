package com.shoppingcart.profileservice.model;

public class UserProfileAddress {
	
	private int houseNumber;
	private String streetName;
	private String colonyName;
	private String city;
	private String state;
	private int pincode;
	
	
	public UserProfileAddress() {
		super();
		// TODO Auto-generated constructor stub
	}


	public UserProfileAddress(int houseNumber, String streetName, String colonyName, String city, String state,
			int pincode) {
		super();
		this.houseNumber = houseNumber;
		this.streetName = streetName;
		this.colonyName = colonyName;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}


	public int getHouseNumber() {
		return houseNumber;
	}


	public void setHouseNumber(int houseNumber) {
		this.houseNumber = houseNumber;
	}


	public String getStreetName() {
		return streetName;
	}


	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}


	public String getColonyName() {
		return colonyName;
	}


	public void setColonyName(String colonyName) {
		this.colonyName = colonyName;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public int getPincode() {
		return pincode;
	}


	public void setPincode(int pincode) {
		this.pincode = pincode;
	}


	@Override
	public String toString() {
		return "UserProfileAddress [houseNumber=" + houseNumber + ", streetName=" + streetName + ", colonyName="
				+ colonyName + ", city=" + city + ", state=" + state + ", pincode=" + pincode + "]";
	}
	
	
	
	
}
