package com.kite.mvc.domain;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

public class GuestMessageList2 {
	

	private List<GuestMessage2> message;

	
	public GuestMessageList2(List<GuestMessage2> message) {
		super();
		this.message = message;
	}


	public GuestMessageList2() {
		super();
	}


	public List<GuestMessage2> getMessage() {
		return message;
	}


	public void setMessage(List<GuestMessage2> message) {
		this.message = message;
	}



	
	
}
