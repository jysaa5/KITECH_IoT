package test;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest1 {

	public static void main(String[] args) {

		
		TreeSet <Integer> sTree = new TreeSet <Integer>();
		
		sTree.add(1);
		sTree.add(2);
		sTree.add(3);
		sTree.add(4);
		sTree.add(2);//중복허용 안함. 
		
		System.out.println("저장된 데이터의 개수: " +sTree.size());
		
		Iterator<Integer> itr = sTree.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}

}
