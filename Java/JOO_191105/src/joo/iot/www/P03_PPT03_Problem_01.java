package joo.iot.www;

public class P03_PPT03_Problem_01 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 20;
		int num3 = 30;
		
		num1 = num2 = num3; 
		
		System.out.println(num1);
		
		//대입연산자는 오른쪽에서 왼쪽으로 실행하므로, num3의 값을 num2에 대입하고 
		//num2의 값을 num1에 대입하므로 30이 출력된다. 
		
	}
}
