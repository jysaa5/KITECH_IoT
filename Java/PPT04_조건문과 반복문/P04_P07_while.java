package joo.iot.www;
public class P04_P07_while {

	public static void main(String[] args) {
	
		int i = 1;
		int j = 100;

		System.out.println("< 1부터 100까지 출력 >");
		while(i<=100) 
		{
			System.out.println(i);
			i++;
		}
			
		System.out.println("--------------------");
		System.out.println("< 100부터 1까지 출력 >");
		
		while(j>=1) 
		{
			System.out.println(j);
			j--;
		}
		
	}//메인 끝
}//클래스 끝
