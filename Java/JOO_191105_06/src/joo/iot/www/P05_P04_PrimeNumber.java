package joo.iot.www;
public class P05_P04_PrimeNumber {

	int x; 
	boolean y;
	
	public boolean primeNumber (int x) {
		
		if(x%2==0 || x==1) {
			if(x==2) 
			{
				y = true;
			}
			else
			{
				y= false;
			}
		}
		else if(x%2 != 0)
		{
			if(x == 3) 
			{
				y = true;
			}
			
			if(x>3) 
			{
			for(int i=3; i<x; i+=2) 
			{
				
				if(x%i == 0) 
				{
					y = false;
					break;
				}
				else 
				{
					y = true;
				}	
			}
			}
			
		}
		return y;
		
	}//메소드 끝
	
	
	public void allPrimeNumber () {
		
		System.out.println("<1부터 100이하의 소수(Prime Number)>");
		
		for(int k=2; k<=3; k++) 
		{
		System.out.print(k+"/");
		}
		
		for(int i=5; i<=100; i+=2) 
		{
			
			for(int j=3; j<i; j+=2) 
			{
			if (i%j == 0) 
			{
				break;
			}
			else if(j==(i-2)) 
			{
				System.out.print(i+"/");
			}
			
			}
		}
	}//메소드 끝
}//클래스 끝

