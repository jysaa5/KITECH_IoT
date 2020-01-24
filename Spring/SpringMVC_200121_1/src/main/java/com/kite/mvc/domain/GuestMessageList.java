package com.kite.mvc.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

//엘리먼트 구성의 정의가 필요함.
@XmlAccessorType(XmlAccessType.FIELD)
//xml 루트 지정
@XmlRootElement(name="message-list")
public class GuestMessageList {
	
	
	@XmlElement(name = "message")
	private List<GuestMessage> message;

	
	public GuestMessageList(List<GuestMessage> message) {
		super();
		this.message = message;
	}


	public GuestMessageList() {
		super();
	}


	public List<GuestMessage> getMessage() {
		return message;
	}


	public void setMessage(List<GuestMessage> message) {
		this.message = message;
	}



	
	
}
