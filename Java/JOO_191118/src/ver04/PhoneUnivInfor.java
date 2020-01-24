package ver04;

public class PhoneUnivInfor extends PhoneInfor{
	
	//주소  address String
	//전공  major   String
	//학년  year    String
	
	String address;
	String major;
	String year;
	
	PhoneUnivInfor(String name, String phoneNumber, String email, String address, String major, String year){
		super(name, phoneNumber, email); //순서가 바뀌면 오류이다. 
		this.address = address;
		this.major = major;
		this.year = year;
	}

	@Override //부가적인 의미를 부여하고 있다. 오버라이드
	void showInfor() {
		super.showInfor(); //지워도 상관 없다. 
		super.showBasicInfor(); //PhoneInfor에 있는 것이 출력된다. 메소드가 호출됨.
		System.out.println("주소: "+this.address);
		System.out.println("전공: "+this.major);
		System.out.println("학년: "+this.year);
		}
	
	
	
}
