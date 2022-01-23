package com.day3;

public class SpecialMovie extends Movie {
	
	private String soundEffects;
	private String visualEffets;
	public String getSoundEffects() {
		return soundEffects;
	}
	public void setSoundEffects(String soundEffects) {
		this.soundEffects = soundEffects;
	}
	public String getVisualEffets() {
		return visualEffets;
	}
	public void setVisualEffets(String visualEffets) {
		this.visualEffets = visualEffets;
	}
	
	public SpecialMovie(String mname, String produced, String directed, int duration, int year, String category,
			String soundEffects, String visualEffects) {
			super(mname, produced, directed, duration, year, category);
			// TODO Auto-generated constructor stub
			this.soundEffects = soundEffects;
			this.visualEffets = visualEffects;
			}
	@Override
	public String toString() {
		return "SpecialMovie [soundEffects=" + soundEffects + ", visualEffets=" + visualEffets + "]";
	}
	
}