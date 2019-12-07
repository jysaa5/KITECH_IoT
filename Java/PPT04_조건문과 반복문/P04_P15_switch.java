package joo.iot.www;
public class P04_P15_switch {

	public static void main(String[] args) {
	
		int n = 0; 
		n = (int)(Math.random()*11);
		
		switch(n) {
		
		case 0 : System.out.println("현재 인원 0명 입니다.");
		    break;
		
		case 1 : System.out.println("현재 인원은 1명 입니다.");
			break;
		
		case 2 : System.out.println("현재 인원은 2명 입니다.");
			break;
			
		case 3 : System.out.println("현재 인원은 3명 입니다.");
			break;
			
		default : System.out.println("현재 많은 사람들이 있습니다.");
			break;
		}
		
	}//메인 끝
}//클래스 끝
