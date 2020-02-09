package Ver_04_userInputAndsingletonpattern;

import java.util.Scanner;


public class SignUpFunction {

	//객체 100개를 저장 : SignUpDefaultInfo 타입의 배열 생성, size : 100
	//insert 메서드 기능: 객체 생성 -> 배열에 객체 저장 -> 사용자 선택에 따라서 대학친구 객체 또는 회사친구 객체  
	//search 메서드 기능: 배열에서 검색 -> 검색 결과 출력
	//delete 메서드 기능: 배열에서 검색 -> 객체 삭제
	//showAll 메서드 기능: 배열에서 전체 리스트 출력
	
	//사용자 정보를 저장할 배열 생성
	SignUpDefaultInfo[] sBook ;
	
	//인덱스: 추가한 데이터의 개수
	int cnt;
	
	//스캐너 객체 선언: 콘솔 입력 변수 선언
	Scanner sc;
	
	// 싱글톤 패턴 : 인스턴스를 단 하나만 생성해서 사용하도록 처리
	// 1. 다른 객체에서 인스턴스 생성을 막는다. -> 생성자에 private 적용
	// 2. 인스턴스 자신이 인스턴스를 생성
	// 3. 외부에서 생성된 참조변수를 호출할수 있는 메서드를 생성
	
	//<<싱글톤패턴>>//
	
	//생성자
	private SignUpFunction() {
		//사용자 정보 입력할 배열 객체 생성
		sBook = new SignUpDefaultInfo[100];
		//스캐너 객체에 사용자 입력 저장
		sc = new Scanner(System.in);
	}
	
	//자신의 인스턴스 생성
	private static SignUpFunction signUp = new SignUpFunction();
	
	//외부에서 객체를 참조할 메서드 
	public static SignUpFunction getInstance() {
		
		if(signUp==null) {
			
			return new SignUpFunction();
		
		} else {
			
			return signUp;
		
		}
		
	}//SignUpFunction 메서드 끝
	
	
	//<<기능 메서드>>//
	//입력 -> 대학 OR 회사 선택
	//대학친구 입력 -> 1, 회사친구 입력 -> 2
	//검색 -> 3, 삭제 -> 4
	
	//<<입력>>//
	//insertInfo: 사용자 정보 입력 메서드
	void insertInfo(int select) {
		
		if (!(select==1 || select==2)) {
			System.out.println("옳바른 메뉴선택이 아닙니다. 다시 선택해주세요.");
			return;
		}
		
		//기본정보 입력 받는 구간
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNumber = sc.nextLine();
		System.out.println("이메일을 입력해주세요.");
		String email = sc.nextLine();
		
		//1 또는 2에 따라 입력 받고 -> 인스턴스 생성 -> 배열에 저장
		
		// 배열에 저장될 참조변수
		SignUpDefaultInfo sI = null;
		
		//1번 선택
		if(select==1) {
			System.out.println("주소를 입력해주세요.");
			String address = sc.nextLine();
			System.out.println("전공을 입력해주세요.");
			String major = sc.nextLine();
			System.out.println("학년을 입력해주세요.");
			String year = sc.nextLine();
			
			sI = new SignUpUnivInfo(name, phoneNumber, email, address, major, year);
			
		 //2번 선택
		 } else {
			System.out.println("회사이름을 입력해주세요.");
			String company = sc.nextLine();
			
			sI = new SignUpCompanyInfo(name, phoneNumber, email, company);
			
		 }
		
		sBook[cnt++] = sI;
		
		System.out.println("저장되었습니다.");
		
		//pBook[cnt-1].showBasicInfor();
		//System.out.println("=======================");
		//pBook[cnt-1].showInfor();
		
	}//insertInfo 메서드 끝
	
	//<<검색>>//
	//searchIndex: 이름을 기준으로 배열에서 index 찾아 반환하는 메서드
	int searchIndex(String name) {
		
		int index = -1; //찾지 못했을 때 반환값은 -1로 정의
		
		// 배열을 통해 이름 검색 : 반복문 이용
		for(int i=0; i<cnt; i++) {
			if(sBook[i].name.equals(name)) {
				index = i;
				break;
			}
		}
		return index;
	}//searchIndex 메서드 끝
	
	
	//searchInfo: 이름을 통해 검색한 결과의 정보를 출력하는 메서드
	void searchInfo() {
		
		System.out.println("검색하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		//index 검색
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		} else {
			//해당 사용자 정보 출력
			sBook[index].showInfo();
		}
	}//searchInfo 메서드 끝
	
	
	//<<삭제>>//
	//deleteInfo: 이름을 통해 검색한 결과의 정보를 삭제하는 메서드(정확히는 해당 내용 위에 덮어쓰기)
	void deleteInfo() {
		
		System.out.println("삭제하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		//index 검색
		int index = searchIndex(name);
		
		//예외처리: index가 음수로 반환될 경우의 예외 처리
		try {
		
			for(int i=index; i<cnt-1; i++) {
				sBook[i]=sBook[i+1];
			}			
			// 전체 개수에서 -1
			cnt--;			
			System.out.println("삭제되었습니다.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		}
	}//deleteInfo메서드 끝
	
	
	//<<출력>>//
	//showAll: 배열에 저장된 전체 데이터를 출력하는 메서드
	void showAll() {
			
			System.out.println("친구 리스트 ");
			System.out.println("---------------------");
			for(int i=0; i<cnt; i++) {
				//기본 정보만 출력
				sBook[i].showBasicInfo();
				System.out.println("___________________");
			}
		}
	
	
}//SignUpFunction 클래스 끝
