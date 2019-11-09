package joo.iot.www;
import java.util.Scanner;
public class P05_P02_Main {

	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);
		P05_P02_Absolute abs = new P05_P02_Absolute();
		
		System.out.println("두 개의 정수를 입력하새요.");
		abs.x = kb.nextInt();
		abs.y = kb.nextInt();
		
		System.out.println("<두 정수의 절대값>");
		abs.absolute(abs.x, abs.y);
		
		kb.close();
	}//메인 끝
}//클래스 끝
