package Ver_04_userInputAndsingletonpattern;

public class SignUpUnivInfo extends SignUpDefaultInfo {

	//주소
	String address;
	//전공
	String major;
	//학년
	String year;
	
	//생성자
	public SignUpUnivInfo(String name, String phoneNumber, String email, String address, String major, String year) {
		super(name, phoneNumber, email);
		this.address = address;
		this.major = major;
		this.year = year;
	}
	
	//사용자 정보 출력
	@Override
	void showInfo() {
		super.showBasicInfo();
		System.out.println("주소 : " + this.address);
		System.out.println("전공: " + this.major);
		System.out.println("학년: " + this.year);
	}//showInfo 메서드 끝

}//SignUpUnivInfo 클래스 끝
