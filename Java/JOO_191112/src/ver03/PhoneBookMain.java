package ver03;
import java.util.Scanner;
import ver01.PhoneInfor;

public class PhoneBookMain {

	public static void main(String[] args) {
		PhoneInfor[] pi = new PhoneInfor [100];
		Scanner sc = new Scanner(System.in);
		
		while(true) 
		{
			System.out.println("=================");
			System.out.println("이름을 입력해주세요.");
			String name = sc.nextLine();
			System.out.println("전화번호를 입력해주세요.");
			String pNum = sc.nextLine();
			System.out.println("생일을 입력해주세요.");
			String dDay = sc.nextLine(); //
			

			if(dDay != null && dDay.trim().length() >0 ) { //dDay가 null이면 오류가 나온다. 하지만 조건문에 의해서 null이면 뒤에는 실행이 안됨. 
				new PhoneInfor(name, pNum, dDay).showInfo(); //인스턴스 생성, 메서드 호출
			
			}else {
				new PhoneInfor(name, pNum).showInfo();// 인스턴스 생성, 메서드 호출 	
			}

	}
	}

}
