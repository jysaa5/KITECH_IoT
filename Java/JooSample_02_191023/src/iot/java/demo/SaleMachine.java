package iot.java.demo;

import java.util.Scanner;
public class SaleMachine {
	public static void main (String[] args) {
		//TODO: 음료 자판기 동작 구현
		//int ch = System.in.read();
		//키보드로부터의 입력을 원하는 형태로 변환하는 라이브러리 
		Scanner kb = new Scanner(System.in); // 읽어온 데이터를 스캐너를 통해서 변환한다. 
		//스캐너 입력 반복하다가 보면 종종 타입 미스매치가 생긴다. 
		//스트림...열기 읽기/쓰기
		//kb.close(); -> 닫으면 다시 열지 않음.
		while(true) {
		//돈 넣기(입력받기 어디에서)-> 키보드에서
		System.out.println("돈 넣으셈");
		int money = kb.nextInt()  ; //키보드에서 받은거를 int 타입으로 변환한다. 
		
		//고르기(키보드에서 상품의 번호(정수)를 입력 받는다)
		System.out.println("1, 2, 3, 4, 5, 6");
		int no = kb.nextInt()  ;
		
		int price=0; //no 변수의 값에 따라 다르다.  초기값
		switch (no) {
		case 1://1번 상품
		case 3://3번 상품
			price = 200;
			break;
		case 2://2번 상품
			price = 300;
			break;
		case 4://4번 상품
			price = 400;
			break;
		case 5://5번 상품
			price = 500;
			break;
		case 6://6번 상품
			price = 600;
			break;
			default:
// 해당하는게 없을때.	
				price = 0;
		}
		//계산 & 잔돈
		int charge = money - price; //뺄셈 부호 중요
		if(charge>=0) {//정상
			
			System.out.println("잔돈:"+charge);

		}
		else
		{
			System.out.println("돈이 부족합니다.");
		}		
		}
	}
}
