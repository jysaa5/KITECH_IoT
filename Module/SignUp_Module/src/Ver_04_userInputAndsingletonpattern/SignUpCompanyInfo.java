package Ver_04_userInputAndsingletonpattern;

public class SignUpCompanyInfo extends SignUpDefaultInfo {
	
	//회사 이름
	String company;

	//생성자
	public SignUpCompanyInfo(String name, String phoneNumber, String email, String company) {
		super(name, phoneNumber, email);
		this.company = company;
	}

	//showInfor
	@Override
	void showInfo() {
		super.showBasicInfo();
		System.out.println("회사이름: " + this.company);
	}//showInfo 메서드 끝

}//SignUpCompanyInfo 클래스 끝
