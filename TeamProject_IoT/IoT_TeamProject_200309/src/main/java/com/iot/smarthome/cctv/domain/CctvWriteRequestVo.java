package com.iot.smarthome.cctv.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

//StylerWriteRequestVo: 사진 저장시 요청 데이터를 보관하여 전달하는 도메인 클래스
public class CctvWriteRequestVo {
	
	private int cctvIdx;  //게시글 번호
	private String cctvType;
	private MultipartFile cctv;  //게시글 사진 데이터
	private Date cctvOn;  //게시글 작성 날짜
	
	
	//<생성자>//
	//기본 생성자
	public CctvWriteRequestVo() {
		super();
	}

	
	






	public CctvWriteRequestVo(int cctvIdx, String cctvType, MultipartFile cctv, Date cctvOn) {
		super();
		this.cctvIdx = cctvIdx;
		this.cctvType = cctvType;
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
		return "CctvWriteRequestVo [cctvIdx=" + cctvIdx + ", cctvType=" + cctvType + ", cctv=" + cctv + ", cctvOn="
				+ cctvOn + "]";
	}









	//toStyler 메서드: Styler 도메인의 객체를 반환하는 메서드
	public CctvVo toCctv() {
		
		return new CctvVo(0, null, null, cctv, null);
	
	}//toStyler 메서드 끝
	
	
	
}//StylerWriteRequestVo 클래스 끝
