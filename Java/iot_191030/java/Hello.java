package iot.java;
// JDK
// 전역이 없다..
//	실행 - 함수 as Java App on Console
public class Hello {
	// 지역
	
	// 멤버 변수들...
	
	// 멤버 함수들 ...
	public static void main(String[] args) {
		// 실행할 내용
		
		// 화면에 문자들을 출력하기
		// 디바이스 (모니터,그래픽카드 )
		// system 에게 출력 요청한다....
		System.out.println("Hello Java"); // String
		
		// 콘솔 화면에 문자열을 출력할 수 있다.... NCS
		String str = "this is String value";
		// str 은 변수이다...
		// str 의 자료형은 String 이다...
		// String 은 클래스 구나...
		// str 은  String 의 인스턴스 이다...
		// 인스턴스는 new 생성
		// 예외 적으로... 
		str = new String("other String");
		
		System.out.println(str);
		
		
	}

}
