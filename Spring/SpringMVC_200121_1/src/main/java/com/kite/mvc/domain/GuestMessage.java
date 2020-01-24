package com.kite.mvc.domain;

//DB와 상관없으므로 이 패키지 사용
import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {"id", "message", "creationTime"}) //이름은 엘리먼트의 이름으로 바로 들어가게 함. //속성의 구성
public class GuestMessage {

	private int id;
	private String message;
	private Date creationTime;
	
	
	public GuestMessage(int id, String message, Date creationTime) {
		super();
		this.id = id;
		this.message = message;
		this.creationTime = creationTime;
	}
	
	
	public GuestMessage() {
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
