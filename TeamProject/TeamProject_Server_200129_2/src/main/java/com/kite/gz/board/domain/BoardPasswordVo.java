package com.kite.gz.board.domain;

import java.sql.Date;

import org.springframework.web.multipart.MultipartFile;

public class BoardPasswordVo {
	private int idx;
	private String writer;
	private String title;
	private String content;
	private String gpw;
	private String gphoto;
	private MultipartFile photo;
	private Date regdate;
	
	
	public BoardPasswordVo() {
		super();
	}


	public BoardPasswordVo(int idx, String writer, String title, String content, String gpw, String gphoto,
			MultipartFile photo, Date regdate) {
		super();
		this.idx = idx;
		this.writer = writer;
		this.title = title;
		this.content = content;
		this.gpw = gpw;
		this.gphoto = gphoto;
		this.photo = photo;
		this.regdate = regdate;
	}


	public int getIdx() {
		return idx;
	}


	public void setIdx(int idx) {
		this.idx = idx;
	}


	public String getWriter() {
		return writer;
	}


	public void setWriter(String writer) {
		this.writer = writer;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getGpw() {
		return gpw;
	}


	public void setGpw(String gpw) {
		this.gpw = gpw;
	}


	public String getGphoto() {
		return gphoto;
	}


	public void setGphoto(String gphoto) {
		this.gphoto = gphoto;
	}


	public MultipartFile getPhoto() {
		return photo;
	}


	public void setPhoto(MultipartFile photo) {
		this.photo = photo;
	}


	public Date getRegdate() {
		return regdate;
	}


	public void setRegdate(Date regdate) {
		this.regdate = regdate;
	}


	@Override
	public String toString() {
		return "BoardPasswordVo [idx=" + idx + ", writer=" + writer + ", title=" + title + ", content=" + content
				+ ", gpw=" + gpw + ", gphoto=" + gphoto + ", photo=" + photo + ", regdate=" + regdate + "]";
	}


	
	
	

	
	
	
	
	
}
