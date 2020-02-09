package Ver_01_adminInput;

//SignUpInfo: 가입자의 이름, 휴대폰 번호, 생일 데이터를 저장하는 클래스
public class SignUpInfo {

	//이름
	public String name;
	//010-1111-2222
	public String phoneNumber;
	//2020.02.08
	public String birthday;
	
	//생성자
	public SignUpInfo(String name, String phoneNumber, String birthday) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}

	//birthday를 제외한 생성자
	public SignUpInfo(String name, String phoneNumber) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
	}
	
	//가입자의 데이터 출력하는 메서드
	public void showInfo() {
		System.out.println("------------------------------");
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + phoneNumber);
		
		if(birthday == null) {
			System.out.println("생일 : 입력된 데이터가 없습니다.");
			} else {
			System.out.println("생일 : " + birthday);
			}
		System.out.println("");
		
	}//showInfo메서드 끝
	
}//SignUpInfo 클래스 끝
