package joo.iot.www;
public class P04_P15_if {

	public static void main(String[] args) {
		
		int n = 0; 
		n = (int)(Math.random()*11);
		
		if(n>0) 
		{
			
		if(n==1) 
		{
			System.out.println("현재 인원은 1명 입니다.");
		}
		else if (n==2) 
		{
			System.out.println("현재 인원은 2명 입니다.");
		}
		else if (n==3) 
		{
			System.out.println("현재 인원은 3명 입니다.");
		}
		else if (n>3) 
		{
			System.out.println("현재 많은 사람들이 있습니다.");
		}
		
		}else {
			System.out.println("현재 인원은 0명 입니다.");
		}
		
		
	}//함수 끝
}//클래스 끝
