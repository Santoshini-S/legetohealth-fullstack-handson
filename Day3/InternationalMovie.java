package com.day3;

public class InternationalMovie extends Movie {
	
	private String country;
	private String language;
	public InternationalMovie(String mname, String produced, String directed, int duration, int year,
			String category, String country, String language) {
			super(mname, produced, directed, duration, year, category);
			this.country = country;
			this.language = language;
			// TODO Auto-generated constructor stub
			}
	// public InternationalMovie(String mname, String produced, String country, String language) {
	// super(movieName, produced);
	// this.country = country;
	// this.language = language;
	// }
	
	
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getLanguage() {
		return language;
	}
	public void setLanguage(String language) {
		this.language = language;
	}
	

}



