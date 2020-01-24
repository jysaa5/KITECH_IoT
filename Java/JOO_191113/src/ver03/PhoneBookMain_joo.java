package ver03;
import java.util.Scanner;

public class PhoneBookMain_joo {

	
	public static void main(String[] args) {
		PhoneInfor[] pi = new PhoneInfor [100];
		Scanner sc = new Scanner(System.in);
		int i = 0;
		
		while(true) 
		{
			System.out.println("=================");
			System.out.println("[1] 저장, [2] 검색, [3] 삭제");
			String num = sc.nextLine();
			
			if(num.equals("1")) {
			pi[i] = new PhoneInfor("이름", "01099405925", "19950523");
			System.out.println("=================");
			System.out.println("이름을 입력해주세요.");
			String name = sc.nextLine();
			pi[i].name = name;
			System.out.println("전화번호를 입력해주세요.");
			String pNum = sc.nextLine();
			pi[i].phoneNumber = pNum;
			System.out.println("생일을 입력해주세요.");
			String dDay = sc.nextLine(); //
			pi[i].birthday = dDay;
			i++;

			if(dDay != null && dDay.trim().length() >0 ) { //dDay가 null이면 오류가 나온다. 하지만 조건문에 의해서 null이면 뒤에는 실행이 안됨. 
				new PhoneInfor(name, pNum, dDay).showInfo(); //인스턴스 생성, 메서드 호출
			
			}else {
				new PhoneInfor(name, pNum).showInfo();// 인스턴스 생성, 메서드 호출 	
			}
			}else if(num.equals("2")){
			System.out.println("=================");
			System.out.println("검색할 이름을 입력해주세요.");
			String name = sc.nextLine();
			for(i=0; i<=pi.length; i++) {
				
				if(pi[i].name.equals(name)) {
					System.out.println(pi[i].name);
					System.out.println(pi[i].phoneNumber);
					System.out.println(pi[i].birthday);
					break;
				}
				
				if(i == pi.length) {
					System.out.println("검색결과가 없습니다.");
				}
				}
			}
				
			}
			
			
			

	}
	

}
