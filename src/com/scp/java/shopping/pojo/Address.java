package com.scp.java.shopping.pojo;

public class Address {
	private int pincode;
	private String cityName;
	private String stateName;
	private String countryName;
	
	
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getStateName() {
		return stateName;
	}
	public void setStateName(String stateName) {
		this.stateName = stateName;
	}
	public String getCountryName() {
		return countryName;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int pincode, String cityName, String stateName, String countryName) {
		super();
		this.pincode = pincode;
		this.cityName = cityName;
		this.stateName = stateName;
		this.countryName = countryName;
	}
	
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", cityName=" + cityName + ", stateName=" + stateName + ", countryName="
				+ countryName + "]";
	}

}
