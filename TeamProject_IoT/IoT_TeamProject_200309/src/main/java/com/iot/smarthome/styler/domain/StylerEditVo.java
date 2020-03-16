package com.iot.smarthome.styler.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;


//BoardEditVo: 게시글을 수정했을 때의 각각의 정보를 담는 도메인 클래스 
public class StylerEditVo {
	
	private int stylerIdx;  //게시글 번호
	private String stylerUser;  //게시글 사진제목 데이터
	private String stylerPhoto;  //게시글 사진제목 데이터
	private MultipartFile photo;  //게시글 사진 데이터
	private Date stylerOn;  //게시글 작성 날짜
	
	
	
	//<생성자>//
	//기본 생성자
	public StylerEditVo() {
		super();
	}
	







	public StylerEditVo(int stylerIdx, String stylerUser, String stylerPhoto, MultipartFile photo, Date stylerOn) {
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
		return "StylerEditVo [stylerIdx=" + stylerIdx + ", stylerUser=" + stylerUser + ", stylerPhoto=" + stylerPhoto
				+ ", photo=" + photo + ", stylerOn=" + stylerOn + "]";
	}








	//getWriteDate: 작성된 날짜를 숫자를 객체에 담아 반환하는 메서드
	//${writeDate} --> getWriteDate()
	//수정한 날짜를 가져오기 위해서 만듦.
	public java.util.Date getWriteDate() {
		
		//getTime() 메서드: 1970년 1월 1일 0시 0분 0초부터 현재까지의 시간을 밀리초 단위로 환산한 값을 숫자로 반환한다.
		return new java.util.Date(stylerOn.getTime());
		
	}//getWriteDate 메서드 끝

	/*
	 * public BoardVo toBoardVo() {
	 * 
	 * return new BoardVo(0, writer, title, content, gpw, null, photo, null);
	 * 
	 * }
	 */
	
	
}//BoardEditVo 클래스 끝
