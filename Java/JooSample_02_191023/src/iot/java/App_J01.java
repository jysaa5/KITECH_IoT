package iot.java;

// class App_J01 {

	//public static void main (String[]args) {
	//}
	
//}
//public을 지정했을 때는 반드시 클래스와 이름이 같아야 된다. 
 public class App_J01 {

	public static void main (String[]args) {
		//변수 선언: {자료형} {변수명}; 변수명은 소문자로 하는게 규칙이다.
		//byte ascii; // 1byte 0~255 (256개)
		//short score; // 2byte = 16 bits
		//int number; // 4bye
		//long ln; // 정수, 가변적
		//long long lnln; // 
		//double lf; // 실수형, 부동소수
		
	//	char unicode; // 2byte
		//boolean state = true; //false 
		
		// 각각 자료형에 따라 동작할 수 있도록 만든다.
	//	System.out.println("100");
		//int bak = 100;
		//System.out.println(bak);
		
		// 덧셈, 뺄셈 - offset, 방향 
		//연산자: 산술연산, 관계(대소비교), 논리연산, 비트연산(2진수연산)
		//System.out.println(10 + 5); //정수 + 정수 => 수로 계산 (계산기처럼)
		//System.out.println("abc"+"efg"); // 문자열 + 문자열 => 합친다
		//System.out.println(10 - 5);
		//System.out.println(10 * 5);
		//System.out.println(10 / 5); //나누기 연산
		//System.out.println(10 % 5); //나머지 연산
		//System.out.println(10**5); // 자바는 이건 없다. 몇 승(제곱)  
		// 배수 판별(나머지가 0이면 배수), 자른다(진수) 
		
		//관계연산의 결과는 boolean
		//System.out.println(10 > 20);//'~이면' T/F
		//System.out.println(10 >= 20);//'~이면' T/F
	//	System.out.println(10 < 20);//'~이면' T/F
		//System.out.println(10 <= 20);//'~이면' T/F
		
		//equals
		//System.out.println(10 == 20);//'~이면' T/F
	//	System.out.println(10 != 20);//'~이면' T/F
	//	System.out.println(3+7 == 20);//'~이면' T/F
	//	System.out.println(3 == 20 - 7);//'~이면' T/F
	
		//하나라도 거짓이면 결과는 거짓이다. 
		//둘다 참일 때 결과는 참이다. 
		//System.out.println(true && false); // and 이면서, 그리고
		// 하나라도 참이면 결과는 참이다. 
		// 둘 다 거짓일 때 결과는 거짓이다.
		//System.out.println(true || false); //or 또는 
		
		//제어하는 문장: 분기(길을 나눈 것), 반복(분기는 이미 안에 포함되어 있는 것)
		//int score; // 아직 초기화 되지 않은 것. 변수 생성은 되었고 값이 저장되어 있지 않은 것이다. 
		//score = 10; 
	//	System.out.println(score + 10); 
		//int total = score +10;
		//int total = score < 10; // type miss match
		//boolean totall = score <10;
		// 모든 연산은 반드시 자료형을 일치 시켜야 한다. 
		
		// 표현식: expression : 연산자가 사용된 하나의 문장. 
		//int score;
	//	score = 10 + 20; 
	//	if(){ // 구문, 구간, statement
	//		score = 10 + 20; 
	//		score = 10 + 20; 
	//	}
		
		
	//	while(){
	//		score = 10 + 20; 
	//		score = 10 + 20; 
	//	}
		//if(score < 10) {//조건식 ==boolean 
	
	//	System.out.println(score);
	//	}
		
	//	if(score < 10) {//조건식 ==boolean 
			
	//		System.out.println(score);
	//		}
	//	else
	//	{
			//score>=10
	//	System.out.println("This is false");
	//	}
		
	//	String cmd = "exit"; //cmd = 클래스(참조형 변수), exit 문자열의 주소가 저장 되어 있음. 
//		if("exit" == cmd) // 주소가 같냐고 묻는 것이다. 
	//	if("exit".equals(cmd)) { //주소가 달라도 값은 같은지 묻는 것. 
			
	//		}
	//	else if() {
       // double ran = Math.random(); // 0~1
     //   System.out.println(ran);
	//	ran = ran * 100; // 2자리 올림.
//		System.out.println(ran);
	//	int number = (int) ran; //형변화, 값의 손실을 감안(trunk)
	//	System.out.println(number);
		
		//임의의 정수 판단: 논리적 오류를 잘 고민하자 
	//	if(number > 0 && number <100) {
	//	System.out.println(number+">0");
	//	}
		
	//	if (number % 7 == 0) { // 값은 6이하의 값. 
			
	//		System.out.println("7's 배수");
			
	//	}
	//	else {
	//		System.out.println("7's not 배수");
	//	}
	
		// 정수 -> 문자열 (표의 개념): 범위 표현 불가, 변환표
		// case + break
	//	String name = "jdk";
	//	String nick = "jdk";
	//	number = 1;
	//	switch (name) {// 상수 식값
		//case nick:
	//	case "jdk":
	//		System.out.println("1");
//			break; //건너뛴다. 나간다.
//		case "10":
//			System.out.println("10");
//			break;
//		case "20": 
	//		System.out.println("20");
//			break;
		int digit = 0; // 전역변수 (문법적으로 아예밖에 빼놓은 것은 없을 뿐이다.)
		// 한 번 동작, 몇 개, ~까지 
		for(int i =0; i<3 ;i+=1){//변수를 선언하는 위치 
		//int digit = 0; //이 구간에서만 사용 가능 
		double ran = Math.random()*10.0; // 0~1
		 int number = (int) ran;
		 System.out.println(number);
		 digit += number;// digit = digit + number; 
		}
		System.out.print("Total:");
		System.out.println(digit);
		
	/*	{
			
			double ran = Math.random()*10.0; // 0~1
			 int number = (int) ran;
			 System.out.println(number);
			 digit += number;
			 // 구간(지역): 해당 지역에서, 외부인지, 내부인지.-> 지역성
			}*/
		/*{
			double ran = Math.random()*10.0; // 0~1
			 int number = (int) ran;
			 System.out.println(number);
			 digit += number;
			}
		System.out.print("Total:");
		System.out.println(digit);
		 // 구간(지역): 해당 지역에서, 외부인지, 내부인지.-> 지역성*/
		
	}
	
	}
		
		

 
