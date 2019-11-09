package joo.iot.www;

public class P06_String02 {

	public static void main(String[] args) {
	
		String str = "990929-1010123";
		
		System.out.println(str);
		
		str = str.replaceAll("-","");
		
		System.out.println(str);
		
	}//메인 끝
}//클래스 끝
