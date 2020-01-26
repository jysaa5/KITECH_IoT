package iot.java.demo;

import iot.java.Player;

public class BaseBall {

	public static void main(String[] args) {

		Player[] player = new Player[2];
		int caller = 0;
		int STRIKE = 0;
		int BALL = 1;
		// 참조형(클래스) 배열 각 요소에 인스턴스를 우선 생성 후 처리
		player[0] = new TeamA();
		player[1] = new Player();

		// 생성자 여부
		player[0].setCode(0);
		player[1].setCode(1);
		while(true) {
			System.out.println(
			player[caller].getName()+" vs "
			+player[1-caller].getName()
			);
			int callValue = player[caller].getCallValue();// ~한다. 메서드로 구현
			int[] rv = player[1-caller].getResponse(callValue);
			player[caller].setResponse(rv);
			if(rv[STRIKE] == 3) {// 요소번호 정의
				System.out.println(player[caller].getName()+" Win");
				break;
			}
			caller = 1-caller;			
		}
	}
}
