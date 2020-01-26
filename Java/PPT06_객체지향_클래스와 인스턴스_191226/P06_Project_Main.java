package joo.iot.www;
import java.util.Scanner;
public class P06_Project_Main {

	public static void main(String[] args) {
		
		String num; //사용자 입력번호 변수
		int j = 0; //저장된 데이터 배열의 요소번호 변수
		int i = 0; //배열의 요소번호 변수
		
		Scanner kb = new Scanner(System.in); //스캐너 인스턴스 생성
		
		P06_Project_PhoneInfor usershow = new P06_Project_PhoneInfor();
		P06_Project_PhoneInfor[] phin = new P06_Project_PhoneInfor [10]; //클래스 배열 생성, 배열 인스턴스 생성
		P06_Project_PhoneInfor[] phinread = new P06_Project_PhoneInfor[1]; //클래스 배열 생성, 배열 인스턴스 생성
		
		for(i=0; i<phin.length; i++) //배열요소 인스턴스 생성
		{
		    phin[i] = new P06_Project_PhoneInfor();
		}
		
		for(i=0; i<phinread.length; i++) //배열요소 인스턴스 생성
		{
			phinread[i] = new P06_Project_PhoneInfor();
		}
		
	while(true) 
	{
		usershow.firstshow();//사용자 메뉴 선택
		num = kb.nextLine(); //키보드로 받은 문자열 입력 저장
		
		if(num.equals("1")) //전화번호부 입력 단계
		{	
			if(j>=10) 
			{ //배열의 개수보다 많으면 입력을 못하게 한다.
				System.out.println("전화번호부 입력공간이 부족합니다.");
				break;
			}
			usershow.inputshow();
			
			do {
			usershow.nameshow();
			phin[j].name = kb.nextLine();
			System.out.println("");
			}
			while(phin[j].name.equals(""));
			
			
			do {
			usershow.phshow();
			phin[j].phoneNumber = kb.nextLine();
			System.out.println("");
			}
			while(phin[j].phoneNumber.equals(""));
			
				System.out.println("(선택입력)생년월일을 입력해주세요.");
				phin[j].birthday = kb.nextLine();
				System.out.println("");
				j++;
			
		}
		else if (num.equals("2")) //전화번호부 조회 단계
		{
			usershow.selectshow();
			num = kb.nextLine();
			
			if(num.equals("1")) 
			{
			System.out.println("조회할 이름을 입력해주세요."); //이름으로 조회
			phinread[0].name = kb.nextLine(); //조회하는 배열은 항상 0번 요소번호 배열에 저장.
			
			  for(j=0; j<10; j++) //이름으로 조회
			  {
				if(phinread[0].name.equals(phin[j].name)) 
				{
					System.out.println("이름: "+ phin[j].name);
					System.out.println("전화번호: "+ phin[j].phoneNumber);
					
					if(!phin[j].birthday.equals(""))
					{
						System.out.println("생년월일: "+ phin[j].birthday);
					}
				break;
				}
				if(j==9) 
				{
				System.out.println("검색결과가 없습니다.");
				}
			  }
			}
			else if(num.equals("2") )
			{
			System.out.println("조회할 전화번호를 입력해주세요."); //전화번호로 조회
			phinread[0].phoneNumber = kb.nextLine();
			
			for(j=0; j<10; j++) //전화번호로 조회
			{
				if(phinread[0].phoneNumber.equals(phin[j].phoneNumber)) 
				{
					 System.out.println("이름: "+ phin[j].name);
					 System.out.println("전화번호: "+ phin[j].phoneNumber);
					   if(!phin[j].birthday.equals("")) 
					   {
					      System.out.println("생년월일: "+ phin[j].birthday);
					   }
					   break;
				}
				if(j==9) 
				{
				System.out.println("검색결과가 없습니다.");
				}	
			}
			}
			else 
			{
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		else if(num.equals("3")) 
		{
			System.out.println("안녕히가세요.");
			break;
		}
		else 
		{
			System.out.println("잘못 입력하셨습니다.");
		}
	}//while문 끝
	kb.close();
	}//메인끝
}//클래스끝
