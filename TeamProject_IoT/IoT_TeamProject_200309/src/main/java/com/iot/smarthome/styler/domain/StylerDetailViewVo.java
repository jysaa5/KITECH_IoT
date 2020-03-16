package com.iot.smarthome.styler.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

//BoardDetailViewVo: 게시글을 자세히 보기 위해 저장되어 있던 데이터를 담는 도메인 클래스
public class StylerDetailViewVo {

	
	private int stylerIdx;  //게시글 번호
	private String stylerUser;  //게시글 사진제목 데이터
	private String stylerPhoto;  //게시글 사진제목 데이터
	private MultipartFile photo;  //게시글 사진 데이터
	private Date stylerOn;  //게시글 작성 날짜
	
	//<생성자>//
	//기본 생성자
	public StylerDetailViewVo() {
		super();
	}

	public StylerDetailViewVo(int stylerIdx, String stylerUser, String stylerPhoto, MultipartFile photo,
			Date stylerOn) {
		super();
		this.stylerIdx = stylerIdx;
		this.stylerUser = stylerUser;
		this.stylerPhoto = stylerPhoto;
		this.photo = photo;
		this.stylerOn = stylerOn;
	}
	
	
	
	

	public int getStylerIdx() {
		return stylerIdx;
	}

	public void setStylerIdx(int stylerIdx) {
		this.stylerIdx = stylerIdx;
	}

	public String getStylerUser() {
		return stylerUser;
	}

	public void setStylerUser(String stylerUser) {
		this.stylerUser = stylerUser;
	}

	public String getStylerPhoto() {
		return stylerPhoto;
	}

	public void setStylerPhoto(String stylerPhoto) {
		this.stylerPhoto = stylerPhoto;
	}

	public MultipartFile getPhoto() {
		return photo;
	}

	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}

	public Date getStylerOn() {
		return stylerOn;
	}

	public void setStylerOn(Date stylerOn) {
		this.stylerOn = stylerOn;
	}

	
	
	@Override
	public String toString() {
		return "StylerDetailViewVo [stylerIdx=" + stylerIdx + ", stylerUser=" + stylerUser + ", stylerPhoto="
				+ stylerPhoto + ", photo=" + photo + ", stylerOn=" + stylerOn + "]";
	}
	
	
	

	
	

	
}//BoardDetailViewVo 클래스 끝
