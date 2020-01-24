package ver01;

public class PhoneInfor { //default는 같은 패키지에서만 사용 가능 

	//*이름 name            String
	//*전화번호 phonNumber   String
	//*생년월일 birthday     String
	
	private String name;
	private String phoneNumber;   //010-9018-8548 -> 이렇게 저장 할 수 있다.
	private String birthday;      //날짜 형식으로 저장하기 

	//데이터 초기화
	public PhoneInfor(String name, String phoneNumber, String birthday){
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.birthday = birthday;
	}
	
	public PhoneInfor(String name, String phoneNumber){
		this(name,phoneNumber, null); //this(): 다른 생성자 호출 -> 오버로딩 //String 타입은 참조변수이므로 아무것도 없으면 null 
	}
	
	//데이터 출력하는 메서드
	public void showInfo() {
		System.out.println("이름: "+name);
		System.out.println("전화번호: " + phoneNumber);
		
	//	birthday = (birthday==null)? "입력된 데이터가 없습니다.": birthday; //삼항연산자 
	//	System.out.println("생일: " + birthday);
		
		if(birthday == null) { //삼항연산자로도 표현할 수 있다. 
		System.out.println("생일:입력된 데이터가 없습니다.");
		}else {
			System.out.println("생일: " + birthday);
		}		
	}
}//클래스끝
