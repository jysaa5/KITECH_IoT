package com.kite.op.domain;

public class OpMember {

	private int idx;
	private String uid;
	private String pw;
	private String uname;
	private int byear;
	private String gender; //char로 저장해도 됨. 그러나 String이 컨트롤 하기 편함. 
	private String uphoto;
	
	//생성자 생성
	public OpMember(int idx, String uid, String pw, String uname, int byear, String gender, String uphoto) {
		super();
		this.idx = idx;
		this.uid = uid;
		this.pw = pw;
		this.uname = uname;
		this.byear = byear;
		this.gender = gender;
		this.uphoto = uphoto;
	}

	//기본 생성자 생성 
	public OpMember() {
		super();
	
	}

	//getter, setter 생성 
	public int getIdx() {
		return idx;
	}

	public void setIdx(int idx) {
		this.idx = idx;
	}

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public String getPw() {
		return pw;
	}

	public void setPw(String pw) {
		this.pw = pw;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public int getByear() {
		return byear;
	}

	public void setByear(int byear) {
		this.byear = byear;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getUphoto() {
		return uphoto;
	}

	public void setUphoto(String uphoto) {
		this.uphoto = uphoto;
	}

	//toString 생성
	@Override
	public String toString() {
		return "OpMember [idx=" + idx + ", uid=" + uid + ", pw=" + pw + ", uname=" + uname + ", byear=" + byear
				+ ", gender=" + gender + ", uphoto=" + uphoto + "]";
	}
	
	
	
	
}
