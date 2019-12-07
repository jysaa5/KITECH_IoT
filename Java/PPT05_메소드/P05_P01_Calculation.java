package joo.iot.www;


public class P05_P01_Calculation {

	int x;
	int y;
	int add;
	int sub;
	int mul;
	int div;
	int rest;
	
	public void calculation (int x, int y) {
		
		if(x>=y) {
			add = x + y;
			sub = x - y;
			mul = x * y;
			div = x / y;
			rest = x % y;
			
			System.out.println("덧셈:"+add);
			System.out.println("뺄셈:"+sub);
			System.out.println("곱셈:"+mul);
			System.out.println("나눗셈:"+div);
			System.out.println("나머지:"+rest);
			
		}else {
			add = y + x;
			sub = y - x;
			mul = y * x;
			div = y / x;
			rest = y % x;
			
			System.out.println("덧셈:"+add);
			System.out.println("뺄셈:"+sub);
			System.out.println("곱셈:"+mul);
			System.out.println("나눗셈:"+div);
			System.out.println("나머지:"+rest);
		}
		
	}//메소드 끝
}//클래스 끝
