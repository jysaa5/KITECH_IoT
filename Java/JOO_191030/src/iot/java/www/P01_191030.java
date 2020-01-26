package iot.java.www;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class P01_191030 {
	
public static void main(String[] args) {
//Collections : 다수의 데이터들을 모은 집합체 = 자료구조(보이질 않아서 힘들다.)
// 참조형(클래스 객체): 위치(주소)로 접근하는 방식
// 객체명.멤버명(변수, 함수(메서드)) : 객체명 == null 이면 아무것도 할 수 없다. 
//선형구조: 배열(연속), 연결리스트(비연속 - 방향: 단방향, 양방향-네트워킹)
//비선형구조: 망(거미줄), 트리, 그래프
//testLinkedList();
List<String>list = new ArrayList<String>(); //<> :타입. 제네릭, 재너릭 // 리스트를 만든다. //부모 = new 자식
list.add("first String1"); //for문에서 했던 것.
list.add("first String2");
list.add("first String3");
list.add("first String4");
list.add("first String5");

System.out.println(list.size());

for (String el:list)
{
	System.out.println(el);
}
		
		

}//메인함수 끝

	private static void testLinkedList() {
	//단방향
		Node head = null;// 처음 생성된 노드
		Node tail = null; // 마지막 노드 (시간상으로 보면 가장 최근 것) 
		Node temp = null; 
		//추가하기 : 10개
		//입력된 순서대로 출력한다 = q방식
		
		for(int i=1; i<=10; ++i) {
			//노드 생성
			temp = createNode(i);
			//연결하기.
			append(temp, tail, head, true); //add 동작	
		}
		
		temp = head; 
		while(temp != null) 
		{//null 이면 멈춘다.
			System.out.println(temp.value);
			temp = temp.left; //
		}
		
		
		
		/*	Node head = null;// 처음 생성된 노드
		Node tail = null; // 마지막 노드 (시간상으로 보면 가장 최근 것) 
		Node temp = null; 
		//추가하기 : 10개
		//스택방식 = 마지막에 들어간게 처음으로 나온다. 마지막(LI), 처음(FO)
		
		for(int i=1; i<=10; i++) {
			//노드 생성
			temp = new Node();
			temp.value = i;
			temp.left = null; //왼쪽만 신경쓰기. 
			//연결하기.
			if(head == null) {
				head = temp;
			}else {
			//덮어쓰기를 하면 안되므로. 
				temp.left = tail; // 역순 처리. 
			}
			tail = temp;
			
		}
		
		
		temp = tail; 
		while(temp != null) {//null 이면 멈춘다.
			System.out.println(temp.value);
			temp = temp.left; //
		}*/
		
		
		/*Node head = new Node();//노드타입, 첫 번째 노드 생성 -> 처음에는 null
		head.value = 1;//첫 번째 노드
		head.left = null;//첫 번째 노드 ->링크값은 처음에는 null
		head.right = null; //첫 번째 노드-> 링크값은 처음에는 null
		
		Node temp = new Node();//노드타입, 2 번째 노드 생성 -> 처음에는 null
		temp.value = 2;//2 번째 노드
		temp.left = null;//2 번째 노드 ->링크값은 처음에는 null
		temp.right = null; //2 번째 노드-> 링크값은 처음에는 null
		//방향에 따라서.
		
		head.left = temp; //temp를 찾으려면 head를 알고 있어야됨. 방향성 
		//temp.left = head; // head를 찾으려면 temp를 알고 있어야 됨. 방향성 
		
		
		//순회하기(목록, 검색)
		//반복하기 좋음 -> 노드타입으로 모두 같아서. 
		
		temp = head; 
		while(temp != null) {//null 이면 멈춘다.
			System.out.println(temp.value);
			temp = temp.left; //현재 노드에서 왼쪽으로 연결되어 있고 temp에서 일을 처리하고 temp 왼쪽에 있는 것으로 위치를 바꾼다. 
			//무한루프가 되지 않도록 주의
		
		}	*/
		
		
		
	//Node head = null; //노드를 생성한다.
//	Node temp = head.left;  //리스트는 모두 노드 타입이다. 배열처럼 타입이 다 같아야 되는 것 처럼.
//	temp.left == null; //마지막에 null이 나오면 처리를 끝낸다.
	
//	if (head == null) {//연결 //null이 같은지 아닌지 
	//	head = new Node();
//	}else {
	//}
		
		
		
		}//테스트리크드리스트의 끝

	private static void append(Node temp, Node tail, Node head, boolean ordered) 
	{ 
	
		if(head == null)
		{
			head = temp;
		}
		else
		{
		//덮어쓰기를 하면 안되므로. 
			if(ordered) 
			{
				tail.left = temp; //추가 자체는 tail에서 이루어진것. 
			}
			else
			{
				temp.left = tail; 
			}
		}
		tail = temp; //tail은 지금 막 생성된 것(마지막 것)을 가리키고 있어야 된다. 
		
	}

	
	private static Node createNode(int i) 
	{
		
		Node temp = new Node();
		temp.value = i;
		temp.left = null; //왼쪽만 신경쓰기. 
		return temp;
	}
}//클래스의 끝

