package com.inheritance;

public class Address {
	
	private String Addressline1;
	private String Addressline2;
	private String city;
	private String District;
	private String state;
	private int pincode;
	
	public void setAddressline1(String Addressline1) {
		
		this.Addressline1=Addressline1;
		
	}
	
	public String getAddressline1() {
		return Addressline1;
		
		

	}
	
	public void setAddressline2(String addressline2) {
		this.Addressline2=Addressline2;
		
		
		
	}
	
	public String getAddressline2() {
		return Addressline2;
	}
	
	public void setcity(String city) {
		this.city=city;
		
	}
	public String city() {
		return city;
		
	}
	
	public void setDistrict(String District) {
		this.District=District;
		
		
	}
	public String getDistrict() {
		return District;
	}
	
	public void setstate(String state) {
		this.state=state;
		
	}
	
	public String getState() {
		return state;
		
	}
	
	public void setpincode(int pincode) {
		this.pincode=pincode;
		
	}
	
	public int getpincode() {
		return pincode;
	}
	
}
