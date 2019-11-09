package joo.iot.www;
public class P04_P07_dowhile {

	public static void main(String[] args) {
	
		int i = 1;
		int j = 100;
		
		System.out.println("< 1부터 100까지 출력 >");
		
		do{
			System.out.println(i);
			i++;
			}while(i<=100);
		
		System.out.println("--------------------");
		System.out.println("< 100부터 1까지 출력 >");

		do{
			System.out.println(j);
			j--;
			}while(j>=1);
		
	}//메인 끝
}//클래스 끝
