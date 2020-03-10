package com.iot.smarthome.led.domain;

import java.sql.Date;


//StylerVo: 사진 저장시 처음 데이터를 보관하여 전달하는 도메인 클래스
public class LedVo {
	
	private int ledIdx;  //게시글 번호
	private String ledState;  //게시글 사진제목 데이터
	private Date ledDate;  //게시글 작성 날짜

	
	//<생성자>//
	//기본 생성자
	public LedVo() {
		super();
	}


	public LedVo(int ledIdx, String ledState, Date ledDate) {
		super();
		this.ledIdx = ledIdx;
		this.ledState = ledState;
		this.ledDate = ledDate;
	}


	public int getLedIdx() {
		return ledIdx;
	}


	public void setLedIdx(int ledIdx) {
		this.ledIdx = ledIdx;
	}


	public String getLedState() {
		return ledState;
	}


	public void setLedState(String ledState) {
		this.ledState = ledState;
	}


	public Date getLedDate() {
		return ledDate;
	}


	public void setLedDate(Date ledDate) {
		this.ledDate = ledDate;
	}


	@Override
	public String toString() {
		return "LedVo [ledIdx=" + ledIdx + ", ledState=" + ledState + ", ledDate=" + ledDate + "]";
	}

	
}//CctvVo 클래스 끝
