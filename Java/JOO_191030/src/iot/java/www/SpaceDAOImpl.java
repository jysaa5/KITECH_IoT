package iot.java.www;
import java.util.ArrayList; //배열list클래스
import java.util.List; //list클래스

//import Space //패키지가 다르면 import

public class SpaceDAOImpl implements DAO { //데이터를 관리 해야 한다. 
	
	private Space[] park_spaces; //주차장의 공간은 정해져 있으므로 배열 사용 
	
	
	public SpaceDAOImpl() {//생성자
		park_spaces = new Space[10]; //주차장의 공간
		System.out.println("created DAO instance:::"); //만들어진거 쭈욱 출력 = 로고 
		}//SpaceDAOImpl 생성자끝
	

	@Override
	public Object insert(Object arg) { //object는 못 바꾼다. //전달 object로 하는 것이지만 실제는 Space를 전달.object클래스 부모 -> 자식의 클래스 모두 전달가능
		Space param = (Space)arg; //형변환한다. //Space객체를 생성해서 줌
		int idx = param.getCode(); 
		park_spaces[idx] = param; // 배열에 요소번호와 객체 추가. 
		return null;
		}//object를 추가하는 함수. 

	@Override
	public Object selectAll() {//object를 모두 검색하는 함수
		return park_spaces.clone(); //클론으로 복사해서 넘겨줌
		}

	@Override // 인터페이스에 있는것을 쓴 것이므로. 
	public int isEmpty() 
	{
		for(int i=0; i<park_spaces.length; ++i) //주차장에 빈공간이 있는지 반복문으로 탐색.
		{
			if(park_spaces[i] ==null)
			{
				return i;				
			}
		}
	 return -1; //빈자리가 없는 것. 
	}//isEmpty 함수 끝
	
	
	
	@Override
	public Object select(Object condition) //condition하나만으로 만들지 말고 검색해야 할것을 따로 빼서 만드는 것이 좋다. -> 필드별로 검색하는 것을 만들기. 
	{
		List<Space>rt = new ArrayList<Space>();
		//전달받은 객체의 필드중 값이 있는 것들을 비교한다. 예를 들어 AND / OR의 개념이 필요. 
		//검색을 어떻게 할 건지. 필드를 모두 찾을 건지. 2개를 찾는 건지. 1개라도 같은 값이 있으면 되는 건지 등등. (검색을 하려면 조건이 필요함.) 
		Space param =(Space)condition; //비교
		for (int i=0; i<park_spaces.length; ++i) {
			if(park_spaces[i] != null) {
				Space car = park_spaces[i];
				
				//null을 다 체크해야 한다. 
				if(param.getCarNumber().equals(car.getCarNumber())) 
					//객체간에 비교 = equals -> equals를 재정의 하라는 것은 이렇게 비교하는 것을 다시 만들어라. Space타입에 equals를 다시 override하면 됨.
				{
					rt.add(car);
				}
				if(param.getCode() == car.getCode())
				{
					rt.add(car);
				}
				if(param.getIn().equals(car.getIn()))
				{
					rt.add(car); 
				}
				
				//OR 개념이다. if 3개문일 때. -> 중복이 될 수 있다. -> 중복체크가 필요하다. //if의 중첩 -> AND 
			}
		}
	
		return rt;
	}

	@Override
	public Object update(Object arg) //덮어쓰기
	{
		int idx = ((Space)arg).getCode(); //요소번호에 덮어쓰기 get.Code는 식별값이므로 변경이 불가능 하고 idx만 변경 가능.
		park_spaces[idx] = (Space)arg;
		return null;
	}

	@Override
	public Object delete(int id) //차가 나갈때 비우는 것
	{
	park_spaces[id] = null;
		return null;
	}

	
	@Override //JDBC, JPA 
	public Space selectByCarNumber(String number) { //차번호 검색. //필요한 것만 찾을 수 있다.  // 데이터베이스: select나 find는 검색.selectBy데이터 컬럼명 -> 메서드 명의 규칙
		for(int i=0; i<park_spaces.length; i++) 
		{ //select는 검색이므로 for문을 사용한다. //참조형이므로 차가 뛰엄뛰엄있을때 null이 있을 수 있다.
		
			if(park_spaces[i] != null)
			{
			if(park_spaces[i].getCarNumber().equals(number)) 
			{ //해당 배열의 space타입에서 차번호를 가져오면 string이고 그걸 비교. 
				return park_spaces[i]; //요소번호 반환
			}
	     	}
		}
	
		return null; //해당 차량이 없다. 
	}

}// SpaceDAOImpl 클래스 끝
