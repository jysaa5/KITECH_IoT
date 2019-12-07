package joo.iot.www;
import java.util.Scanner;
public class P05_P04_Main {

	public static void main(String[] args) {
		
		boolean prime;
		
		Scanner kb = new Scanner(System.in);
		P05_P04_PrimeNumber PN = new P05_P04_PrimeNumber();
		
		System.out.println("<한 개의 정수를 입력하세요.>");
		PN.x = kb.nextInt();
		
		prime = PN.primeNumber(PN.x);
		
		if (prime == true) 
		{
			System.out.println(PN.x+" (은)는 소수 입니다.");
		}
		else 
		{
			System.out.println(PN.x+" (은)는 소수가 아닙니다.");
		}

		System.out.println("---------------------------");
		PN.allPrimeNumber();
		
		kb.close();
	
	}//메인 끝
}//클래스 끝
