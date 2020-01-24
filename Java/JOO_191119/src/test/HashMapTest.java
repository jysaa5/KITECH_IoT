package test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeMap;

public class HashMapTest {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		
		//저장: put(key,value)
		map.put(new Integer(1), "Scott");
		map.put(2, "Lee");
		map.put(8, "king");
		System.out.println("===============");
		//참조: get(key)
		System.out.println("1번 : "+map.get(new Integer(1)));
		System.out.println("2번 : "+map.get(2));//autoboxing이 된다.
		System.out.println("8번 : "+map.get(8));
		
		//삭제: remove(key)
		//map.remove(2);
		
		System.out.println("2번 : "+map.get(2));
		//System.out.println("2번 : "+map.get(2).length());
	
		System.out.println("===============");
		TreeMap<Integer, String> tMap = new TreeMap<Integer, String>();
		tMap.put(new Integer(1), "Scott");
		tMap.put(2, "Lee");
		tMap.put(8, "king");
		tMap.put(4, "kim");
		System.out.println("===============");
		NavigableSet<Integer> navi = tMap.navigableKeySet();
		
		Iterator<Integer> itr = navi.iterator();
		
		while(itr.hasNext()) {
			//itr.next(); //map의 key 값
			System.out.println(tMap.get(itr.next()));	
		}
		System.out.println("===============");
		itr = navi.descendingIterator();
		
		while(itr.hasNext()) {
			//itr.next(); //map의 key 값
			System.out.println(tMap.get(itr.next()));	
		}
	}

}
