package com.stylemaxz.springdemo.mvc;

import java.util.LinkedHashMap;

public class Student {

	private String firstName;
	private String lastName;
	private String country;
	
	private LinkedHashMap<String,String> countryOptions;
	
	private String favoriteLanguage;
	
	private String[] os;
	
	public Student(){
		
		//populate country option: used ISO country code
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("br", "Brazil");
		countryOptions.put("th", "Thailand");
		countryOptions.put("sp", "Spain");
		
	}
	
	

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOs() {
		return os;
	}

	public void setOs(String[] os) {
		this.os = os;
	}
	
}
