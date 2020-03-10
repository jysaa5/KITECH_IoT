package com.iot.smarthome.cctv.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

//StylerVo: 사진 저장시 처음 데이터를 보관하여 전달하는 도메인 클래스
public class CctvVo {
	
	private int cctvIdx;  //게시글 번호
	private String cctvType;  //게시글 사진제목 데이터
	private String cctvFile;  //게시글 사진제목 데이터
	private MultipartFile cctv;  //게시글 사진 데이터
	private Date cctvOn;  //게시글 작성 날짜

	
	//<생성자>//
	//기본 생성자
	public CctvVo() {
		super();
	}


	public CctvVo(int cctvIdx, String cctvType, String cctvFile, MultipartFile cctv, Date cctvOn) {
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
		return "CctvVo [cctvIdx=" + cctvIdx + ", cctvType=" + cctvType + ", cctvFile=" + cctvFile + ", cctv=" + cctv
				+ ", cctvOn=" + cctvOn + "]";
	}
	
	






	

	

	
	
	
}//CctvVo 클래스 끝
