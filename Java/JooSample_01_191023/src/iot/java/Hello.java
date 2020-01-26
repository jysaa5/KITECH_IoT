package iot.java;
// JDK에 이미 java 라는 패키지가 있다. 
//전역이 없다.
//실행 - 함수 as where , as Java App on Console
public class Hello {

	//지역
	//멤버 변수들...
	//멤버 함수들...
	public static void main (String [] args) {
		//실행할 내용
		//콘솔화면에 문자들을 출력한기
		//디바이스 (모니터 = 그래픽 카드) 
		//system에게 출력을 요청한다. 
		
		System.out.println("Hello Java"); // String , 함수로 처리한다.
		
		//콘솔 화면에 문자열을 출력할 수 있다. 
		
		String str = "this is String Value";
		// str 변수에 담는다. 변수 선언
		// str 의 자료형은 String 이다. 
		// String은 클래스이다. (첫번째가 대문자이므로)
		// str은 String의 인스턴스이다. 
		// 인스턴스는 new로 생성한다.
		// 예외적으로 String은 new가 있다고 본다. 
		str = "other String"; //기존 변수의 값을 덮어 쓴게 아니라 새로운 인스턴스를 만들어서 변수에 다른 주소에 저장한다. 
	str = new String("Other String");
		System.out.println(str); //함수로 처리한다. 
	}
	
}
