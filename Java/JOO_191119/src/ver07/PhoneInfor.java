package ver07;

//상속의 목적 //추상 클래스가 됨. -> 인스턴스 생성이 불가 
abstract public class PhoneInfor { //default는 같은 패키지에서만 사용 가능 

	//이름 name            String
	//전화번호 phonNumber   String
	//이메일 email   String
	
	String name;
	String phoneNumber;   //010-9018-8548 -> 이렇게 저장 할 수 있다. 
	String email;
	
	//생성자: 초기화 메서드
	//데이터 초기화
	public PhoneInfor(String name, String phoneNumber, String email){
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	
	//데이터 출력하는 메서드
	void showBasicInfor() {
		System.out.println("이름: "+this.name); //굳이 this를 쓸 필요는 없다.
		System.out.println("전화번호: " + this.phoneNumber);
		System.out.println("이메일: " + this.email);
	}
	
	abstract void showInfor(); //추상메서드가 됨. 


	@Override
	public int hashCode() {
		int code = phoneNumber.charAt(phoneNumber.length()-1)%5;
		//0,1,2,3,4
		return code;
	}


	@Override
	public boolean equals(Object obj) {
	
		if(obj != null && obj instanceof PhoneInfor) {
			PhoneInfor pi = (PhoneInfor) obj;
			return phoneNumber.equals(pi.phoneNumber);
			
		}else {
			return false;
		}
	
	}
		
	
}//클래스끝





