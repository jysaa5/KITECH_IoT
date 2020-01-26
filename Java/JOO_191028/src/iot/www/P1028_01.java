package iot.www;
/*
 * 모든 코드는 class{ } 안에서 작성된다.
 * 변수: 클래스 안에 멤버 변수이다. / 함수 안에 지역변수이다.
 * - 멤버 변수 (=field) : static field (클래스 필드) / non-static (인스턴스 필드) 
* 함수에도 static을 붙일 수 있다.
- 함수: 멤버 함수(=method) : static(정적 method: 인스턴스 생성하지 않아도 실행가능), non-static (인스턴스를 생성 시켜야 실행 시킬 수 있다.) 
 */

public class P1028_01 {
	private static int number; //필드 -> static이 붙은 것은 클래스 변수이다. 인스턴스 생성을 안하고 클래스명에 바로 점만 찍으면 사용 가능.

	public static void main(String[] args) {
	//함수: 정의 ( ); 구현 { } 호출(값);
		//Main.main(args); = 함수 호출
		number = 100;
		int value = 200; //지역 변수 of main
		printLine(value); // 함수를 실행 시키겠다. 
		//static 메서드는 static 변수와 메서드만 사용 가능하다. 	
	} //main 함수 끝

	//{접근자} {특성자} {반환형} {함수명} ({매개변수 목록})
	public static void printLine(int value) {
		value = 10;
		System.out.println("----"+number+"-----");
	return;// 현재 이 함수가 종료된다. 
	
	}//printLine 함수 끝
}//class 끝
