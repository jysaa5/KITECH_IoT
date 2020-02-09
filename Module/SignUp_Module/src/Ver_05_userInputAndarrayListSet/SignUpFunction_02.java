package Ver_05_userInputAndarrayListSet;

import java.util.ArrayList;
import java.util.Scanner;

//SignUpFunction_02: 기능 클래스 = 리스틀 사용
public class SignUpFunction_02 {

	
	//리스트 생성 -> ArrayList<SignUpDefaultInfo>
	ArrayList<SignUpDefaultInfo> sBook2;
	
	//스캐너 객체 선언: 콘솔에 입력된 데이터 저장
	Scanner sc;
	
	//<<싱글톤 패턴>>//
	//생성자
	private SignUpFunction_02() {
		
		sBook2 = new ArrayList<SignUpDefaultInfo>();
		sc = new Scanner(System.in);
	}
	
	//객체 생성
	private static SignUpFunction_02 signUp = new SignUpFunction_02();
			
	//getInstance: 객체 주입 메서드 선언
	public static SignUpFunction_02 getInstance() {
		if(signUp==null) {
			
			return new SignUpFunction_02();
			
		} else {
			
			return signUp;
		}
	}//getInstance 메서드 끝
	
	//<<기능 메서드>>//
	//insertInfo: 사용자 정보 삽입 메서드
	void insertInfo(int select) {
		
		if (!(select==Menu.INSERT_UNIV  || select==Menu.INSERT_COM)) {
			System.out.println("옳바른 메뉴선택이 아닙니다. 다시 선택해주세요.");
			return;
		}
		
		//기본정보 입력 받아서 저장
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNumber = sc.nextLine();
		System.out.println("이메일을 입력해주세요.");
		String email = sc.nextLine();
		
		//1 또는 2에 따라 입력 받고 -> 인스턴스 생성 -> 리스트에 저장
		
		//리스트에 저장될 참조변수
		SignUpDefaultInfo si = null;
		
		if(select==Menu.INSERT_UNIV) {
			System.out.println("주소를 입력해주세요.");
			String address = sc.nextLine();
			System.out.println("전공을 입력해주세요.");
			String major = sc.nextLine();
			System.out.println("학년을 입력해주세요.");
			String year = sc.nextLine();
			
			si = new SignUpUnivInfo(name, phoneNumber, email, address, major, year);
			
		} else {
			System.out.println("회사이름을 입력해주세요.");
			String company = sc.nextLine();
			
			si = new SignUpCompanyInfo(name, phoneNumber, email, company);
			
		}
		
		//리스트에 사용자 정보 추가
		sBook2.add(si);
		
		System.out.println("저장되었습니다.");
		
	}//insertInfo 메서드 끝
	
	
	//searchIndex: 사용자 index번호를 반환하는 메서드
	//이름을 기준으로 배열에서 index 찾아 반환
	int searchIndex(String name) {
		
		int index = -1; // 찾지 못했을 때 반환값은 -1로 정의
		
		// 배열을 통해 이름 검색 : 반복문 이용
		for(int i=0; i<sBook2.size(); i++) {
			if(sBook2.get(i).name.equals(name)) {
				index = i;
				break;
			}
		}
		
		return index;
	}//searchIndex 메서드 끝
	
	
	//searchInfo: 이름으로 사용자 정보 찾는 메서드
	//이름을 통해 검색한 결과의 정보를 출력
	void searchInfo() {
		
		System.out.println("검색하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		//index 검색
		int index = searchIndex(name);
		
		if(index<0) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		} else {
			sBook2.get(index).showInfor();
		}
	}//searchInfo 메서드 끝
	
	
	//deleteInfo: 사용자 정보를 삭제하는 메서드
	void deleteInfo() {
		
		System.out.println("삭제하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		//index 검색
		int index = searchIndex(name);
		
		try {
		
			sBook2.remove(index);
			System.out.println("삭제되었습니다.");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
			
		}
	}//deleteInfo 메서드 끝
	
	
	//showAll: 배열에 저장된 전체 데이터를 출력
	void showAll() {
		
		System.out.println("친구 리스트 ");
		System.out.println("---------------------");
		for(int i=0; i<sBook2.size(); i++) {
			sBook2.get(i).showBasicInfor();
			System.out.println("___________________");
		}
	}//showAll 메서드 끝
	
	
}//SignUpFunction_02 클래스 끝
