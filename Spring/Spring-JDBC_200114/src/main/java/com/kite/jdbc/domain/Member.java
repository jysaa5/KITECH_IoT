package com.kite.jdbc.domain;

import java.sql.Date; //1970.01.01 00:00:00 -> 현재 시간 까지의 시간: long 밀리초 
import java.util.List;

public class Member {
	
	//beans를 만들때 MySQL에 있는 컬럼이름과 동일하게 하는게 좋다.
	private int id;
	private String email;
	private String password;
	private String name;
	private Date regdate; //sql에서 사용하는 라이브러리를 사용하자. 우리는 여거시 데이터를 출력하는 것만 하기 때문이다. 
	
	
	//생성자
	public Member(int id, String email, String password, String name, Date regdate) {
		super();
		this.id = id;
		this.email = email;
		this.password = password;
		this.name = name;
		this.regdate = regdate;
	}


	//기본 생성자
	public Member() {
		
	}

	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "Member [id=" + id + ", email=" + email + ", password=" + password + ", name=" + name + ", regdate="
				+ regdate + "]";
	}

}
