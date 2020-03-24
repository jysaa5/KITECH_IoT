package com.iot.smarthome.cctv.domain;

import org.springframework.web.multipart.MultipartFile;

//CctvLogWriteRequestVo: CCTV 로그 저장시 요청 데이터를 보관하여 전달하는 도메인 클래스
public class CctvLogWriteRequestVo {
	
	//cctv 로그 인덱스 번호
	private int cctvLogIdx;   
	//cctv 로그 제목
	private String cctvLogFile;
	
	//<생성자>//
	//기본 생성자
	public CctvLogWriteRequestVo() {
		super();
	}
	

	//생성자
	public CctvLogWriteRequestVo(int cctvLogIdx, String cctvLogFile) {
		super();
		this.cctvLogIdx = cctvLogIdx;
		this.cctvLogFile = cctvLogFile;
	}
	
	//getter, setter
	public int getCctvLogIdx() {
		return cctvLogIdx;
	}


	public void setCctvLogIdx(int cctvLogIdx) {
		this.cctvLogIdx = cctvLogIdx;
	}


	public String getCctvLogFile() {
		return cctvLogFile;
	}


	public void setCctvLogFile(String cctvLogFile) {
		this.cctvLogFile = cctvLogFile;
	}
	
	//toString
	@Override
	public String toString() {
		return "CctvLogWriteRequestVo [cctvLogIdx=" + cctvLogIdx + ", cctvLogFile=" + cctvLogFile + "]";
	}


	//toCctvLog 메서드: cctv 도메인의 객체를 반환하는 메서드
	public CctvLogVo toCctvLog() {
		
		return new CctvLogVo(0, cctvLogFile);
	
	}//toCctvLog 메서드 끝
	
}//CctvLogWriteRequestVo 클래스 끝
