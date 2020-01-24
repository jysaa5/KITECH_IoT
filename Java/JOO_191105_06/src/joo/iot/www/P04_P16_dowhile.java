package joo.iot.www;

public class P04_P16_dowhile {
	public static void main(String[] args) {
		
		int num = 1;
		int sum = 0;
		
		do 
		{
			
			sum += num;
			num++;
			
		}while(num<100);
		
		System.out.println(sum);

	}//메인 끝
}//클래스 끝
