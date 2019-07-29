package com.app.model;

public class Address {
	private String hno;
	private String street;
	private String city;
	private String region;
	private String country;
	private String zip;
	public Address() {
		super();
	}
	public Address(String hno, String street, String city, String region, String country, String zip) {
		super();
		this.hno = hno;
		this.street = street;
		this.city = city;
		this.region = region;
		this.country = country;
		this.zip = zip;
	}
	public String getHno() {
		return hno;
	}
	public void setHno(String hno) {
		this.hno = hno;
	}
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", street=" + street + ", city=" + city + ", region=" + region + ", country="
				+ country + ", zip=" + zip + "]";
	}
	
}
