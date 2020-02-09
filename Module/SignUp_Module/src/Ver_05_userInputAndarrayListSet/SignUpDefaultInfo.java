package Ver_05_userInputAndarrayListSet;

//상속의 목적: 추상클래스 -> 인스턴스 생성이 불가
public abstract class SignUpDefaultInfo {
	
	//이름
	String name;
	//전화번호
	String phoneNumber;
	//이메일
	String email;
	
	//생성자: 기본 데이터 초기화
	public SignUpDefaultInfo(String name, String phoneNumber, String email) {
		super();
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.email = email;
	}
	
	//showBasicInfor: 사용자 기본 정보 출력 메서드
	void showBasicInfor() {
		System.out.println("이름 : " + this.name);
		System.out.println("전화번호: " + this.phoneNumber);
		System.out.println("이메일: " + this.email);
	}
	
	//showInfor:추상메서드
	abstract void showInfo();

	//equals 메서드: 오버라이딩
	@Override
	public boolean equals(Object obj) {
				
		//전달받은 객체가 SignUpDefaultInfo 클래스의 자식인지 확인
		if(obj != null && obj instanceof SignUpDefaultInfo) {
			//전달 받은 객체를 SignUpDefaultInfo으로 형변환해서 객체에 저장
			SignUpDefaultInfo sI = (SignUpDefaultInfo) obj;
			//전달 받은 객체의 전화번호가 저장된 데이터들과 비교: true/false로 반환
			return phoneNumber.equals(sI.phoneNumber);
		} else {
			return false;
		}
	}//equals 메서드 끝

	//hashCode 메서드: 오버라이딩
	@Override
	public int hashCode() {
		
		int code = phoneNumber.charAt(phoneNumber.length()-1)%5;
				
		return code;
	}//hashCode 메서드 끝
		
}//SignUpDefaultInfo 추상 클래스 끝
