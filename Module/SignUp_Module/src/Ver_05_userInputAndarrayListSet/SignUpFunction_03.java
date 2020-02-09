package Ver_05_userInputAndarrayListSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;


//SignUpFunction_03: 기능 클래스 -> HashSet 사용
public class SignUpFunction_03 {
	
	//HashSet 생성
	HashSet<SignUpDefaultInfo> sBook3;

	//스캐너 객체 선언: 콘솔에 입력된 데이터 저장
	Scanner sc;
	
	//<<싱글톤 패턴>>//
	//생성자
	private SignUpFunction_03() {
		sBook3 = new HashSet<SignUpDefaultInfo>();
		sc = new Scanner(System.in);
	}
		
	//객체 생성
	private static SignUpFunction_03 signUp = new SignUpFunction_03();
				
	//getInstance: 객체 주입 메서드 선언
	public static SignUpFunction_03 getInstance() {
		
		if(signUp==null) {
				
		return new SignUpFunction_03();
		
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
			
		//1 또는 2에 따라 입력 받고 -> 인스턴스 생성 -> 해시셋에 저장
			
		//헤시셋에 저장될 참조변수
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
			
		//헤시셋에 사용자 정보 추가
		sBook3.add(si);
		System.out.println("저장되었습니다.");
			
	}//insertInfo 메서드 끝
	
	
	//searchInfo: 이름으로 사용자 정보 찾는 메서드
	//이름을 통해 검색한 결과의 정보를 출력
	void searchInfo() {
		
		System.out.println("검색하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		//HashSet의 요소값을 가져온다.
		Iterator<SignUpDefaultInfo> itr = sBook3.iterator();
		
		boolean chk = false;
		
		//다음 요소가 있는지 판단
		while(itr.hasNext()) {
			//다음 요소값을 가져온다.
			SignUpDefaultInfo si = itr.next();
			if(si.name.equals(name)) {
				si.showInfo();
				chk = true;
				break;
			}
		}
		
		if(!chk) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		}
		
	}//searchInfo 메서드 끝
	
	
	//deleteInfo: 사용자 정보를 삭제하는 메서드
	void deleteInfo() {
		System.out.println("삭제하고자하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		//HashSet의 요소값을 가져온다.
		Iterator<SignUpDefaultInfo> itr = sBook3.iterator();
		
		boolean chk = false;
		
		while(itr.hasNext()) {
			SignUpDefaultInfo si = itr.next();
			if(si.name.equals(name)) {
				itr.remove();
				System.out.println("삭제되었습니다.");
				chk=true;
				break;
			}
		}

		if(!chk) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		}
	}//deleteInfo 메서드 끝
	
	
	//showAll: HashSet에 저장된 전체 데이터를 출력
	void showAll() {
		
		System.out.println("친구 리스트 ");
		System.out.println("---------------------");
		
		//HashSet의 요소값을 가져온다.
		Iterator<SignUpDefaultInfo> itr = sBook3.iterator();
		
		while(itr.hasNext()) {
			itr.next().showBasicInfor();
		}
		
	}//showAll 메서드 끝
	
}//SignUpFunction_03 클래스 끝
