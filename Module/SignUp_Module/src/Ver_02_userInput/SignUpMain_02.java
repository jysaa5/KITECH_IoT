package Ver_02_userInput;

import java.util.Scanner;

import Ver_01_adminInput.SignUpInfo;

//SignUpMain: 사용자 입력을 받아서 데이터를 저장하는 메인 실행 클래스
public class SignUpMain_02 {
	
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
		
		
		while(true) {

			System.out.println("------------------------------");
			System.out.println("이름을 입력해주세요.");
			String name = scanner.nextLine();
	
			System.out.println("전화번호를 입력해주세요.");
			String pNum = scanner.nextLine();
			
			//필수항목인 이름과 전화번호를 체크하는 구간
			if(name==null || name.trim().length()<=0 || pNum == null || pNum.trim().length()<=0) {
				System.out.println("------------------------------");
				System.out.println("이름과 전화번호를 정확히 입력해주세요.");
				continue;
			}
			
			System.out.println("생일을 입력해주세요.");
			String bDay = scanner.nextLine();
			

			//new SignUpInfo(name, phoneNumber, birthday);
			//new SignUpInfo(name, phoneNumber)		
			//System.out.println("이름 : " + name + "전화번호: " + pNum + "생일: " + bDay);
			// " 123   ".trim() -> "123"
			//System.out.println("문자열의 개수 : " + bDay.trim().length()); // "   " -> ""
			
			
			// 사용자가 입력한 생일 데이터가 있는지 없는지 체크하는 구간
			if(bDay != null && bDay.trim().length()>0 ) 
			{
				new SignUpInfo(name, pNum, bDay).showInfo();
				
			} else {
				
				new SignUpInfo(name, pNum).showInfo();
			}
			
		}//while문 

	}//main 메서드 끝
	
}//SignUpMain 클래스 끝
