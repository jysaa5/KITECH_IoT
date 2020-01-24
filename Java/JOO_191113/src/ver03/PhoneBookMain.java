package ver03;

import java.util.Scanner;


public class PhoneBookMain {

	//저장공간: 배열 생성
	//기능: 전화번호 정보 저장, 검색, 삭제, 찾기(검색어로 배열의 index 찾기)
	
	static PhoneInfor[] pBook = new PhoneInfor[100]; //메인함수에서 사용하려고 static을 사용.
	
	//저장된 정보의 개수: 저장시의 index, 배열의 반복의 조건, 저장된 정보의 개수 
	static int cnt = 0; 
	
	static Scanner sc = new Scanner(System.in);
	
	
	public static void main(String[]args) {
		
		while(true) {
			
		System.out.println("---------------------------------");
		System.out.println("원하시는 기능의 숫자를 입력해주세요.");
		System.out.println("1. 정보 입력");
		System.out.println("2. 정보 검색");
		System.out.println("3. 정보 삭제");
		System.out.println("4. 프로그램 종료");
		System.out.println("---------------------------------");
		
		int menuNum = sc.nextInt();
		sc.nextLine(); //버퍼 날리기 (fresh)
		switch (menuNum) {
		
		case 1:
			insert();
			break;
			
		case 2:
			searchInfo();
			break;
			
		case 3:
			deleteInfo();
			break;
		
		case 4:
			System.out.println("프로그램을 종료합니다.");
		return;
			
		}
		}
		
	
	}
	
	
	//저장기능
	public static void insert () {
		System.out.println("=================");
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String pNum = sc.nextLine();
		System.out.println("생일을 입력해주세요.");
		String dDay = sc.nextLine();
		
		PhoneInfor pi = null;
		
		if(dDay != null && dDay.trim().length() >0 ) { //dDay가 null이면 오류가 나온다. 하지만 조건문에 의해서 null이면 뒤에는 실행이 안됨. 
			pi = new PhoneInfor(name, pNum, dDay); //인스턴스 생성, 메서드 호출
		
		}else {
			pi = new PhoneInfor(name, pNum);// 인스턴스 생성, 메서드 호출 	
		}
		
		
		
	//	PhoneInfor pi = new PhoneInfor(name, pNum, dDay); //배열에 새로운 인스턴스를 생성해서 저장한 값을 넣기.
		
		pBook[cnt++] = pi;
		//저장된 횟수 증가 
		//cnt++;
		System.out.println("정상적으로 저장되었습니다.");
		
		//System.out.println("저장된 정보의 개수는: "+cnt);
		//System.out.println("=================");
		//pBook[cnt-1].showInfo();
		
	}
	
	
	//인덱스찾기
	public static int searchIndex(String name) {
		//index: 0~N-1 (N은 배열의 사이즈)
		//index는 음수가 없음.
		//찾는 index가 없다는 의미: -1 
		int index = -1;
		
		//index 찾기 : i -> 0~cnt-1
		for(int i=0; i<cnt; i++) {
			if(pBook[i].name.equals(name)) {
				index = i;
				break;
			}
			
		}
		
		return index;
	}
	
	//
	public static void searchInfo() {
		System.out.println("찾고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		int index = searchIndex(name);
		
		//index -> -1: 검색결과가 없다. 0 ~ cnt-1 
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		}else {
			pBook[index].showInfo();
		}
	}


	public static void deleteInfo() {
		System.out.println("삭제하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 업습니다.");
		}else {
			
			for(int i = index; i<cnt-1; i++) { //cnt 라고 하면 마지막 값을 null을 가져와서 넣는다. 
				pBook[i] = pBook[i+1];
				
			}
			
			cnt--;
			
			
			System.out.println("삭제되었습니다.");
		}
	}



}
