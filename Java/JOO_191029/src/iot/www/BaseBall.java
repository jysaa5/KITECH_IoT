package iot.www;
import iot.www.Player;
public class BaseBall {

	public static void main(String[] args) {
		Player[] player = new Player[2];
		int caller = 0; // 0번에 있는 플레이어가 부른다. 역활: 수를 부르는사람, 수를 듣고 대답하는 사람.
		int STRIKE = 0;
		int BALL = 1;
		//참조형(클래스)배열 각 요소에 인스턴스를 우선 생성 후 처리.
		//부모 클래스 = 자식 클래스 (o)
		//자식 클래스 = 부모 클래스 (x)
		player[0] = new TeamA();
		player[1] = new Player();
		//생성자 여부 
		player[0].setCode(0); // 자신의 숫자를 정하기.
		player[1].setCode(1);// 자신의 숫자를 정하기. 생성자에 만들면 여기에 안 써도 됨.
		
		while(true) {//1번의 숫자를 0번이 맞추는 것.
			System.out.println(player[caller].getName()+"vs"+player[1-caller].getName());
			
			int callValue = player[caller].getCallValue(); //~한다. ~하기는 메서드로 구현. //0번이 숫자를 부른다. 
			int[] rv =player[1-caller].getResponse(callValue); //1번이 대답하기 //ball, Strike가 같은 int이므로 배열을 사용. rv= return value
			//정답이 나올수 도 있음. 
			player[caller].setResponse(rv); // 1번의 대답한 것을 알려주기 
			
			if(rv[STRIKE] == 3) 
			{//요소번호 정의, 0번에 스트라이크 개수, 1번에는 ball
				System.out.println(player[caller].getName()+"win");
				break;
			}//답이 안나왔으면 반대로 1번이 숫자를 부른다.
			caller = 1-caller; //스위칭, 순서(역할)을 바꿈. 배열에서 사용됨.

			
		}//while문 끝
	
		
		

}//메인함수 끝
}//클래스 함수끝
