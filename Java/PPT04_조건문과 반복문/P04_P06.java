package joo.iot.www;
public class P04_P06 {

	public static void main(String[] args) {
		int i = 1;
		int num = 0; 
		int sol = 0;
		
		while (i < 100) 
		{
			num++;
			sol = sol + num ; //수치를 누적해서 계산
			i++;
		}
		System.out.println(sol);

	}//메인 끝
}//클래스 끝
