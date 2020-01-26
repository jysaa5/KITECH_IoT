package iot.java.demo;

import iot.java.Player;

/**
 * 상속 개념
 * - 기존 클래스의 메서드, 필드를 추가, 변경해서 새로운 클래스 
 * - 자식클래스(파생클래스) extends 부모클래스(기본클래스)
 * @author user
 *
 */
public class TeamA extends Player {

	@Override
	public int getCallValue() {
		// TODO Auto-generated method stub
		return super.getCallValue();
	}

	@Override
	public int[] getResponse(int callValue) {
		// TODO Auto-generated method stub
		return super.getResponse(callValue);
	}

	@Override
	public void setResponse(int[] rv) {
		// TODO Auto-generated method stub
		super.setResponse(rv);
	}

}
