package iot.java.demo;

import java.util.Scanner;

/**
 * 메서드 구현 연습 > 클래스까지
 * 위아래 숫자맞추기
 * - Up > 정답, Down < 정답 
 * - A : 답을 정하기
 * {
 * - B : 값을 부르기
 * - A : 대답하기(정답)
 * - B : 대답을 듣고 다음 값에 예측
 * } ; break; 정답이면...
 * 
 * 1. 사람이 대답, 컴퓨터 맞추기
 * 2. 컴퓨터(객체)끼리 승패가리기
 * @author user
 *
 */
public class UpDown {
	private static int min;// 수를 맞추는 공식(알고리즘: 중간값)
	private static int max;

	public static void main(String[] args) {
		// 중재자(심판)
		// 초기화
		Scanner kb = new Scanner(System.in);
		String resp;	// 사람의 대답(키보드)
		int callValue;	// 컴퓨터가 부르는 값
		min = 1;
		max = 100;
		// 게임 진행
		System.out.println("정답을 정하세요 <enter>:("+min+"~"+max+")");
		resp = kb.nextLine();// 화면에서 행 엔터친부분까지
		do{
			// 값을 부른다.
			callValue = getValue();
			System.out.println("is "+callValue+" ?");
			// 대답을 받는다.
			resp = kb.nextLine();
			// 대답에 따라 다음 수를 계산한다..			
			setResponse(resp,callValue);
		}while( !resp.equals("correct"));
		// 끝 : 정답이면
		System.out.println("Computer right");
		kb.close();
	}// end of main

	private static void setResponse(String resp, int call) {
		// TODO : 대답에 따라 처리
		// 서로 공유할 정보, 변수 - static, 필드
		if("up".equals(resp)) {
			min = call;// 바로 직전에 부른 값
		}
		else if("down".equals(resp)) {
			max = call;
		}else if("corrent".equals(resp)) {
			System.out.println("wow");
		}else {
		// 두가지를 제외한 나머지에서는 오류메세지를 보여준다....
		}
		
	}

	private static int getValue() {
		// TODO : 사람에게 부를 값을 반환
		return (min+max)/2;// 중간값( min ~ max )
	}

}







