package com.iot.smarthome.cctv.domain;

import org.springframework.web.multipart.MultipartFile;

//CctvEditVo: 사진, 영상을 수정했을 때의 각각의 정보를 담는 도메인 클래스 
public class CctvLogEditVo {
	
	//cctv 로그 인덱스 번호
	private int cctvLogIdx;   
	//cctv 로그 제목
	private String cctvLogFile;
	//cctv 사진 또는 영상 데이터
	private MultipartFile cctvLog;
	
	//<생성자>//
	//기본 생성자
	public CctvLogEditVo() {
		super();
	}

	//생성자
	public CctvLogEditVo(int cctvLogIdx, String cctvLogFile, MultipartFile cctvLog) {
		super();
		this.cctvLogIdx = cctvLogIdx;
		this.cctvLogFile = cctvLogFile;
		this.cctvLog = cctvLog;
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

	public MultipartFile getCctvLog() {
		return cctvLog;
	}

	public void setCctvLog(MultipartFile cctvLog) {
		this.cctvLog = cctvLog;
	}

	//toString
	@Override
	public String toString() {
		return "CctvLogEditVo [cctvLogIdx=" + cctvLogIdx + ", cctvLogFile=" + cctvLogFile + ", cctvLog=" + cctvLog
				+ "]";
	}
	
	
	
}//CctvLogEditVo 클래스 끝
