package iot.java;


//class Application {
//
//	public static void main(String[] args) {
//		
//	}
//}

// public 지정했을 때는 반드시 이름이 같아야 한다.
public class App {

	public static void main(String[] args) {
		// 제어 문장 : 분기, 반복(분기 포함)
		int digit = 0;
		// 한 번 동작, 몇 개, ~까지
		for(int i = 0; i < 3; i+=1){// 변수를 선언하는 위치
			double ran = Math.random() * 10.0;// 0 ~ 1
			int number = (int)ran;// 형변환 : 손실 감안
			System.out.println( number );
			digit += number; // digit = digit + number;
		}
		System.out.print("Total : ");
		System.out.println( digit );
		
		
		// 정수 -> 문자열 : 범위 표현 불가, 변환표
		// case + break
//		number = 1;
//		// 정수만 
//		String name = "jdk";
//		String nick = "jdk";
//		switch( name ) {// 상수 식 ㅣ 값
////		case nick:// 값을 적는다...문자열 상수는 가능
//		case "jdk":
//			System.out.println("1");
//			break;// 건너뛴다. 나간다...
//		case "10":
//			System.out.println("10");
//			break;
//		case "20":
//			System.out.println("20");
//			break;
//		}
		
		// 임의 정수 판단 : 논리적 오류를 잘 고민하자
//		if( 0 <= number && number < 100) {
//			System.out.println(number + " > 0 ");			
//		}
//		if( number % 7 == 0) {
//			System.out.println("7's 배수");
//		}else {
//			System.out.println("7's not 배수");
//		}
		
	}
}

/**
 * 
 * 		// 표현식 : expression : 연산자가 사용된 하나의 문장
		int score;
		score = 10 + 20;
		String cmd = "exit";
		if( "exit" == cmd ) {
			
		}
		if( "exit".equals(cmd) ) { // 조건식 == boolean
			System.out.println(score);
		}
		
		if( score < 10 ) { // 조건식 == boolean
			System.out.println(score);
		}else {
			// score >= 10
		}
		
		if(score > 90)
		{
		}else if(score > 96) {
			// B 조건은 A 의 거짓이면
		}else if(C) {
		}else if(D) {
		}else {				
		}
		

 * 
 * 		// 연산자 : 산술, 관계(대소비교), 논리연산, 비트연산

		// 하나라도 거짓이면 결과 거짓이다.
		// 둘 다 참일 때 결과 참이다.
//		System.out.println( true && false);
//		// 하나라도 참이면 결과 참이다.
//		// 둘 다 거짓일 때 결과 거짓이다.
//		System.out.println( true || false);

		// 관계 연산의 결과는 boolean
//		System.out.println( 10 > 20 );// 이면 T F
//		System.out.println( 10 >= 20 );// 이면 T F
//		System.out.println( 10 < 20 );// 이면 T F
//		System.out.println( 10 <= 20 );// 이면 T F
//
//		// equals
//		System.out.println( 3 + 7== 20  );// 이면 T F
//		System.out.println( 10 != 20 );// 이면 T F

		
		
		// 덧셈, 뺄셈 - offset , 방향
//		System.out.println(10 + 5);
//		System.out.println("abc" + "efg");
//		System.out.println(10 - 5);
//		System.out.println(10 * 5);
//		System.out.println(10 / 5);
//		System.out.println(10 % 5);
		// 배수 판별, 자른다....(진수)
//		System.out.println(10 ** 5);
		
		//- 제어문
		 * 
 *		// 각 자료형에 따라 동작할 수 있도록 
		System.out.println( "100" );
		int bak = 100;
		System.out.println( bak );

 * 
 * 		// 변수 선언 : {자료형} {변수명};
		byte ascii; // 1byte ~ 255
		short score;// 2byte 16bits
		int number; // 4byte
		long ln; // 
		
		double lf;	// 실수형. 부동소수
		
		char unicode;	// 2byte
		boolean state = true;// false
		
		


 */






