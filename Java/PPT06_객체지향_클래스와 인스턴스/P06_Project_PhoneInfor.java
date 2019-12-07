package joo.iot.www;
public class P06_Project_PhoneInfor {

	String name;
	String phoneNumber;
	String birthday;
	
	public P06_Project_PhoneInfor(String na, String ph, String bi){
		name = na;
		phoneNumber = ph;
		birthday = bi;
		
	}//생성자오버로딩
	
	public P06_Project_PhoneInfor(){
		
	}//기본 생성자
	
	

	//메서드
	public void firstshow() 
	{
		System.out.println("[1]전화번호부 입력, [2]전화번호부 조회, [3]종료");
	}
	
	public void inputshow() 
	{
		System.out.println("<전화번호부 입력>");
		System.out.println("==========================");
	}
	
	public void nameshow() 
	{
		System.out.println("(필수입력)이름을 입력해주세요.");
	}
	
	public void phshow() 
	{
		System.out.println("(필수입력)전화번호를 입력해주세요.");
	}
	
	public void selectshow() 
	{
		System.out.println("<전화번호부 조회>");
		System.out.println("==========================");
		System.out.println("[1] 이름으로 조회, [2]전화번호로 조회");
	}
	
	
	
}//클래스 끝
