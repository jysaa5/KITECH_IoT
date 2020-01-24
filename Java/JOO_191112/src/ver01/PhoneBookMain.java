package ver01;

public class PhoneBookMain {

	public static void main(String[] args) {
		
		//데이터 저장: 인스턴스 생성
		PhoneInfor pi_1 = new PhoneInfor("홍길동", "010-9999-0000","2000-01-01");
		
		pi_1.showInfo();
		
		PhoneInfor pi_2 = new PhoneInfor("손흥민", "010-7777-7777");
		
		pi_2.showInfo();
	

	}//메인 끝
}//클래스 끝
