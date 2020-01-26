package iot.java;
// 실습 프로젝트: 주차장 요금 관리 프로그램(POS)
/*1. 기본 구조 만들기(콘솔환경)
 * - 주차장에서 필요로 하는 데이터: (돈, 자동차번호(문자열) , 시간, 주차장 현황, 지점) -> 주차시간(들어오는 시간,나가는 시간), 기본요금, 추가요금, 비어있는 주차장 자리 개수, 현재 자동차 대 수, 영업시간 
 * - 로직: 절차,기능 (실행되는 기능들, 순서) 
 * 
 * 2. 키보드 입력 버퍼링(미리 저장해 두었다가 꺼내고 없으면 다시 입력) 
 * @author user 
 * 
 */
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		//초기화: 선언
		while(true) {
			//현재 상태, 상황, 목록 - 데이터
			// 메뉴, 기능을 입력, 선택 
			System.out.println("[0]Exit [1]In [2]out");
			int menu = Integer.parseInt(kb.nextLine());
			//선택된거에 대한 처리 
			if(menu==0) 
			{
			break; // [사용자]에 의해 (키보드에서 입력받은 값에 의해)
			}
			if (menu==1) { //차가 들어온다.
				//빈자리 있는 지 확인 
				System.out.println("car number: "); //차가 들어오면 차번호를 입력받는다. 차량번호 = 문자열로 생각. 
				String carnumber = kb.nextLine();
				//들어온 시간: 자동으로 기록 
			}
			if (menu==2) {//차가 나간다. 
				System.out.println("car number: "); //차가 들어오면 차번호를 입력받는다. 차량번호 = 문자열로 생각. 
				String carnumber = kb.nextLine();
				//해당 차의 시간 정보를 찾는다. (꺼낸다)
				//나가는 시간(현재) - 들어온느 시간 차
				// 기본 요금 + 추가요금 
				//마무리: 빈자리가 생겼다 -> 어떤 카운팅이 필요함. 
			}
			//처리 결과를 보여준다, 저장한다.
			}
		// 종료 처리: 메모리 해제, 파일 닫기
		System.out.println("terminated bye"); //이게 안나오는 종료는 비정상 종료 
		kb.close();
		}//main 함수
	}//class 끝

