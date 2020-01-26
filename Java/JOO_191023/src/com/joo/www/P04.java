package com.joo.www;


public class P04 {

	public static void main(String[] args) {
	//	Main.main(args); // 실행 인스턴스 없이 바로 실행시킨다.
		// TODO Auto-generated method stub
		Person.serail =100;
		Person p1 = new Person(); //인스턴스 p1 
		Person p2 = new Person();//인스턴스 p2
		Person p3 = new Person();//인스턴스 p3 
		System.out.println(p1.serail);
		System.out.println(p2.serail);
		System.out.println(p3.serail);
	
		
		// 클래스형 변수는 반드시 생성(new)를 해야한다. 생성물이있어야됨.
	//	System.out.println(person);// 초기화 해야됨. 
		//멤버를 가지고 있다. 클래스 변수명.멤버명
		//변수에 null 인 경우에는.NullPoint
		
		/*if(person!=null) {
			person.code = 10;
			person.name ="jdk";
			System.out.println(person.code);
			System.out.println(person.name);
			System.out.println(person.phone);
			System.out.println(person.weight);
		}*/
		

	}

}
