package com.joo.www;

public class P02 {

	public static void main(String[] args) {
	int [] score = {12,23,34,23,15,78};
	int [] copy1 = score; // 복사한다.
		// 복사: 서로 다른 두개를 의미함.
	//참조 복사: 이름만 2개가 되고 배열 자체는 1개다. 
	System.out.println(score[2]);
	copy1[2] = 100;
	System.out.println(copy1[2]);
	System.out.println(score[2]);
	
	int[]copy2 = score.clone();
	System.out.println(copy2);
	System.out.println(score);
	System.out.println(copy2[2]);
	System.out.println(score[2]);
	copy2[2] =50;
	System.out.println(score[2]);
	System.out.println(copy2[2]);
	//복사생성자, 참조 비교, 값 비교 
	System.out.println(score.hashCode());
	System.out.println(copy2.hashCode());
	
		
		//배열 복사: 기본형
		/*int[] score = {12,23,34,23,15,78};
		int[] temp = new int [score.length];
		//특정값 찾기: 검색 결과: 없다, 있다(하나, 여러 개) 
        int key = 23;// 배열안에서 34를 찾겠다. 
         // 순차 탐색(검색)
        int count = 0; 
        for (int i=0; i<score.length; ++i) {
        	if(score[i] == key) {// 같은 int형 변수 
        		System.out.println(i+":"+score[i]);
        		temp[count]=score[i]; // 배열을 복사한다. 
        		count++; //검색결과의 개수 
        	}
        }
        		System.out.println("\n검색결과\n");
        		for (int i =0; i<count;++i) {
        			System.out.println(i+":"+temp[i]);
        			
        			
        		}*/
        	
        
    
        	
        }

	}


