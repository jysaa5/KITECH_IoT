package joo.iot.www;

public class Boy {
	
	
	//구슬의 개수 
	int numofMarble; 

	//생성자: 아이가 가지는 구슬의 개수를 초기화.
	public Boy(int num) {
		numofMarble = num;
	}
	
	//게임에서 이기면 구슬의 개수를 증가. 
	void win(int num) {
		numofMarble += num; 
	}
	
	//게임에서 지면 구슬의 개수를 감소. 
	void lose (int num) {
		numofMarble -= num;
		
	}

	//게임의 승리
	void gameWin(Boy boy, int num) { //클래스의 인스턴스 변수를 매개변수로 받은 것이다. 
		win(num);
		boy.lose(num);
	}
	
	void showData() {
		System.out.println("구슬의 개수: "+numofMarble);
	}
	
	public static void main(String[] args) {
		
		//어린이 1 생성 : 구슬 15개 보유
		Boy boy1 = new Boy(15);
		
		//어린이 2 생성: 구슬 9개 보유
		Boy boy2 = new Boy(9); 
		show(boy1,boy2);
		
		//첫 번째 게임: 어린이 1이 승리 구슬 2개 획득 
		boy1.gameWin(boy2, 2);
		
		System.out.println("첫 번째 게임: 어린이 1이 승리 구슬 2개 획득 ");
		show(boy1,boy2);
		
		//두 번째 게임: 어린이2이 승리 구슬 7개 획득
		boy2.gameWin(boy1,7);
		System.out.println("두 번째 게임: 어린이2이 승리 구슬 7개 획득 ");
		show(boy1,boy2);
		
	}
	
	public static void show(Boy boy1, Boy boy2) {
		System.out.println("현재 어린이들이 보유한 구슬의 개수 현황");
		System.out.println("어린이1");
		boy1.showData();
		System.out.println("어린이2");
		boy2.showData();
		System.out.println("===================================");
	}
	
	
}
