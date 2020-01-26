package iot.www;
/**
 * 매서드 구현 연습 > 클래스 까지
 * 위 아래 숫자 맞추기
 * - Up > 정답, Down < 정답
 * - A 사람: 답을 정하기 
 * 반복{
 * - B 사람: A의 수라고 예측되는 값을 부른다. 
 * - A 사람: 대답하기(내 답보다 크면 up, 내 답보다 작으면 down)
 * - B 사람: 대답을 듣고 다음 값에 예측. 
 * }; break; 정답이면..
 * 
 * 1. 사람이 대답, 컴퓨터 맞추기
 * 2. 컴퓨터(객체)끼리 승패 가리기 
 * 
 *
 */
import java.util.Scanner;
public class P1028_02 {
	private static int min; // 수를 맞추는 공식(알고리즘)이 있어야 필드를 구성 할 수 있다. -> 알고리즘: 중간값 정하기. 
    private static int max;
    
	public static void main(String[] args) {
		//중재자(심판)
		//초기화
		Scanner kb = new Scanner(System.in);
		String resp; //사람의 대답(키보드) // int 여도 된다. 
		int callValue; // 컴퓨터가 부르는 값
		min = 1;//초기화
		max = 100;//초기화
		//게임 진행
		System.out.println("정답을 정하세요.<enter>:("+min+"~"+max+")");
		resp = kb.nextLine(); //키보드에서 문자행 단위로 받겠다. 화며에서 행은 엔터친 부분까지. 
		
		do{
			//컴퓨터가 값을 부른다.
			callValue = getValue();
			System.out.println("is"+ callValue + "?");
			//사람이 대답을 받는다.
			resp = kb.nextLine();
			//대답에 따라 다음 수를 계산한다. 
			setResponse(resp, callValue); //다음 수 계산을 위해 setResponse 함수에 resp를 준다. 
		}while(!resp.equals("correct"));
		//끝: 정답이면
		
		System.out.println("computer right");
		
		
	kb.close();	
	}//main함수 끝

	private static void setResponse(String resp, int call) {
		//사람의 대답에 따라 처리하는 함수. (예측, 계산)
		//서로 공유할 정보, 변수 = setResponse 함수와 getValue와 변수를 공유해야한다. 
		if ("up".equals(resp)) {
			min = call; //바로 직전에 부른 값이 call
			}
		else if("down".equals(resp)) {
			max = call;
	}else if("correct".equals(resp)){
			System.out.println("wow");
		}else {
			System.out.println("up, down, correct로 대답해주세요.");
		}
		// 두 가지를 제외한 나머지에서는 오류메세지를 보여준다. if: 조건에 따라, switch: 값을 매핑하는 것.
}
	private static int getValue() {
	// 사람에게 부를 값을 반환 (콘솔로 보여줌)
		return (min+max)/2; // 중간값 (min ~ max) 
	}
}//클래스 끝
