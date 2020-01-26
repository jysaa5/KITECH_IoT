package iot.java;

public class Player {
	// fields
	private int code;
	private String name;
	private String group;

	// methods : alt + shift + s
	// 생성자 : 메서드다... 1. 반환형 적지 않는다. 2. 클래스명과 일치
	// 생성자가 없는 경우는 없다....
	// 이름이 같은 메서드를 여러 개 만드는방법 : 매개변수는 다르다...
	@Override
	public String toString() {
		// TODO 기존 메서드를 새로운 메서드로 교체한다...
		return "Player{code:" + code + ",name:" + name + ",group:" + group + "}";
	}

	public Player() {
		super(); // 상위(부모) 의 생성자를 호출
	}

	public Player(int code, String id, String group) {
		// new Player();
		this.code = code;
		name = id;
		this.group = group;
	}

	public int getCode() { // output
		return code;
	}

	public void setCode(int code) { // input
		this.code = code;
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

	public int getCallValue() {
		// TODO : 상대에게 부를 값을 반환
		return 375;
	}

	public int[] getResponse(int callValue) {
		// TODO : 정답과 비교해서 결과 배열을 반환
		int[] rt = {0,0};
		return rt;
	}

	public void setResponse(int[] rv) {
		// TODO : 다음 값을 예측
		// 내가 부른 값
		// 대답 rv
		
	}

}
