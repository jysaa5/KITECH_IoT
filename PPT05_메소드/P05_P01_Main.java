package joo.iot.www;
import java.util.Scanner;

public class P05_P01_Main {

	public static void main(String[] args) {
		
		P05_P01_Calculation Cal = new P05_P01_Calculation();
		Scanner kb = new Scanner(System.in);
		
		System.out.println("첫 번째 정수를 입력 해주세요.");
		Cal.x = kb.nextInt();
		
		System.out.println("두 번째 정수를 입력 해주세요.");
		Cal.y = kb.nextInt();
		
		System.out.println("< 두 수의 사칙연산의 결과 >");
		Cal.calculation(Cal.x, Cal.y);		

	kb.close();	
	
	}//메인 끝
}//클래스 끝
