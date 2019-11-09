package joo.iot.www;
public class P04_P02 {

	public static void main(String[] args) {
		int num=0;
		num = (int)((Math.random()*800)-400);
		
		System.out.println(num);
		
		if(num<0) 
		    {
			System.out.println("0미만");
			
		    }else if (0 <= num && num <100)
		    {
			System.out.println("0이상 100미만");
				
			}else if(100 <= num && num < 200) 
			{
				System.out.println("100이상 200미만");
			}else if(200<= num && num<300) 
			{
				System.out.println("200이상 300미만");
			}else if(300 <= num) 
			{
				System.out.println("300이상");	
			}			
	
}//메인 끝
}//클래스 끝


