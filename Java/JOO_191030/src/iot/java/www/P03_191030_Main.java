package iot.java.www;
import java.util.Scanner; //키보드클래스
import java.time.LocalDateTime; //시간 클래스
import java.time.ZoneOffset; //시간을 초단위로 바꾸는 클래스

public class P03_191030_Main {
	
	public static void main(String[] args) {
		//인터페이스는 객체를 생성할 수 없다.
	//	DAO dao =new DAOImpl();
	//	Space arg = new Space(); //Space 생성 , up / down
	//	dao.insert(arg); 
		Service service = new Service();
		Scanner kb = new Scanner(System.in);
		//전달
		String cmd = ""; //메뉴 키보드 입력
		while(true)
		{
			//현재 주차장 현황 
			Space[] park = service.selectAll(); 
			for(int i=0; i<park.length; i++) 
			{
				//i번 요소가 null일수 있다. 
				if (park[i] ==null) 
				{
					System.out.println(i+":empty");
				}
				else{
				System.out.println(i+":"+park[i].getCarNumber());
				}
			}//for문 끝
			
			System.out.println("cmd > ");
			cmd = kb.nextLine();
			
			if("exit".equals(cmd))
			{
				break;
			}
			if("in".equals(cmd)) 
			{
				//1.만차확인 - 빈공간 확인 
				int idx = service.isEmpty();
				
				if(idx != -1)
				{ //빈자리가 있을 때 //true or false
					System.out.println("car number >");
					String number = kb.nextLine(); //차번호 
					service.inCar(number, idx ); //차번호 입력 받은 것을 전달받아야됨. 	
				}
				else 
				{//빈자리가 없을때
					System.out.println("Full go out");
				}
			}//차가 들어올때 if문 끝
			
				if("out".equals(cmd)) 
				{//차가 나갈때 
					System.out.println("car number >"); //나가는 차 정보 조회
					String number = kb.nextLine(); //차번호 
					Space outCar = service.selectByNumber(number); //서비스단으로 넘어가도 좋다.
					if(outCar == null) 
					{//차번호가 null일때
						System.out.println("주차된 차량이 아님");
					}
					else 
					{
					outCar.setOut(LocalDateTime.now()); //차가 나가는 시간  //서비스단으로 넘아가도 좋다. 
					System.out.println(outCar.getIn());
					System.out.println(outCar.getOut());
					long diff = outCar.getOut().toEpochSecond(ZoneOffset.UTC) - outCar.getIn().toEpochSecond(ZoneOffset.UTC); 
					//초단위를 정수로 바꿔줌. 시간 자체를 정수로 바꿔서 계산하는 게 좋다. 
					long price = 10000 + (diff*5000); //초단위로 5000원 붙는다. 
					System.out.println(price+"원 주세요");
					//long 타입 - 정수 8bytes
					service.remove(outCar);
					
					}
				
				}//차가 나갈때 if문 끝
				
		}//while문 끝
		kb.close();
	}//메인 함수끝
}//클래스 함수 끝
