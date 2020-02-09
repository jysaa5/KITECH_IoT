package Ver_01_adminInput;

//SignUpMain: 프로젝트를 실행하는 메인 클래스
public class SignUpMain_01 {
	
	public static void main(String args[]) {
		
		//가입자의 데이터 저장: 인스턴스 생성
		SignUpInfo signUp_1 = new SignUpInfo("김주연", "010-1111-2222", "2005-05-05");
		
		signUp_1.showInfo();
		
		//가입자의 데이저 저장: 인스턴스 생성
		SignUpInfo signUp_2 = new SignUpInfo("PengSoo", "010-7777-7777");
		
		signUp_2.showInfo();

		
	}

}
