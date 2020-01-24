package joo.iot.www;
import java.util.Scanner;
public class P05_P03_Main {

	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);
		
		P05_P03_Circle Circle = new P05_P03_Circle();
		
		System.out.println("한 개의 원의 반지름을 입력해주세요.");
		Circle.r = kb.nextDouble();
	
		Circle.area(Circle.r);
		Circle.cir(Circle.r);
		
		kb.close();
	}//메인 끝
}//클래스 끝
