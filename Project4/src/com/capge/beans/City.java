package com.capge.beans;

public class City {
private String cityname;

public String getCityName() {
	return cityname;
}

@Override
public String toString() {
	return "City [cityname=" + cityname + "]";
}

public void setCityName(String name) {
	this.cityname = name;
}

public City(String name) {
	super();
	this.cityname = name;
}






}
