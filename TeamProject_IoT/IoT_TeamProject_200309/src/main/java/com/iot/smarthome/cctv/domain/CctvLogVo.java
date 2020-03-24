package com.iot.smarthome.cctv.domain;

//CctvLogVo: CCTV 로그 저장시 처음 데이터를 보관하여 전달하는 도메인 클래스
public class CctvLogVo {
	
	//cctv 로그 인덱스 번호
	private int cctvLogIdx;   
	//cctv 로그 제목
	private String cctvLogFile;

	//<생성자>//
	//기본 생성자
	public CctvLogVo() {
		super();
	}
	
	//생성자
	public CctvLogVo(int cctvLogIdx, String cctvLogFile) {
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
		return "CctvLogVo [cctvLogIdx=" + cctvLogIdx + ", cctvLogFile=" + cctvLogFile + "]";
	}


}//CctvLogVo 클래스 끝
