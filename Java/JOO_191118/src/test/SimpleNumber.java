package test;

import java.util.HashSet;
import java.util.Iterator;

public class SimpleNumber {

	int num;
	
	public SimpleNumber (int num) {
		this.num = num;
	}
	
	
	
	//hashCode 생성 : Object 클래스의 hashCode() 오버라이딩 
	@Override
	public int hashCode() {
		return num%3;
	}//hashcode 끝
	
	
	
	//equals() 메소드 오버라이딩 
	@Override
	public boolean equals(Object obj) {
	boolean result = false;
	
	if (obj != null && obj instanceof SimpleNumber) { //Object를 SimpleNumber로 바꿔야 num이 비교가 가능하다. 
		SimpleNumber sNum = (SimpleNumber)obj; //형변환
		if(sNum.num == num) { //기존의 num과 들어온 num의 비교 
			result = true;
		}
		
	}
		return result ;
	}//equals 끝
	
	
	
	
	//toString
	@Override
	public String toString() {
	
		return "SimpleNumber[num="+num+"]";
	}



	public static void main(String[] args) {
	
		HashSet<SimpleNumber> hSet = new HashSet<SimpleNumber>();
		
		hSet.add(new SimpleNumber(10));
		hSet.add(new SimpleNumber(20));
		hSet.add(new SimpleNumber(10));
		
		System.out.println("저장된 데이터의 개수:"+hSet.size());
		
		Iterator<SimpleNumber> itr = hSet.iterator();
		
		while (itr.hasNext()){
			System.out.println(itr.next()); //toString -> hashcode
		}
	}

	
}
