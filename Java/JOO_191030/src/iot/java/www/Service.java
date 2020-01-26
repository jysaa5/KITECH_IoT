package iot.java.www;

import java.time.LocalDateTime;
import java.util.List;

public class Service {
	
	private DAO space;
	//main 메서드에서 service에게 요청 할 것이다 = 함수(메서드)를 만들어서 main 쪽에서 실행 시킬수 있게 만들어라
	
	
	
	public Service() { //생성자에서 데이터 주입하기. 필드 만들어서 넣어놓는 것보다. 
	    super(); // 상위 클래스의 생성자를 꼭 호출하고 해라. 
		space = new SpaceDAOImpl(); //구현체 
		System.out.println("created Service instance:::"); //만들어진거 쭈욱 출력 = 로고 
		
	}
	
	public void todo() {
	
}

	public boolean hasEmpty() {//빈공간 확인 //반환타입은 boolean 
		boolean state = false; //빈자리 있으면 true / 없으면 false 
		Space condition = new Space();
		condition.setAble(true); //조건 
		Object rt = space.select(condition); //select가 반환하는 건 object //DAO 쪽에 가서 조건에 일치하는 것을 쫙 뽑아서 달라. //select 검색 기능
		List<Space>list = (List<Space>)rt; //list -> object-> list (list객체를 만들어서 object에 얹어서 다시 list로 줌)
		
		if(list.size()>0)
		{
			state = true; //사이즈를 알 수 있음. 
		}
			return state;
	}

	public int isEmpty() {
		
		return space.isEmpty();
	}

	public void inCar(String number, int idx) {

		Space temp = new Space();
		temp.setCode(idx); //주차장 번호  
		temp.setCarNumber(number); //차번호 
		temp.setIn(LocalDateTime.now()); //차가 들어온 시간
		
		space.insert(temp); //DAO에 저장 
		
		
	}

	public Space selectByNumber(String number) {
		
		return space.selectByCarNumber(number);
	}

	public Space[] selectAll() {
		
		return (Space[])space.selectAll();
	}

	public void remove(Space outCar) {

		int id = outCar.getCode(); //배열 요소 번호
		space.delete(id);
	}
	
}
