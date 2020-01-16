package com.kite.mm.member.domain;

public class MemberRequest {

	private int idx;
	private String uemail;
	private String uname;
	private String upw;
	private String gender;
	private String byear;
	private String uphoto;

	
	//생성자
	public MemberRequest(int idx, String uemail, String uname, String upw, String gender, String byear, String uphoto) {
		super();
		this.idx = idx;
		this.uemail = uemail;
		this.uname = uname;
		this.upw = upw;
		this.gender = gender;
		this.byear = byear;
		this.uphoto = uphoto;
		
	}
	
	
	//생성자: 기본
	public MemberRequest() {
		super();
	}



	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getUemail() {
		return uemail;
	}
	public void setUemail(String uemail) {
		this.uemail = uemail;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getUpw() {
		return upw;
	}
	public void setUpw(String upw) {
		this.upw = upw;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getByear() {
		return byear;
	}
	public void setByear(String byear) {
		this.byear = byear;
	}
	public String getUphoto() {
		return uphoto;
	}
	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}



	@Override
	public String toString() {
		return "MemberRequest [idx=" + idx + ", uemail=" + uemail + ", uname=" + uname + ", upw=" + upw + ", gender="
				+ gender + ", byear=" + byear + ", uphoto=" + uphoto + "]";
	}
	

	
	 
}

