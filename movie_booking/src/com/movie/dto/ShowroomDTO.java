package com.movie.dto;

public class ShowroomDTO {
	private String theaterCode;		// TH_CODE
	private String showroomCode;	// SR_CODE
	private String showroomName;	// SR_NAME
	private int showroomCapacity;	// SR_CAPACITY
	public String getTheaterCode() {
		return theaterCode;
	}
	public void setTheaterCode(String theaterCode) {
		this.theaterCode = theaterCode;
	}
	public String getShowroomCode() {
		return showroomCode;
	}
	public void setShowroomCode(String showroomCode) {
		this.showroomCode = showroomCode;
	}
	public String getShowroomName() {
		return showroomName;
	}
	public void setShowroomName(String showroomName) {
		this.showroomName = showroomName;
	}
	public int getShowroomCapacity() {
		return showroomCapacity;
	}
	public void setShowroomCapacity(int showroomCapacity) {
		this.showroomCapacity = showroomCapacity;
	}
	@Override
	public String toString() {
		return "ShowroomDTO [theaterCode=" + theaterCode + ", showroomCode=" + showroomCode + ", showroomName="
				+ showroomName + ", showroomCapacity=" + showroomCapacity + "]";
	}
	
}
