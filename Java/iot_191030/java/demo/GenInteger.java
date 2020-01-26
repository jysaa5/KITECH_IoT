package iot.java.demo;

public class GenInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//	3 자리 정수를 생성하고 출력하기
		//	- 조건 : 각 자리에 중복 없는 정수
		//	논리적상태(2가지)로 표현 여러 개의 대상(데이터)
		//	bit - 10bits; bit-wise
		
		for(int i =0 ; i<10; ++i) {
			short flag = 0;// 0 ~ 9
			int number = 0;
			int ran = (int)(Math.random()*1000);
			number = ran % 9 + 1;
			// flag [number] bit 1 : set
			flag = (short)(1 << number); // <<    >>
			for(int k=1; k < 4; k++) {
				do{
					ran = (int)(Math.random()*1000);
					ran = ran % 10;
				}while( (flag & (1<<ran)) != 0 );
				// 비트를 확인하는 동작 : masking
				number = number * 10 + ran;
				// 사용했다. 이진 덧셈 : int
				flag = (short) (flag | (1 << ran));
			}
			System.out.println(number);			
		}

	}

}
