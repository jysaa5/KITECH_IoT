package joo.iot.www;
public class P04_P03 {

	public static void main(String[] args) {
		
		int num1 = 50;
		int num2 = 100;
		int big = 0; 
		int diff = 0;
		
		if (num1>num2) 
		{
			big = num1;
			diff = num1 - num2;
			System.out.println(big);
			System.out.println(diff);
	
		
		}
		else 
		{
			big =num2;
			diff = num2 - num1;
			System.out.println(big);
			System.out.println(diff);
		}
	
	}//메인 끝
}//클래스 끝
