package joo.iot.www;
public class P04_P13 {

	public static void main(String[] args) {
		
		int i = 1;
		int j = 2; 
		
		for(j=2; j<=8; j*=2) 
		{
		
			for (i=1; i<9; i++) 
			{
			
			if(i<3 && j==2) 
			{
				System.out.println(j+"x"+i+"="+j*i);
			}
			else if(i<5 && j==4) 
			{
				System.out.println(j+"x"+i+"="+j*i);
			}
			else if(i<9 && j==8) 
			{
				System.out.println(j+"x"+i+"="+j*i);
			}
		
			}
		}

	}//메인 끝
}//클래스 끝
