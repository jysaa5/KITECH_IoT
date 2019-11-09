package joo.iot.www;
import java.util.Scanner;

public class P06_P01_Main {

	public static void main(String[] args) {
		
		double sol;
		Scanner kb = new Scanner(System.in);
		P06_P01_Triangle area = new P06_P01_Triangle();
		
		System.out.println("삼각형의 밑변을 입력하세요.");
		area.x = kb.nextDouble();
		
		System.out.println("삼각형의 높이를 입력하세요.");
		area.h = kb.nextDouble();
		
		sol = area.triangleArea(area.x, area.h);
		System.out.println(sol);
	
		kb.close();
	}//메인 끝
}//클래스 끝
