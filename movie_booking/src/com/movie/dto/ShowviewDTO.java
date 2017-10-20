package com.movie.dto;

public class ShowviewDTO {
	private String sh_code;
	private String mv_code;
	private String sr_code;
	private String th_name;
	private String sr_name;
	private int showtime;
	private String sh_status;
	
	public String getSh_code() {
		return sh_code;
	}
	public void setSh_code(String sh_code) {
		this.sh_code = sh_code;
	}
	public String getSr_code() {
		return sr_code;
	}
	public void setSr_code(String sr_code) {
		this.sr_code = sr_code;
	}
	public String getTh_name() {
		return th_name;
	}
	public void setTh_name(String th_name) {
		this.th_name = th_name;
	}
	public String getSr_name() {
		return sr_name;
	}
	public void setSr_name(String sr_name) {
		this.sr_name = sr_name;
	}
	
	public int getShowtime() {
		return showtime;
	}
	public void setShowtime(int showtime) {
		this.showtime = showtime;
	}
	public String getSh_status() {
		return sh_status;
	}
	public void setSh_status(String sh_status) {
		this.sh_status = sh_status;
	}
	public String getMv_code() {
		return mv_code;
	}
	public void setMv_code(String mv_code) {
		this.mv_code = mv_code;
	}
	
	@Override
	public String toString() {
		return "ShowviewDTO [sh_code=" + sh_code + ", mv_code=" + mv_code + ", sr_code=" + sr_code + ", th_name="
				+ th_name + ", sr_name=" + sr_name + ", showtime=" + showtime + ", sh_status=" + sh_status + "]";
	}
	
	
}
