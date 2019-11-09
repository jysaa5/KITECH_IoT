package joo.iot.www;
public class P03_P04 {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;
		
		a = (((25+5)+(36/4))-72)*5;
		b = (((25*5)+(36-4))-71)/4;
		c = (128/4)*2;
		
		if (a>b && b>c) 
		{
			System.out.println("true");
		}
		else 
		{
			System.out.println("false");
		}
		

	}//메인 끝
}//클래스 끝
