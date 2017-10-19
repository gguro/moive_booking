package com.movie.dto;

public class ShowDTO {
	private String SH_CODE;
	private String SH_STATUS;
	private String MV_CODE;
	private String TH_CODE;
	private String SR_CODE;
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
	public String getMV_CODE() {
		return MV_CODE;
	}
	public void setMV_CODE(String mV_CODE) {
		MV_CODE = mV_CODE;
	}
	public String getTH_CODE() {
		return TH_CODE;
	}
	public void setTH_CODE(String tH_CODE) {
		TH_CODE = tH_CODE;
	}
	public String getSR_CODE() {
		return SR_CODE;
	}
	public void setSR_CODE(String sR_CODE) {
		SR_CODE = sR_CODE;
	}
	@Override
	public String toString() {
		return "ShowDTO [SH_CODE=" + SH_CODE + ", SH_STATUS=" + SH_STATUS + ", MV_CODE=" + MV_CODE + ", TH_CODE="
				+ TH_CODE + ", SR_CODE=" + SR_CODE + "]";
	}
	
	
}
