package com.kite.gz.board.domain;

public class BoardYoutubeTitle {
	private int idx;
	private String title;
	
	public BoardYoutubeTitle() {
		super();
	}


	public BoardYoutubeTitle(int idx, String title) {
		super();
		this.idx = idx;
		this.title = title;
	}
	
	
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
	
	
	@Override
	public String toString() {
		return "BoardYoutubeTitle [idx=" + idx + ", title=" + title + "]";
	}
	
	
	
	
	
}
