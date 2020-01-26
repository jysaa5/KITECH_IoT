package iot.java;

public class P1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] list = new int[10]; //배열형 배열이름 -> 배열 객체(클래스), new를 부친다. -> 참조형, 반드시 최대 개수 정한다. 배열은 정적 구조이다.  
		//0~9개의 요소번호가 있는것.
		for(int i=0; i<10; ++i) 
		{
			list[i] = i;
		System.out.println(list[i]); //i번 요소 
		}
		
		for(int i=9; i>=0; --i) 
		{
		list[i] = i+1;
		System.out.println(list[i]);//i번 요소
			}
	}

}
