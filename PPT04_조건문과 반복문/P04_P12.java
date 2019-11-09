package joo.iot.www;
public class P04_P12 {

	public static void main(String[] args) {
	
		int num = 1; 
		int num1 = 0;
		
		while (true) 
		{
			
			if (num%2==1 || num%6==0) 
			{
				num1 += num;
			}
				
			num++;
			
			if (num1>1000) 
			{
				System.out.println(num);
				System.out.println(num1);
			break;
			}
		}
		
	}//메인 끝
}//클래스 끝
