package Ver_03_userInputAndfunction;

import java.util.Scanner;

import Ver_01_adminInput.SignUpInfo;

public class SignUpMain_03 {
	
	//저장 공간: 배열 생성
	static SignUpInfo[] sBook = new SignUpInfo[100];
	
	//저장된 정보의 개수 : 저장시의 index, 배열의 반복의 조건, 저장된 정보의 개수
	static int cnt = 0;
    
	//사용자 입력을 받는 스캐너 객체
	static Scanner sc = new Scanner(System.in);

	//메인 실행 클래스에 함수 만들기 = 기능: 전화번호 정보 저장, 검색, 삭제, 찾기(검색어로 배열의 index 찾기)
    
	//main 실행 함수
	public static void main(String[] args) {
		
		while(true) {
			
			System.out.println("-----------------------------");
			System.out.println("원하시는 기능의 숫자를 입력해주세요.");
			System.out.println("1. 정보 입력");
			System.out.println("2. 정보 검색");
			System.out.println("3. 정보 삭제");
			System.out.println("4. 프로그램 종료");
			System.out.println("-----------------------------");
			
			//사용자 입력: 메뉴 번호 선택
			int menuNum = sc.nextInt();
			
			//입력한 한 줄 없애기
			sc.nextLine();
			
			
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
			
			System.out.println("-----------------------------");
			
		}
		
		
		
	}

	//기능
	//사용자 정보 입력하는 메서드
	private static void insert() {
		
		//사용자 입력을 스캐너 객체로 받기
		System.out.println("------------------------------");
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String pNum = sc.nextLine();
		System.out.println("생일을 입력해주세요.");
		String bDay = sc.nextLine();
		
		//사용자 입력 저장하는 객체 선언
		SignUpInfo pi=null;
		
		//생일 입력에 따른 객체 생성
		if(bDay != null && bDay.trim().length()>0 ){
			
			pi=new SignUpInfo(name, pNum, bDay);
		
		}
		
		else{
			
			pi=new SignUpInfo(name, pNum);
	
		}

		//배열에 저장
		sBook[cnt++] = pi;
		// 저장된 횟수 증가
		// cnt++;
		
		System.out.println("정상적으로 저장되었습니다.");
		
		
		//System.out.println("저장된 정보의 개수는 : " + cnt);
		//pBook[cnt-1].showInfo();
		
	}
	
	//사용자 정보를 이름으로 찾아서 index 반환하는 메서드
	public static int searchIndex(String name) {
		// index : 0 ~ N-1
		// index -> -1
		
		// 찾는 index가 없다의 의미 : -1
		int index = -1;
		
		// index 찾기 : i-> 0~cnt-1
		for(int i=0; i<cnt; i++) {
			
			if(sBook[i].name.equals(name)) {
				index = i;
				break;
				
			}
		}
		
		
		return index;
	}
	
	
	//사용자 정보 찾기 메서드
	private static void searchInfo() {

		System.out.println("찾고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		int index = searchIndex(name);
		
		// index -> -1:검색결과가 없다, 0~cnt-1
		if(index<0) {
			
			System.out.println("찾으시는 이름의 정보가 없습니다.");
			
		} else {
			
			//해당 인덱스의 사용자 정보 출력
			sBook[index].showInfo();
			
		}
		
 
		
	}
	
	//사용자 정보 삭제 메서드
	private static void deleteInfo() {
		
		System.out.println("삭제하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		int index = searchIndex(name);
		
		if(index<0){
			
			System.out.println("찾은시는 이름의 정보가 없습니다.");
			
		} else{
			
			//삭제할 인덱스에 뒤에 있는 데이터를 땡겨서 저장한다.
			for(int i=index; i< cnt-1;i++) {
				sBook[i] = sBook[i+1];
			}
			
			//전체 인덱스 1감소시킨다.
			cnt--;
			
			System.out.println("삭제되었습니다.");
			
		}	
	}


}//SignUpMain_03 클래스 끝
