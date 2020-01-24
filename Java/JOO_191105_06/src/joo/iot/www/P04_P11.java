package joo.iot.www;
public class P04_P11 {

	public static void main(String[] args) {
		
		int num = 0;
		int count = 0;
		
		for (num = 0; num<100; num++) 
		{
			if(num%5 != 0 || num%7 !=0) 
			{
				continue;
			}
			
			count++;
			System.out.println(num);
		}
		System.out.println("count:" +count);
		
	}//메인 끝
}//클래스 끝
