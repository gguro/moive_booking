package com.movie.dto;

public class TheaterDTO {
	private String theaterCode;
	private String theaterName;
	private String theaterLocation;
	
	public String getTheaterCode() {
		return theaterCode;
	}
	public void setTheaterCode(String theaterCode) {
		this.theaterCode = theaterCode;
	}
	public String getTheaterName() {
		return theaterName;
	}
	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	public String getTheaterLocation() {
		return theaterLocation;
	}
	public void setTheaterLocation(String theaterLocation) {
		this.theaterLocation = theaterLocation;
	}
	@Override
	public String toString() {
		return "TheaterDTO [theaterCode=" + theaterCode + ", theaterName=" + theaterName + ", theaterLocation="
				+ theaterLocation + "]";
	}
	
}
