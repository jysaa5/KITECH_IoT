package com.kite.gz.board.domain;

//BoardYoutubeTitle 도메인 클래스: 유튜브 영상 검색의 결과인 영상 제목을 담는 도메인 클래스
public class BoardYoutubeTitle {
	
	private int idx; //동영상 번호
	private String title; //동영상 제목
	
	//<생성자>//
	//기본생성자
	public BoardYoutubeTitle() {
		super();
	}

	//전체 필드를 다 받는 생성자
	public BoardYoutubeTitle(int idx, String title) {
		super();
		this.idx = idx;
		this.title = title;
	}
	
	//get와 set 메서드
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	
	//toString 메서드
	@Override
	public String toString() {
		
		return "BoardYoutubeTitle [idx=" + idx + ", title=" + title + "]";

	}//toString 메서드 끝
	
}//BoardYoutubeTitle 클래스 끝
