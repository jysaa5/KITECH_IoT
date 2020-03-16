package com.iot.smarthome.cctv.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;


//BoardEditVo: 게시글을 수정했을 때의 각각의 정보를 담는 도메인 클래스 
public class CctvEditVo {
	
	
	private int cctvIdx;  //게시글 번호
	private String cctvType;  //게시글 사진제목 데이터
	private String cctvFile;  //게시글 사진제목 데이터
	private MultipartFile cctv;  //게시글 사진 데이터
	private Date cctvOn;  //게시글 작성 날짜
	
	
	
	
	
	//<생성자>//
	//기본 생성자
	public CctvEditVo() {
		super();
	}
	


	
	public CctvEditVo(int cctvIdx, String cctvType, String cctvFile, MultipartFile cctv, Date cctvOn) {
		super();
		this.cctvIdx = cctvIdx;
		this.cctvType = cctvType;
		this.cctvFile = cctvFile;
		this.cctv = cctv;
		this.cctvOn = cctvOn;
	}




	public int getCctvIdx() {
		return cctvIdx;
	}




	public void setCctvIdx(int cctvIdx) {
		this.cctvIdx = cctvIdx;
	}




	public String getCctvType() {
		return cctvType;
	}




	public void setCctvType(String cctvType) {
		this.cctvType = cctvType;
	}




	public String getCctvFile() {
		return cctvFile;
	}




	public void setCctvFile(String cctvFile) {
		this.cctvFile = cctvFile;
	}




	public MultipartFile getCctv() {
		return cctv;
	}




	public void setCctv(MultipartFile cctv) {
		this.cctv = cctv;
	}




	public Date getCctvOn() {
		return cctvOn;
	}




	public void setCctvOn(Date cctvOn) {
		this.cctvOn = cctvOn;
	}




	@Override
	public String toString() {
		return "CctvEditVo [cctvIdx=" + cctvIdx + ", cctvType=" + cctvType + ", cctvFile=" + cctvFile + ", cctv=" + cctv
				+ ", cctvOn=" + cctvOn + "]";
	}




	//getWriteDate: 작성된 날짜를 숫자를 객체에 담아 반환하는 메서드
	//${writeDate} --> getWriteDate()
	//수정한 날짜를 가져오기 위해서 만듦.
	public java.util.Date getWriteDate() {
		
		//getTime() 메서드: 1970년 1월 1일 0시 0분 0초부터 현재까지의 시간을 밀리초 단위로 환산한 값을 숫자로 반환한다.
		return new java.util.Date(cctvOn.getTime());
		
	}//getWriteDate 메서드 끝

	/*
	 * public BoardVo toBoardVo() {
	 * 
	 * return new BoardVo(0, writer, title, content, gpw, null, photo, null);
	 * 
	 * }
	 */
	
	
}//BoardEditVo 클래스 끝
