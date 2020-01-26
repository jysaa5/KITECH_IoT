package com.joo.www;

import java.time.LocalDateTime;
import java.util.Scanner;

public class P03_Parking {
/*	public static void main(String[] args) {
// 다차 배열: 실제로는 많이 안씀. [][][] : 대괄호 여러개.
		//행: 대상 , 열: 대상의 속성, 항목 
		int[][] d2array = new int [20][2];
		int [] row1 = d2array[0];
		row1[0] = 10; 
		int[] row; 
		for(int r=0; r<20; ++r) 
		{
			row = d2array[r];
			for(int c=0; c<2; ++c)
			{
				System.out.print(row[c]+"");
			}
			System.out.println(":"+r+"행");
		}
		
	}
}*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		//초기화: 선언
		Space[] space = new Space[20]; //주차면 정보
	
		String[]cars = new String[20];
		int car_last=0; //현재 몇 개, 마지막 요소 번호
		// 주차면과 차량 정보
		int[][] state = new int[20][2];
		int log_no=0;
		//[0]: 주차면번호, [1]: 차량정보 번호
		// 돈 기록: 입금, 출금, 잔액 -> 표가 필요 -> 차수가 높은 배열이 필요함 
		while(true) {
			//현재 상태, 상황, 목록 - 데이터
			for(int i=0; i<space.length; ++i) {
				System.out.print("["+i+":");
				if(space[i]==null) {
					System.out.print("empty");
				}
				else {
					System.out.print(space[i].carNumber);
				}
				System.out.print("]\t");
			if((i+1)%5==0) {
				System.out.println("");
			}
			}
			// 메뉴, 기능을 입력, 선택 
			System.out.println("[0]Exit [1]In [2]out");
			int menu = Integer.parseInt(kb.nextLine());
			//선택된거에 대한 처리 
			if(menu==0) 
			{
			break; // [사용자]에 의해 (키보드에서 입력받은 값에 의해)
			}
			if (menu==1) { //차가 들어온다.
				//빈자리 있는 지 확인 -> space 배열을 보는 것=값이 0인 것을 탐색
				int empty_space = -1;
				for(int i=0; i<space.length; ++i) {
					if(space[i]==null) {
						space[i] =new Space();
						System.out.println(i+"번 자리 있음");
						empty_space = i; 
						break;	
					}
				}
				//빈자리가 있어서 주차를 하려고 하는 판단
	
				if(empty_space != -1)
				{
				
				System.out.println("car number: "); //차가 들어오면 차번호를 입력받는다. 차량번호 = 문자열로 생각. 
				String carnumber = kb.nextLine();
				//들어온 시간: 자동으로 기록 
				space[empty_space].able = false;// 빈자리에 삽입하는 것.(임의로) // 주차 했음으로 표시
				space[empty_space].carNumber = carnumber;
				space[empty_space].in = LocalDateTime.now();
				
				cars[car_last] = carnumber;
				++car_last;
				state[log_no][0]= empty_space;
				state[log_no][1]=car_last-1 ;// 저장된 요소 번호 -> 뒤에 ++car_last 했으므로.
				++log_no;
				// 들어온 차 정보 표로 정리한 것.
			     }
				else
				{
				System.out.println("만차임ㅋ"); 
				
			    }
			}
			else if (menu==2) {//차가 나간다. 
				System.out.println("car number: "); //차가 들어오면 차번호를 입력받는다. 차량번호 = 문자열로 생각. 
				String carnumber = kb.nextLine();
				//해당 차의 시간 정보를 찾는다. (꺼낸다)
				//나가는 시간(현재) - 들어온느 시간 차
				// 기본 요금 + 추가요금 
				//마무리: 빈자리가 생겼다 -> 어떤 카운팅이 필요함. 
				//반복문: for each: 요소 단위로 반복한다. 
				/*for(String number : cars) {
					if( number.equals(carnumber)) {
						break;
					}
					
				}*/
			Space result =null; //result 변수 선언
				for(int i =0; i<space.length; ++i) {
				if(space[i] != null) { //null이 아니면 차가 있는 상태.
					if (space[i].carNumber.equals(carnumber)) {
						result = space[i]; //result에서 값을 수정하면, space[i]도 바뀜. new한게 아니라서 참조만 복사됨. 복사:참조
						space[i] = null;
						break;
					}
					}
			}//차량 검색 끝
				
				//for문이 거짓되거나 if가 참이거나 할때 for문을 나온다.
				if(result != null) {//차가 있다는 것. //  null이 아니면 검색된거임. 
					//state 배열에서 [1]열과 같은 값을 찾는다. 
					//int no = -1;
				//	for(int si=0; si<state.length; ++si) {
					//	if(state[si][1] == ci) { //차번호가 저장된 배열 찾기. state[주차면번호][차번호가저장된배열의번호]
                  //         no=state[si][0]; //space[]
					//		break;
					//	}
				//	}
					if(result != null) {
						result.able = true;
				//		space[no] = null; //no => i가 필요 
						result.out = LocalDateTime.now();
						// result.out - result.in; // 시간 차가 필요.시간 계산
						
					}
					
				}else {
					System.out.println("해당 차량정보가 없습니다.");
				}
				//state[1][0]
				
	
				
				
			}
			//처리 결과를 보여준다, 저장한다.
			}
		// 종료 처리: 메모리 해제, 파일 닫기
		{
		// 오늘: 매출 얼마 
		}
		System.out.println("terminated bye"); //이게 안나오는 종료는 비정상 종료 
		kb.close();
	} // end of main*/
	
}//end of Class

