package com.kite.mvc.domain;

//DB와 상관없으므로 이 패키지 사용
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

public class GuestMessage2 {

	private int id;
	private String message;
	private Date creationTime;
	
	
	public GuestMessage2(int id, String message, Date creationTime) {
		super();
		this.id = id;
		this.message = message;
		this.creationTime = creationTime;
	}
	
	
	public GuestMessage2() {
		super();
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreationTime() {
		return creationTime;
	}
	public void setCreationTime(Date creationTime) {
		this.creationTime = creationTime;
	}


	@Override
	public String toString() {
		return "GuestMessage [id=" + id + ", message=" + message + ", creationTime=" + creationTime + "]";
	}
	
	
	
	
}
