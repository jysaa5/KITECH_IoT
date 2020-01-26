package iot.www;
/*객체: 독립적 실행 단위. 
 * 클래스 만들어 인스턴스로 다루기
 * 1. 필드 작성하기 
 * 2. 필드 입출력을 위한 get/set 만들기 
 * 3. 필드들의 초기화
 * -생성자를 호출한다. 
 * -기본생성자(매개변수가 없는 것), 매개변수를 갖는 생성자 - 오버로딩
 * 4.오버라이드: 기존 매서드 중 하나를 새로 만든다. 
 * -hashCode, equals, toString -> 이런걸 다시 만드는 것이 많다. 연관있는 메소드인 경우가 있으니 검토하고 바꾸기.
 * 5. toString(): 객체를 문자열로 바꾼다. -> 필수
 */
public class P_01 {

	public static void main(String[] args) {
	// player에게 의존한다.// 의존성: 다른 클래스 처리 작성했는가?
	//다른 생성자를 만들면 기본 생성자는 삭제된다. 
		Player player = new Player(100, "장", "아오티"); //생성자 호출
		Player p1 = new Player();
		System.out.println(p1); //객체명 출력 toString();=> 이 결과로 해당 객체의 식별값이 나온거임.
		
		System.out.println(player.getCode());
		int code = player.getCode();
		if (code <2000) 
		{
			System.out.println("Player 아픈 거 같아요.");
		}
		
		
	}//메인함수 끝
}//클래스 함수 끝
