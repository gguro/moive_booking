package com.movie.dto;

public class SeatDTO {
	private String seatCode;		// ST_CODE
	private int showTime;			// SHOWTIME
	private int seatNumber;			// ST_SEQ
	private int seatUseYN;			// ST_USEYN
	private String threaterCode;	// TH_CODE
	private String showroomCode;	// SR_CODE
	public String getSeatCode() {
		return seatCode;
	}
	public void setSeatCode(String seatCode) {
		this.seatCode = seatCode;
	}
	public int getShowTime() {
		return showTime;
	}
	public void setShowTime(int showTime) {
		this.showTime = showTime;
	}
	public int getSeatNumber() {
		return seatNumber;
	}
	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}
	public int getSeatUseYN() {
		return seatUseYN;
	}
	public void setSeatUseYN(int seatUseYN) {
		this.seatUseYN = seatUseYN;
	}
	public String getThreaterCode() {
		return threaterCode;
	}
	public void setThreaterCode(String threaterCode) {
		this.threaterCode = threaterCode;
	}
	public String getShowroomCode() {
		return showroomCode;
	}
	public void setShowroomCode(String showroomCode) {
		this.showroomCode = showroomCode;
	}
	
	@Override
	public String toString() {
		return "SeatDTO [seatCode=" + seatCode + ", showTime=" + showTime + ", seatNumber=" + seatNumber
				+ ", seatUseYN=" + seatUseYN + ", threaterCode=" + threaterCode + ", showroomCode=" + showroomCode
				+ "]";
	}
	
	
	
	
}
