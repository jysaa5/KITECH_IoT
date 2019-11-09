package joo.iot.www;
public class P04_P08 {

	public static void main(String[] args) {
		int num = 1; 
		int sol = 0;
		
		while(num<=1000) 
		{
		
			if (num%2==0 && num%7==0) 
			{
				System.out.println(num);	
				sol += num;
			}
			num++;
		}
		System.out.println("1000이하의 자연수 중에서 2의 배수이면서 7의 배수의 합:"+sol);

	}//메인 끝
}//클래스 끝
