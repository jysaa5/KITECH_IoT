package iot.www;

import iot.www.Player;
/*
 * 상속 개념
 * - 기존 클래스의 메서드, 필드를 추가, 변경해서 새로운 클래스
 * - 자식 클래스(파생 클래스) extends 부모 클래스(기본 클래스)
 */

public class TeamA extends Player {

	@Override //기존에 있던 거를 버리고 새로 만들기. 개수는 1개 
	public int getCallValue() {
		return super.getCallValue(); //super => Player를 의미
	}

	@Override
	public int[] getResponse(int callValue) {
		return super.getResponse(callValue);
	}

	@Override
	public void setResponse(int[] rv) {
		super.setResponse(rv);
	} //extends 확장,

}
