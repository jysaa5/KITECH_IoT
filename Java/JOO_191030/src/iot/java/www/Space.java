package iot.java.www;

import java.time.LocalDateTime;

public class Space {// 주차를 할 수 있는 면
	int code; //공간의 식별 번호
	boolean able; //able -> true일때 주차 가능 
	String carNumber; // 차번호 문자열로 선언
	LocalDateTime in;
	LocalDateTime out;
	
	
	public int getCode() {
		return code;
	}
	
	public void setCode(int code) {
		this.code = code;
	}
	
	public boolean isAble() {
		return able;
	}
	
	public void setAble(boolean able) {
		this.able = able;
	}
	
	public String getCarNumber() {
		return carNumber;
	}
	
	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	
	public LocalDateTime getIn() {
		return in;
	}
	
	public void setIn(LocalDateTime in) {
		this.in = in;
	}
	
	public LocalDateTime getOut() {
		return out;
	}
	
	public void setOut(LocalDateTime out) {
		this.out = out;
	}

	

}
