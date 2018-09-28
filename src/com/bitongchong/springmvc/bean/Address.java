package com.bitongchong.springmvc.bean;

public class Address {
	private String city;
	private int price;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Address(String city, int price) {
		super();
		this.city = city;
		this.price = price;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Address [city=" + city + ", price=" + price + "]";
	}

}
