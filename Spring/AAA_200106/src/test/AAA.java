package test;

public class AAA {

	//Object o = new BBB(); //BBB클래스에 의존하고 있음.
	//Object o = new CCC();//CCC클래스에 의존하고 있음.
	
	Object o; //Object는 다 갖고 있는 것이다.
	
	//방법1
	//메서드 //참조변수에 넣을 객체를 전달받아서 선언
	void setObject(Object o) {
		this.o = o;
	} //조립기 //의존성이 줄어듬
	
	//방법2
	//생성자
	AAA(Object o){
		this.o = o;
	}
	
	//Object말고 상위클래스 생성
	//인터페이스를 만들어서 상위 클래스 타입으로 받아서 객체를 선언.
	
	void print () {
		o.toString();
	}
	
}
