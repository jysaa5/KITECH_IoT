package joo.iot.www;

public class P06_String01 {

	public static void main(String[] args) {
		
		String str = "ABCDEFGHIJKLMN";
		StringBuffer strb = new StringBuffer();

		strb.append(str);
		System.out.println(strb.reverse());

	}//메인 끝
}//클래스 끝
