package ver07;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

//기능 클래스 
public class PhoneBookManager3 {
	
	//객체 100개를 저장 : PhoneInfor 타입의 배열 생성, size는 100
	//객체 생성 -> 배열에 객체 저장
	//대학 친구 객체, 회사 친구 객체 (객체 2개를 구분해줌): 메뉴 구성 
	//배열에서 검색 -> 검색 결과 출력 
	//배열에서 검색 -> 객체 삭제 
	//배열에서 전체 리스트 출력
	
	//배열 생성 -> ArrayList<PhoneInfor> -> HashSet<PhoneInfor>
	HashSet<PhoneInfor> pBook;
	//ArrayList<PhoneInfor> pBook;
	//PhoneInfor[] pBook; //생성자에서 생성. 
	
	//추가한 데이터의 개수 
//	int cnt; //카운터용, 추가 인덱스 
	
	// 콘솔 입력: 사용자 입력을 받아야 되므로. 
	Scanner sc;
	
	//싱글톤 패턴: 인스턴스를 단 하나만 생성해서 사용하도록 처리 
	//1.외부에서 다른 객체에서 인스턴스 생성을 막는다. -> 생성자에 private 적용 -> 클래스 안에서는 생성가능
	//2.인스턴스 자신이 인스턴스를 생성
	//3.외부에서 생성된 참조변수를 호출할 수 있는 메서드를 생성. 
	//기능만 있는 클래스는 싱글톤 처리를 한다. 
	
	
	public static PhoneBookManager3 getInstance() { //인스턴스를 생성하지 않아도 사용가능하도록 static을 씀.
		if(m==null) {
			return new PhoneBookManager3();
		}else {
		return m;
	}
	}
	
	private static PhoneBookManager3 m = new PhoneBookManager3(); //외부에서 참조변수값을 못 바꾸도록 private을 씀.
	
	//private으로 외부에서 인스턴스 생성을 막음. 
	private PhoneBookManager3(){ //생성자에서 사이즈를 받아서 인스턴스를 생성할 수 있다. 
		pBook = new HashSet<PhoneInfor>();
		sc = new Scanner(System.in);
	}
	
	//입력 -> 대학 OR 회사 
	//대학 친구 입력 -> 1, 회사 친구 입력 -> 2
	//검색 ->3 , 삭제 -> 4
	
	//입력
	void insertInfor(int select) {//사용자 선택 
		
		if(!(select == Menu.INSERT_UNIV || select == Menu.INSET_COM)) {
			System.out.println("올바른 메뉴 선택이 아닙니다. 다시 선택해주세요.");
			return;
		
		}else {
		
		//기본 정보 입력 받는다.
		System.out.println("이름을 입력해주세요.");
		String name = sc.nextLine();
		System.out.println("전화번호를 입력해주세요.");
		String phoneNumber = sc.nextLine();
		System.out.println("이메일을 입력해주세요.");
		String email = sc.nextLine();
		
		//배열에 저장될 참조변수
		PhoneInfor pi = null;
		
		//1또는 2에 따라 입력 받고 -> 인스턴스 생성 -> 배열에 저장 처리. 
		if(select == Menu.INSERT_UNIV) {
			System.out.println("주소를 입력해주세요.");
			String address = sc.nextLine();
			System.out.println("전공을 입력해주세요.");
			String major = sc.nextLine();
			System.out.println("학년을 입력해주세요.");
			String year = sc.nextLine();
			
			pi = new PhoneUnivInfor(name, phoneNumber, email, address, major, year);
			
			
		}else {
			System.out.println("회사이름을 입력해주세요.");
			String company = sc.nextLine();
			
			pi = new PhoneCompanyInfor(name, phoneNumber, email, company);
		}
		
	
	//	pBook[cnt++] = pi; //저장
		pBook.add(pi); //저장 
		
		System.out.println("저장되었습니다.");
		
	//	pBook[cnt-1].showBasicInfor();
	//	System.out.println("==============================");
	//	pBook[cnt-1].showInfor();
	//	System.out.println("==============================");
	}
	
	}
	
	
	//검색
	//이름을 기준으로 배열에서 index를 찾아 반환 
/*	int searchIndex(String name) {
		int index = -1; // 찾지 못했을 때 반환 값을 -1로 정의
		
		//배열을 통해 이름 검색: 반복문 이용 
		//List를 통해 이를 검색
		//pBook[i] -> pBook.get(index)
		for (int i=0; i<pBook.size(); i++) {
			if(pBook.get(i).name.equals(name)) {
				index = i; 
				break; 
			}
				
		}
		
		return index;
	}*/

	
	//검색 결과 출력
	//이름을 통해 검색한 결과의 정보를 출력
	void searchInfor() {
		
		System.out.println("검색하고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		Iterator<PhoneInfor> itr = pBook.iterator();
		boolean chk = false;

		
		while(itr.hasNext()) {
			PhoneInfor pi = itr.next();
			if(pi.name.equals(name)) {
				pi.showInfor();
				chk = true;
				break;
			
			}
		}
		
		if(!chk) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		}
		
		//index검색
		/*int index = searchIndex(name);
		
		if(index < 0) {
			System.out.println("찾으시는 이름의 정보가 없습니다.");
		}else {
			pBook.get(index).showInfor();
		}*/
}
		
		
	

	
	//삭제
	void deleteInfor() {
		System.out.println("삭제하고자 하는 이름을 입력해주세요.");
		String name = sc.nextLine();
		
		Iterator<PhoneInfor> itr = pBook.iterator();
		
		boolean chk = false;
		
		while(itr.hasNext()) {
			PhoneInfor pi = itr.next();
			if(pi.name.equals(name)) {
				itr.remove();
				System.out.println("삭제되었습니다.");
				chk = true;
				break;
			}
		}
			if(!chk) {
				System.out.println("찾으시는 이름의 정보가 없습니다.");
			}
		}
		
		
		//index 검색
		/*int index = searchIndex(name);
		
		try {//예외처리
		
		//shift
		for(int i=index; i <pBook.size(); i++ ) {
			pBook.add();
		}
		
		//전체 개수에서 -1 
		//cnt--;
		System.out.println("삭제되었습니다.");
		
		}catch(ArrayIndexOutOfBoundsException e){ //Exception으로 해도 된다.
			System.out.println("찾으시는 이름의 정보가 존재하지 않습니다.");
		}
	}*/
	

	
	//출력
	void showAll () {
		System.out.println("친구리스트");
		System.out.println("------------------");
		
		
		
		Iterator<PhoneInfor> itr = pBook.iterator();
		while(itr.hasNext()) {
			itr.next().showBasicInfor();
		}
		
	//	for(int i=0; i<pBook.size(); i++) {
	//		pBook.get(i).showInfor();
	//		System.out.println("___________________________");
	//	}
	}
	
}//클래스 끝
