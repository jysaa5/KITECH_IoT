package iot.java.www;

public class Node {
	
	int value; 
	
	//자기 참조 = 자기 자신과 같은 멤버가 있다.(c언어)
	Node left; //노드 타입에 객체명(참조변수)
	Node right;
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	} 
	
	

}
