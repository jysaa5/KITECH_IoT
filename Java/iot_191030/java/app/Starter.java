package iot.java.app;

import java.time.LocalDateTime;
import java.util.Scanner;

import com.park.tc.Main;

/**
 * 실습 프로젝트 : 주차장 요금 관리 프로그램 (POS)
 * 1. 기본 구조 만들기(콘솔환경)
 * - 필요 데이터 : 돈, 자동차(번호:문자열), 시간, 주차 현황, 지점
 * - 로직 : 절차, 기능
 * 2. 키보드 입력 버퍼링( 미리 저장해 두었다가 꺼내고 없으면 다시 입력)
 * 3. 배열 도입(1차, 2차...)
 * 4. 복합형(클래스) 도입 시도
 * @author user
 *
 */
public class Starter {
	
//	public static void main(String[] args) {
//		Main team_c = new Main();
//		team_c.main(args);
//		
//	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		// 초기화 : 선언
		Service service = new Service();
		
		String[] cars = new String[20];
		int car_last = 0;// 현재 몇 개, 마지막 요소번호
		// 주차면과 차량 정보
		int[][] state = new int[20][2];
		int log_no = 0;
		// [0]:주차면번호, [1]:차량정보번호
		
		// 돈 기록
		
		while(true) {
			// 현재 상태, 상황, 목록 - 데이터
			Space[] space = service.getStateAll();
			if(space != null ) {
				for(int i=0; i<space.length; ++i) {
					System.out.print("["+i+":");
					if( space[i] == null) {
						System.out.print("empty");
					}else {
						System.out.print(space[i].carNumber);					
					}
					System.out.print("]\t");
					if((i+1)%4==0) System.out.println("");
				}
			}else {
				
			}
			// 메뉴, 기능을 입력,선택
			System.out.println(
					"[0]Exit [1]In [2]Out");
			int menu = Integer.parseInt(kb.nextLine());
//			Double.parseDouble(s);
			// 선택된 처리
			if( menu == 0)	break; // [사용자]에 의해
			// 처리결과 보여준다, 저장하기
			if( menu == 1) {// 차 들어온다..
				// 빈 자리 확인
				int empty_space = -1;
				for(int i=0; i < space.length; ++i) {
					if(space[i] == null) {
						space[i] = new Space();
						System.out.println(i+"번 자리 있음");
						empty_space = i;
						break;
					}
				}// 빈 자리 검색 끝
				
				if( empty_space != -1 ) {
					System.out.println("car number :");
					String carnumber = kb.nextLine();
					// 들어온 시간 : 자동 기록
					space[empty_space].able = false;// 주차했음
					space[empty_space].carNumber = carnumber;
					space[empty_space].in = LocalDateTime.now();
					
					cars[ car_last ] = carnumber;
					++car_last;
					state[log_no][0] = empty_space;
					state[log_no][1] = car_last-1;// 저장된 요소 번호
					++log_no;
				}else {
					System.out.println("Man Cha");
				}
			}
			else if( menu == 2) { // 차가 나간다...
				System.out.println("car number :");
				String carnumber = kb.nextLine();
				// 해당 차의 시간 정보 찾는다...
				// 반복문 : for each : 요소 단위로 반복한다...
				Space result = null;
				for(int i = 0 ; i < space.length; ++i) {
					if( space[i] != null ) {
						if(space[i].carNumber.equals(carnumber)) {
							result = space[i];// 복사:참조
							space[i] = null;// 빈 자리
							break;
						}
					}
				}// 차량 검색 끝
				
				if( result != null ) {
					result.able = true;
					result.out = LocalDateTime.now();
					// 나가는 시간(현재) - 들어온 시간 차
					// 기본 요금 + 추가요금
					
				}else {
					System.out.println("해당 차량정보가 없습니다.");
				}
				
			}
		}//end while
		
		// 종료 처리 : 메모리 해제, 파일 닫기
		{
			// 오늘: 매출 얼마
		}
		System.out.println("terminated bye");
		kb.close();
		
	} // end of main

} // end of Class
