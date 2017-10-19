package com.movie.dto;

public class MovieDTO {
	private int code;//코드번호
	private String title;//영화제목
	private String grade;//평점
	private String director;//감독 
	private String actor;//배우
	private String synopsis;//줄거리
	private String image;//이미지경로
	public String getTitle() {
		return title;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public String getActor() {
		return actor;
	}
	public void setActor(String actor) {
		this.actor = actor;
	}
	public String getSynopsis() {
		return synopsis;
	}
	public void setSynopsis(String synopsis) {
		this.synopsis = synopsis;
	}
	@Override
	public String toString() {
		return "MovieDTO [code=" + code + ", title=" + title + ", grade=" + grade + ", director=" + director
				+ ", actor=" + actor + ", synopsis=" + synopsis + ", image=" + image + "]";
	}
	
	
	 
}
