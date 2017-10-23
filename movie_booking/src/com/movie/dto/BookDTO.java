package com.movie.dto;

public class BookDTO {

	private String bk_code;//예약번호
	private String userid;//아이디
	private String st_code;//좌석번호 
	private String bk_date;//예약일
	private String bk_status;//상태
	
	public String getBk_code() {
		return bk_code;
	}

	public void setBk_code(String bk_code) {
		this.bk_code = bk_code;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}


	public String getSt_code() {
		return st_code;
	}


	public void setSt_code(String st_code) {
		this.st_code = st_code;
	}


	public String getBk_date() {
		return bk_date;
	}


	public void setBk_date(String bk_date) {
		this.bk_date = bk_date;
	}


	public String getBk_status() {
		return bk_status;
	}


	public void setBk_status(String bk_status) {
		this.bk_status = bk_status;
	}


	@Override
	public String toString() {
		return "Book [bk_code=" + bk_code + ", userid=" + userid + ", st_code=" + st_code + ", bk_date=" + bk_date
				+ ", bk_status=" + bk_status + "]";
	}
	
	

}
