package joo.iot.www;

public class P05_P02_Absolute {

	int x;
	int y;
	int absx;
	int absy;
	
	public void absolute (int x, int y) {
		
		if (x<0) {
			absx = x*(-1);
			System.out.println("첫 번째 수의 절대값:"+absx);
		
		}else {
			System.out.println("첫 번째 수의 절대값:"+x);
		}
		
		if (y<0) {
			absy = y*(-1);
			System.out.println("두 번째 수의 절대값:"+absy);
		}else {
			System.out.println("두 번째 수의 절대값:"+y);
		}
		
	}//메소드 끝
}//클래스 끝
