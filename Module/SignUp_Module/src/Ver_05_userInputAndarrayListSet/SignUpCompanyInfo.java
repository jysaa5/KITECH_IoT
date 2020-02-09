package Ver_05_userInputAndarrayListSet;

public class SignUpCompanyInfo extends SignUpDefaultInfo {

	//회사이름
	String company;
	
	//생성자
	public SignUpCompanyInfo(String name, String phoneNumber, String email, String company) {
		super(name, phoneNumber, email);
		this.company = company;
	}
	
	//showInfor 메서드: 오버라이딩
	@Override
	void showInfor() {
		super.showBasicInfor();
		System.out.println("회사이름: " + this.company);
	}//showInfor 메서드

}//SignUpCompanyInfo 클래스 끝
