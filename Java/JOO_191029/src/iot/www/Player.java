package iot.www;

public class Player {
//field: 정보 (Player가 정보를 가지고있다.) = data =변수
//methods (할 수 있다.) -behavior
//methods: alt + shift + s
//생성자: 메서드다. 1. 반환형은 적지 않는다. 2. 클래스명과 일치 
//생성자가 없는 경우는 없다. 
//이름이 같은 메서드는 여러 개 만드는 방법: 매개변수는 다르다.
	
	private int code;
	private String name;
	private String group;
	
	public Player() {//기본 생성자 
		super();
		}
	
	@Override
	public String toString() {
		// 기존 메서드를 새로운 메서드로 교체한다. 
		return "Player{code:"+code+",name:"+name +",group:"+group+ "}";
	}

	public Player(int code, String id, String group) {//생성자
		//new Player(); 이걸 작성할때 호출되는 것.
	
		this.code = code; //this. :막 생성되는 인스턴스에 라는 뜻.매개변수 code를 대입해라. 이름이 같을 때 사용함. 필드와 매개변수 구분.
		name = id;
		this.group = group;
	}
	
	
	public int getCallValue() {
	//상대에게 부를 값을 반환하기. 
		
		return 375;
	} 
	
	public int[] getResponse(int callValue) {
		//정답과 비교해서 결과 배열을 반환
		int[ ]rt = {0,0}; // {스트라이크개수, 볼개수}
		
		return rt;
	}

	public void setResponse(int[] rv) {
		//다음 값을 예측
		//내가 부른 값에 대한 대답이 rv
		
	}

	
	public int getCode() { //output
		return code;
	}
	public void setCode(int code) {
		this.code = code; //변수와 매개변수가 이름이 같아서 this를 붙인 것이다.
	}
	public String getName() { 
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGroup() {
		return group;
	}
	public void setGroup(String group) {
		this.group = group;
	}

}//클래스 끝
