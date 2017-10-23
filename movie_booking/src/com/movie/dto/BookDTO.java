package com.movie.dto;

public class BookDTO {

	private String bk_code;//예약번호
	private String userid;//아이디
	private String tk_code;//티켓번호 
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


	public String getTk_code() {
		return tk_code;
	}


	public void setTk_code(String tk_code) {
		this.tk_code = tk_code;
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
		return "Book [bk_code=" + bk_code + ", userid=" + userid + ", tk_code=" + tk_code + ", bk_date=" + bk_date
				+ ", bk_status=" + bk_status + "]";
	}
	
	

}
