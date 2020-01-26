package joo.iot.www;

public class P04_P16_while {

	public static void main(String[] args) {
		
		int num = 1; 
		int sum = 0;
		
		while (num<100) {
			
			sum += num;
			num ++;
		}
		
		System.out.println(sum);

	}//메인 끝
}//클래스 끝
