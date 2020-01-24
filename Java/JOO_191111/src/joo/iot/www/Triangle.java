package joo.iot.www;

public class Triangle {

	//밑변과 높이 정보 
	float width;  //밑변
	float height; //높이
	
	//밑변과 높이 정보를 변경시킬 수 있는 메서드 
	
	void changeData(float width, float height) {
		this.width = width; //지역변수가 우선. this. -> 나 자신을 가리킴. 
		this.height = height;
		
	}
	
	//삼각형의 넓이를 계산해서 반환하는 메서드 
	//밑변 곱하기 높이 나누기2 
	 
	float area() {
		float result= 0.0f;
		
		result = width*height/2;
		
		
		return result;  //바로 리턴옆에 width*height/2 이렇게 사용해도 됨. 
	}
	
	public static void main(String[] args) {
		Triangle t = new Triangle();
		System.out.println("높이:"+t.height+", 밑변:" +t.width);
		t.changeData(3, 5);
		//데이터 수정
		System.out.println("데이터 설정==========================");
		System.out.println("높이:"+t.height+", 밑변:" +t.width);
		
		System.out.println("\n\"삼각형의 넓이\":"+t.area());
		
		
		
	}
}
