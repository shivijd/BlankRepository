package com.capge.beans;

public class Country {
	public Country(String string, City city2) {
		// TODO Auto-generated constructor stub
		city=city2;
		CountryName=string;
	}
	public Country() {
		super();
	}
	@Override
	public String toString() {
		return "Country [CountryName=" + CountryName + ", city=" + city + "]";
	}
	private String CountryName;
	private City city;
	public String getCountryName() {
		return CountryName;
	}
	public void setCountryName(String countryName) {
		CountryName = countryName;
	}
	public City getCity() {
		return city;
	}
	public void setCity(City city) {
		this.city = city;
	}

}
