package com.movie.dto;

public class ShowFullDTO {
	private String SH_CODE;
	private String SH_STATUS;
	
	private MovieDTO mvDTO;
	private TheaterDTO thDTO;
	private ShowroomDTO shDTO;
	
	public String getSH_CODE() {
		return SH_CODE;
	}
	public void setSH_CODE(String sH_CODE) {
		SH_CODE = sH_CODE;
	}
	public String getSH_STATUS() {
		return SH_STATUS;
	}
	public void setSH_STATUS(String sH_STATUS) {
		SH_STATUS = sH_STATUS;
	}
	public MovieDTO getMvDTO() {
		return mvDTO;
	}
	public void setMvDTO(MovieDTO mvDTO) {
		this.mvDTO = mvDTO;
	}
	public TheaterDTO getThDTO() {
		return thDTO;
	}
	public void setThDTO(TheaterDTO thDTO) {
		this.thDTO = thDTO;
	}
	public ShowroomDTO getShDTO() {
		return shDTO;
	}
	public void setShDTO(ShowroomDTO shDTO) {
		this.shDTO = shDTO;
	}
	@Override
	public String toString() {
		return "ShowDTO [SH_CODE=" + SH_CODE 
				+ ", SH_STATUS=" + SH_STATUS 
				+ ", MV_NAME = " + mvDTO.getTitle() 
				+ ", TH_NAME = " + thDTO.getTheaterName()
				+ ", SH_NAME = " + shDTO.getShowroomName() + "]";
	}
	
	
	
}