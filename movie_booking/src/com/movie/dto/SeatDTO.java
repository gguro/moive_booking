package com.movie.dto;

public class SeatDTO {
	private String st_code;
	private String sh_code;
	private String st_col;
	private int st_row;
	private int st_useyn;
	public String getSt_code() {
		return st_code;
	}
	public void setSt_code(String st_code) {
		this.st_code = st_code;
	}
	public String getSh_code() {
		return sh_code;
	}
	public void setSh_code(String sh_code) {
		this.sh_code = sh_code;
	}
	public String getSt_col() {
		return st_col;
	}
	public void setSt_col(String st_col) {
		this.st_col = st_col;
	}
	public int getSt_row() {
		return st_row;
	}
	public void setSt_row(int st_row) {
		this.st_row = st_row;
	}
	public int getSt_useyn() {
		return st_useyn;
	}
	public void setSt_useyn(int st_useyn) {
		this.st_useyn = st_useyn;
	}
	@Override
	public String toString() {
		return "SeatDTO [st_code=" + st_code + ", sh_code=" + sh_code + ", st_col=" + st_col + ", st_row=" + st_row
				+ ", st_useyn=" + st_useyn + "]";
	}

	
}
