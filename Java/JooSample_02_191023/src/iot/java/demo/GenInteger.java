package iot.java.demo;

public class GenInteger {
	public static void main(String[] args) 
	{
		//3자리 정수를 생성하고 출력하기
		// -조건: 각 자리에 중복 없는 정수
		// 논리적 상태(2가지)로 표현 여러개의 대상(데이터) -> bit = 1,0으로 표시 또는 참, 거짓
		// 1bit -> 0~9 : 10bits -> 비트연산: bit-wise / int는 너무 큼. short 2byte

		for(int i=0; i<10;i++) 
		{
		short flag = 0; // 15 14 13 12 .... 4 3 2 1 0 -> 16bit // 초기화 필요 // 0~9번 비트를 확인 하겠다.  
		int number =0; //뽑기전에 초기화
		int ran = (int) (Math.random()*1000000);
		number = ran %9 +1; // 1~9 -> 최초 한 자리.-> 첫번째자리 -> 100의 자리
		//flag[number] bit 1 : set 
		flag = (short)(1 << number); //여기서 나오는 것은 2byte 초과가 안됨. // 값을 저장함.
	
		for (int k=1; k<3; k++) // 3자리 
		{
			
	do	{
		ran = (int) (Math.random()*1000000);
		ran = ran % 10; // 0~9 -> 반복해야 됨 -> 두번째 -> 10의 자리
		}while((flag & (1<<ran)) != 0); //ran의 값이 이전에 사용한적이 있는지->있으면 다시 do로 가서 다시 뽑고 / 사용 안했으면 조건문을 빠져나옴. / 0~9까지 사용했는지 안했는지
	 // 비트 연산에서 비트를 확인하는 동작: (masking) 마스킹
		number =number * 10 +ran;//반복해야됨 -> 세번째 자리 -> 1의 자리 
		// 사용했다.이진수 덧셈 : int,  덧셈을 안하면 덮어쓰기가 되어버림. 
		flag = (short) (flag |(1 << ran)); //사용한 거 1로 표시 , OR 연산 (비트 +연산)
		}
		
		System.out.println(number);
		}
		//ran = ran % 900+100; //%900 = 최소 0~899이하의 값이 나온다. / 900 = 길이 
		// R%(max-min+1) + min
	//	ran/100; 백자리
	   // ran/10 %10 십자리
		//ran%10; 일의 자리
		
		//System.out.println(ran);
		}
	}


