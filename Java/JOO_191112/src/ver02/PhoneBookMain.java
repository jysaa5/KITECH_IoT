package ver02;

import java.util.Scanner;

import ver01.PhoneInfor;

public class PhoneBookMain {

	public static void main(String[] args) {
	
		//PhoneInfor pi = new PhoneInfor ("김주연","010-9940-5925","1995-05-23");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("=================");
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String pNum = sc.nextLine();
		System.out.println("생일을 입력해주세요.");
		String dDay = sc.nextLine(); //데이터가 안들어오면 null이 아니라 공백을 나타냄
		
		//사용자가 입력한 생일 데이터 비교: 공백 여부 -> String.length 사용
		
		//System.out.println("문자열의 개수: " + dDay.trim().length());
		//trim():다른 문자를 제외하고 좌우 공백을 지워준다.
		//" 123  " -> "123"
		
		//new PhoneInfor(name, PhoneNumber, birthday);
		//new PhoneInfor(name, PhoneNumber);
		
		//System.out.println("이름: " + name + " 전화번호: "+ pNum + " 생일 : " +dDay );
		
		//사용자가 입력한 생일 데이터 비교: 공백 여부
		
		if(dDay != null && dDay.trim().length() >0 ) { //dDay가 null이면 오류가 나온다. 하지만 조건문에 의해서 null이면 뒤에는 실행이 안됨. 
			new PhoneInfor(name, pNum, dDay).showInfo(); //인스턴스 생성, 메서드 호출
		
		}else {
			new PhoneInfor(name, pNum).showInfo();// 인스턴스 생성, 메서드 호출 	
		}
		 
	
		}
	}

}
