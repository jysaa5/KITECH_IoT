package joo.iot.www;

public class P06_P02_KidPlay {
	
	int marble; //구슬의 개수
	int totalmarble;
	
	
	public int playmarblewin (int m, int add) {
		
		totalmarble = m + add;
		
		return totalmarble;
	}
	
	public int playmarblelose (int m, int lose) {
		
		totalmarble = m - lose;
		
		return totalmarble;
	}//메인 끝
}//클래스 끝
