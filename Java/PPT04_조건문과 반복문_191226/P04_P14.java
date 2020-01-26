package joo.iot.www;
public class P04_P14 {

	public static void main(String[] args) {

		int a = 0;
		int b = 0;
		int num1 = 0;
		int num2 = 0;
		
		for (a=0; a<10; a++) 
		{
			for (b=0; b<10; b++) 
			{
		
			if ((10*a+b)+(10*b+a) == 99) 
			{
				System.out.println("a: "+a+", b: "+b);
			}
			}
			
		}
	
	}//메인 끝
}//클래스 끝
