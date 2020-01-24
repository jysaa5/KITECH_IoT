package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;


public class ArrayListTest {

	public static void main(String[] args) {


		//ArrayList<Integer> list = new ArrayList<Integer>();
		LinkedList<Integer> list = new LinkedList();
		
		//데이터 추가: add()
		list.add(new Integer(11));
		list.add(22); //autoboxing 됨. 자동으로 인스턴스로 만들어줌. 
		list.add(33);
		list.add(44);
		list.add(55);
		list.add(66);
		
		
		
		//데이터참조: 반복문for, for each 
		System.out.println("ArrayList의 요소 개수:"+list.size());
		
		for(int i=0; i<list.size(); i++) { //반복 회수 변경 가능
			System.out.println(list.get(i)); //참조값 -> toString() -> Integer -> value(값)을 출력
			
		}
		
		System.out.println("-----------------------------");
		
		for(Integer i : list) { //list에는 집합, collection, 배열 가능. -> 요소를 i에 넣음. 
			System.out.println(i);
		}

		//요소 삭제: remove(index)
		list.remove(0);
	System.out.println("-----------------------------");
		
		for(Integer i : list) { //list에는 집합, collection, 배열 가능. -> 요소를 i에 넣음. 
			System.out.println(i);
		}
		
		
		Iterator <Integer> itr = list.iterator();
		//itr.hasNext() //요소 존재 유무
		//itr.next()// Integer 데이터 변환
		//itr.remove()// 현재 위치의 데이터 삭제 
		
		//33데이터 삭제
		System.out.println("iterator를 이용한 삭제");
		while(itr.hasNext()) {
			//next() 데이터 줄세우기 
			Integer i = itr.next(); //변수를 안하면, next() 이걸로 계속 그 다음 요소값으로 내려감.
			System.out.println(i);
			if(i.equals(33)) {
				itr.remove();
			}
		}
		
		System.out.println("==================");
		
		//원본 리스트는 삭제됨. itr에 원본을 넣어줌. 
		itr = list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
	}

}
