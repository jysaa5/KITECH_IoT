package iot.java.demo;

import java.util.Scanner;

public class SaleMachine {

	public static void main(String[] args) {
		// TODO: 음료 자판기 동작 구현
		// 키보드로부터의 입력을 원하는 형태로 변환하는 라이브러리
		Scanner kb = new Scanner( System.in/*where*/);
		// 스캐너 입력 반복하다가 보면 종종 타입 미스매치...
		
		// 스트림... 열기 읽기/쓰기 닫기
		// kb.close();
		while(true) {
			// 돈 넣기(입력받기 어디에서)
			System.out.println("입력하세요 : ");
			int money = kb.nextInt();
			
			// 고르기(키보드에서 상품의 번호(정수)를 입력받는다)
			System.out.println("1. 2. 3. 4. > ");
			int no = kb.nextInt();
			
			int price;// no 값에 따라서 다르다....
			switch ( no ) {
			case 1:
			case 3:
				price = 500;
				break;
			case 2:
				price = 800;
				break;
			case 4:
				price = 700;
				break;
			case 5:
				price = 1500;
				break;
			default:
				price = 0;
			}
			
			// 계산 & 잔돈
			int charge = money - price;// 뺄셈 부호
			if( charge >= 0) {// 정상
				System.out.println("잔돈 :"+charge);
			}else {
				System.out.println("돈이 부족합니다.");
			}
		}
		
		// kb.close();		
	}

}
