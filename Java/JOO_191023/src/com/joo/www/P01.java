package com.joo.www;

public class P01 {

	public static void main(String[] args) {
		//삭제하기: 빈 칸 만들기 = 빈 상태를 의미하는 값 = 빈 곳에 보통 0이나 -1 (의미없는 값)
		int [] score = new int[10];//요소 번호가 0~9가 있다는 뜻
		for(int i=0; i<score.length; i++) {//처리
			//전체 요소들의 초기값
			score [i] =  i*2;
			
		}
	//	System.out.println(score);// score.toString() ->만들지 않아도 println으로 사용 가능.
//		System.out.println(score[4]); //타입이 기본형 변수 
/*for (int i=0; i<score.length; i++) { //출력
	System.out.print(score[i]+"");
}*/
{//[4]번 요소를 삭제하세요: 땡겨서 놓기 
	int i =0;
	int del = 4; // 삭제하려는 요소의 번호
	for(i = del+1; i < score.length; ++i) {
		score[i-1] = score[i]; // i+1 = 오른쪽에 바로 인접한 요소번호 
	}
	//땡긴 후 마지막 값이 중복 있다. 
	score[i-1] = 0;
	}

for (int i=0; i<score.length; i++) {
	System.out.print(score[i]+"");
}
}                                                             
}
