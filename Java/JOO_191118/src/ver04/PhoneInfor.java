package ver04;

//상속의 목적
public class PhoneInfor { //default는 같은 패키지에서만 사용 가능 

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
	
	void showInfor() {
			
		}
		
	
}//클래스끝





