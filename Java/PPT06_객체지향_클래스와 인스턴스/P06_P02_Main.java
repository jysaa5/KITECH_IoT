package joo.iot.www;


public class P06_P02_Main {

	public static void main(String[] args) {
		
		int kid01marbleno; 
		int kid02marbleno;
		int marbleno;
	
		P06_P02_KidPlay kid01 = new P06_P02_KidPlay();
		P06_P02_KidPlay kid02 = new P06_P02_KidPlay();
		
		System.out.println("<<<<<<<<구슬치기 게임>>>>>>>>");
		System.out.println("어린이1의 구슬의 개수는 15개입니다.");
		kid01.marble = 15;

		System.out.println("어린이2의 구슬의 개수는 9개입니다.");
		kid02.marble = 9;
		
		System.out.println("");
		System.out.println("");
		
		System.out.println("어린이 여러분 게임을 진행하겠습니다.");
		System.out.println("구슬치기 1차전 준비 스타트!");
		System.out.println("결과 계산중");
		System.out.println("1차 게임에서 어린이1은 어린이2의 구슬 2개를 획득하였습니다.");
		marbleno = 2;
		kid01marbleno = kid01.playmarblewin(kid01.marble, marbleno);
		kid02marbleno = kid02.playmarblelose(kid02.marble, marbleno);
	
		System.out.println("");
		System.out.println("");
		
		System.out.println("어린이 여러분 게임을 진행하겠습니다.");
		System.out.println("구슬치기 2차전 준비 스타트!");
		System.out.println("결과 계산중");
		System.out.println("2차 게임에서 어린이2은 어린이1의 구슬 7개를 획득하였습니다.");
		marbleno = 7;
		kid01marbleno = kid01.playmarblelose(kid01marbleno, marbleno);
		kid02marbleno = kid02.playmarblewin(kid02marbleno, marbleno);
		
		System.out.println("");
		System.out.println("");
		System.out.println("<구슬치기대전 총 결과>");
		System.out.println("어린이1가 보유한 구슬의 개수:"+kid01marbleno);
		System.out.println("어린이2가 보유한 구슬의 개수:"+kid02marbleno);

	}//메인 끝
}//클래스 끝
