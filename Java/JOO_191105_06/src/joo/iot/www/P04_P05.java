package joo.iot.www;
public class P04_P05 {

	public static void main(String[] args) {
		int num=0;
		num = (int)((Math.random()*800)-400);
		System.out.println(num);
		
		if(num>0) 
		{
			num = num/100;
		}
		
		switch (num) 
		{
		case 0: System.out.println("0이상 100미만");
		break;
		
		case 1: System.out.println("100이상 200미만");
		break;
		
		case 2: System.out.println("200이상 300미만");
		break;
		
		case 3: case 4: System.out.println("300이상");
		break;
		
		default: System.out.println("0미만");
		break;
		}
		
	}//메인 끝
}//클래스 끝
