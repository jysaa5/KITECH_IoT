package Ver_04_userInputAndsingletonpattern;

//다른 클래스에서 상속하는 클래스
public class SignUpDefaultInfo {
	
	//이름
	String name;
	//전화번호
	String phoneNumber;
	//이메일
	String email;

	// 생성자 : 초기화 메서드
	// 기본 데이터 초기화	
	public SignUpDefaultInfo(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}

	//사용자 입력 기본 출력
	void showBasicInfo() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호: " + this.phoneNumber);
		System.out.println("이메일: " + this.email);
	}

	//사용자 입력 출력
	void showInfo() {}
	
}//SignUpDefaultInfo 클래스 끝
