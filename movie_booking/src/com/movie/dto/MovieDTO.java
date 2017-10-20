package com.movie.dto;

public class MovieDTO {
	
	private String mv_code;//코드번호
	private String mv_title;//영화제목
	private String mv_director;//감독 
	private String mv_cast;//배우
	private String mv_imglink1;//이미지경로
	private String mv_synopsis;//줄거리
	public String getMv_code() {
		return mv_code;
	}
	public void setMv_code(String mv_code) {
		this.mv_code = mv_code;
	}
	public String getMv_title() {
		return mv_title;
	}
	public void setMv_title(String mv_title) {
		this.mv_title = mv_title;
	}

	public String getMv_director() {
		return mv_director;
	}
	public void setMv_director(String mv_director) {
		this.mv_director = mv_director;
	}
	public String getMv_cast() {
		return mv_cast;
	}
	public void setMv_cast(String mv_cast) {
		this.mv_cast = mv_cast;
	}
	public String getMv_imglink1() {
		return mv_imglink1;
	}
	public void setMv_imglink1(String mv_imglink1) {
		this.mv_imglink1 = mv_imglink1;
	}
	public String getMv_synopsis() {
		return mv_synopsis;
	}
	public void setMv_synopsis(String mv_synopsis) {
		this.mv_synopsis = mv_synopsis;
	}
	@Override
	public String toString() {
		return "MovieDTO [mv_code=" + mv_code + ", mv_title=" + mv_title + ", mv_director=" + mv_director + ", mv_cast="
				+ mv_cast + ", mv_imglink1=" + mv_imglink1 + ", mv_synopsis=" + mv_synopsis + "]";
	}


	

	 
}
