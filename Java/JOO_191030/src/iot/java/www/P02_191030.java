package iot.java.www;
import java.io.IOException;
public class P02_191030 {

	public static void main(String[] args) throws IOException  {
	testTree();

	}

	private static void testTree() throws IOException{
	//트리는 어렵다. 방법이 많기 때문이다. 
	// 하나의 노드에 하위 개념 노드 2개를 갖는다. (여러개 가능)
	// 노드 기준을 잘 잡아야 된다. 
	// 노드 추가 -> 기준 -> 종류
	// 왼쪽, 오른쪽 - 작은 값 왼쪽, 큰 값 오른쪽으로 보내는 것. (이진트리)
	Node root = new Node();
	root.value = 100; //루트에서 왼쪽으로 가는 것은 100보다 작음. 오른쪽으로 가는 것은 100보다 큼. 
	
	for(int i=0; i<10; ++i)
	{
		int val = System.in.read(); //'1' -49 : 숫자를 누르면 100보다 작은 값. 100보다 큰 값은 알파벳 써야 됨.
		Node temp = new Node();
		temp.value = val;
		//트리속에 추가해라.
		addNode(temp, root);
	}
	
/*	Node temp = new Node();
	temp.value = 50; //추가할 자리를 찾는다. 
	*/
	/*if (root.value >= temp.value) {
		root.left = temp; 
		
	}
	else {
		root.right = temp;	
	}*/
	
	//트리는 단순 반복으로 힘들다.되돌아오는 과정이 필요하다. 왼쪽으로 갔다가 다시 올라왔다가 오른쪽으로 갈 수있다.(재귀함수)
	//재귀함수 학습이 필요하다.
	traverse(root); //모든 노드들을 출력하는 재귀 함수.
	
	}//testTree 끝

	private static void addNode(Node temp, Node root) {
//temp는 바뀌면 안됨(추가할 값). root는 찾는 것(바뀌어도 됨, 추가하려는 위치) 		
		if (root == null) {
			return;
		}
		if (temp.value <= root.value) { //=는 중복을 포함한다.부동호만 있으면 중복을 뺀다.  
			if(root.left == null) { //왼쪽 추가 
				root.left = temp;
				return; //return을 안하면 else가 필요하다. 
			}
		addNode(temp,root.left);
		
		}
		if(temp.value > root.value) {
			if(root.right == null) { //왼쪽 추가 
				root.right = temp;
		
			}else {
			
			addNode(temp,root.right);
		}

		}
		
	}

	private static void traverse(Node root) 
	{
	//반드시 종료되어야 하낟. 반복의 흐름이므로. (재귀=반복을 하는 처리)
		if(root == null) 
		{
			return; //반드시 필요함.
		}
		
		//자기 자신을 호출한다.
		
		System.out.println(root.value); //이동하기 전에 출력하고 왼쪽으로 갔다가 오른쪽으로 가라.
		//처리를먼저한다 전위법 / 사이에 껴서 처리 중위법 / 끝에서 처리후위법
		traverse(root.left); //자식 노드 이동	
		//System.out.println(root.value); 
		traverse(root.right); //자식 노드로 이동
	//	System.out.println(root.value); 
		
	}

}//클래스 끝
