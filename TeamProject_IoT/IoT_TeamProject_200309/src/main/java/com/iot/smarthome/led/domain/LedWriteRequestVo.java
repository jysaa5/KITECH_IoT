package com.iot.smarthome.led.domain;

import java.sql.Date;

public class LedWriteRequestVo {

	private int ledIdx;  //게시글 번호
	private String ledState;  //게시글 사진제목 데이터
	private Date ledDate;  //게시글 작성 날짜



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
		return "LedWriteRequestVo [ledIdx=" + ledIdx + ", ledState=" + ledState + ", ledDate=" + ledDate + "]";
	}



	
	
}
