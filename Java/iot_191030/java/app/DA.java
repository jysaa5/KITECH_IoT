package iot.java.app;

public class DA {

	private Space[] space;
	public DA() {
		space = new Space[20];// 주차면 정보
	}
	public DA(int numberOfArea) {
		space = new Space[numberOfArea];
	}
	public Space[] selectAll() {
		return space.clone();
	}
	public Space getSpaceByIndex(int idx) {
		return space[idx];
	}

}
