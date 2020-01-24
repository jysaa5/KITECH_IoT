package test;

public class ExceptionTest {

	public static void main(String[] args) {
		
	/*	int n = 0;
		if(n==0) {
			System.out.println("0으로 나눌수 없습니다.");
			return; 
		
		}
		
		int num = 10/0; 
		
	System.out.println(num);*/

	int number = 100;
	int result = 0; 
	
	for(int i=0; i<10; i++) {
		try {
		result = number/(int)(Math.random()*10);
		System.out.println(result);
		}catch(ArithmeticException ae) { //0이 나오면 catch쪽 부분으로 온다. //ae: 매개변수
		//	System.out.println("0으로 나누기는 할 수 없습니다."); 
			
			System.out.println(ae.getMessage());
			
			i--; //10개의 연산을 모두 받도록 함.
			
		}catch(ArrayIndexOutOfBoundsException aie) {
		}
		
	}
		
	}

}
