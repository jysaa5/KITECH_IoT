package ver04;

public class PhoneCompanyInfor extends PhoneInfor{

	
	//회사 company String 
	
	String company;
	
	public PhoneCompanyInfor(String name, String phoneNumber, String email, String company){
		super(name, phoneNumber, email);
		this.company = company;
}
	@Override
	void showInfor() {
		super.showInfor();
		super.showBasicInfor();
		System.out.println("회사이름: "+this.company);
	
}



}
