package com.capge.beans;

public class Address {
private String AdressLine;
private Country country;
public Address(String string, Country country2) {
	// TODO Auto-generated constructor stub
	AdressLine=string;
	country=country2;
}
public Address() {
	super();
}
public String getAdressLine() {
	return AdressLine;
}
public void setAdressLine(String adressLine) {
	AdressLine = adressLine;
}
public Country getCountry() {
	return country;
}
public void setCountry(Country country) {
	this.country = country;
}
@Override
public String toString() {
	return "Address [AdressLine=" + AdressLine + ", country=" + country + "]";
}

}
