package iot.java;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

/**
 * 클래스 만들어 인스턴스로 다루기.
 * 1. 필드 작성하기
 * 2. 필드 입출력을 위한 겟/셋터 만들기
 * 3. 필드들의 초기화 - 인스턴스 생성 시 필드의 값
 * - 생성자를 호출한다...
 * - 기본생성자, 매개변수를 갖는 생성자 - 오버로딩
 * 4. 오버라이드 : 기존 메서드 중 하나를 새로 만든다...
 * - hashCode, equals, toString - 연관있는 메서드인 경우...
 * 5. toString() : 객체를 문자열 바꾼다... 필수
 * 
 * @author user
 *
 */
public class Main {
	
	public static void main(String[] args) throws IOException 
	{
		
		LocalDateTime d1 = LocalDateTime.now();
		LocalDateTime d2 = LocalDateTime.now();
		int key;
		while( (key = System.in.read()) != 48) {	// '0'
			if( key == 49) {	// '1'
				d1 = LocalDateTime.now();
			}
			if( key == 50) {	// '2'
				d2 = LocalDateTime.now();
			}
			long s1 = d1.toEpochSecond(ZoneOffset.UTC);
			long s2 = d2.toEpochSecond(ZoneOffset.UTC);
			long diff = s1 - s2;
			System.out.println("d1:"+s1+" - d2:"+s2+" = "+diff);

		}
		
	}
	
	
//	public static void main(String[] args) {
////		Main.main(args);// 실행 인스턴스 없이 바로 실행시킨다....
//		Person.serail = 100;	
//		Person p1 = new Person();
//		Person p2 = new Person();
//		Person p3 = new Person();
//		System.out.println(p1.serail);
//		p1.serail = 200;
//		System.out.println(p2.serail);		
//		System.out.println(p3.serail);
//		
//		
//		// 클래스형 변수는 반드시 생성(new)한다....
////		System.out.println(person);// 초기화
//		// 멤버를 가지고 있다.... 클래스변수명.멤버명
//		// 변수에 null 인 경우에는 . NullPoint
////		if( person != null ) {
////			person.code = 10;
////			person.name = "jdk";
////			System.out.println(person.code);
////			System.out.println(person.name);
////			System.out.println(person.phone);
////			System.out.println(person.weight);
////		}
//	}

//	public static void main(String[] args) {
//		// 다차 배열 : 강사랑 하는 동안 [][][]
//		// 행: 대상, 열: 대상의 속성들...
//		int[][] d2array = new int[20][2];
//		int[] row1 = d2array[0];
//		row1[0] = 10;		
//		int[] row;
//
//		for(int r = 0; r < 20; ++r) {
//			row = d2array[r];
//			for(int c = 0; c < 2; ++c) {
//				System.out.print(row[c] + " ");				
//			}
//			System.out.println(":"+r+"행");
//		}
//	}
	
//	public static void main(String[] args) {
//		int[] score = {12,23,34,23,15,78};
//		int[] copy1 = score; // 복사한다...
//		// 참조 복사 : 이름만 2개가 되고 배열 자체는 1개다...
//		System.out.println(score[2]);
//		copy1[2] = 100;
//		System.out.println(copy1[2]);
//		System.out.println(score[2]);
//		
//		int[] copy2 = score.clone();
//		System.out.println(copy2);
//		System.out.println(score);
//		copy2[2] = 50;
//		System.out.println(score[2]);
//		System.out.println(copy2[2]);
//
//		// 복사생성자, 참조 비교, 값 비교
//		System.out.println(copy2);
//		System.out.println(score.toString());
//		System.out.println(score.hashCode());
//		System.out.println(copy2.hashCode());
//	}
	
//	public static void main(String[] args) {
//		// 배열 복사 : 기본형
//		int[] score = {12,23,34,23,15,78};
//		int[] temp = new int[score.length];
//		// 특정 값 찾기 : 검색 결과 : 없다, 있다( 하나, 여러 개 )
//		int key = 23;
//		// 순차 탐색(검색)
//		int count = 0;
//		for(int i=0; i<score.length; ++i) {
//			if(score[i] == key) {
//				System.out.println(i+":"+score[i]);
//				temp[count] = score[i];
//				count++;
//			}
//		}
//		System.out.println("\n검색결과\n");
//		for(int i=0; i < count; ++i) {
//			System.out.println(i+":"+temp[i]);
//		}
//		
//		
//	}

//	public static void main(String[] args) {
//		// 삭제하기 : 빈 칸 만들기 : 빈 상태를 의미하는 값
//		int[] score = new int[10];
//		for(int i =0 ; i < score.length; i++) {
//			// 전체 요소들의 초기값
//			score[i] = i*2;
//		}
//		for(int i =0 ; i < score.length; i++) {
//			System.out.print( score[i]+" " );
//			// 기본형 변수
//		}
//		
//		{// [4]번 요소를 삭제하세요 : 땡겨놓기
//			int del = 4;
//			int i = 0;
////			for(i = del; i < score.length-1;++i) {
////				score[i] = score[i+1];
////			}
////			score[i] = 0;
//			for(i = del+1; i < score.length;++i) {
//				score[i-1] = score[i];
//			}
//			// 땡긴 후 마지막 값의 중복 있다..
//			score[i-1] = 0;
//		}
//		System.out.println();
//		for(int i =0 ; i < score.length; i++) {
//			System.out.print( score[i]+" " );
//			// 기본형 변수
//		}
//		// 삽입하기 : [2][12][3][56][2][3][ ][ ];
//		
//
//	}
	
	
	
	
//	public static void main(String[] args) {
//		// 추가하기.... 현재 번호, 현재 길이
//		int length = 20;
//		int[] score = new int[length];
//		int count = 0;		
//		for(int i = 0; i < 100; ++i) {
//			if( count >= score.length)
//			{
//				break;
//			}
//			score[count] = i*10 + 6;
//			++count;
//		}
//		
//	}
	
//	public static void main(String[] args) {
//		// 배열 : 연속하는 데이터(요소)들....
//		// 요소번호 : [0]~ +1 - 경계선 확인
//		//	배열의 길이 :  요소 개수 - 1
//		//	자료형이 같다....
//		// 기본형 배열
//		int[] list = new int[10];// 반드시 최대 개수 정한다..
//		for(int i = 0; i < 10; ++i) {
//			System.out.println( list[i] );// i번 요소
//		}
////		System.out.println( list[10] );
//		for(int i = 9; i >= 0; --i) {
//			list[i] = i+1;
//			System.out.println( list[i] );// i번 요소
//		}
//		
//	}

//	public static void main(String[] args) {
//		// TODO : 복습 1 ~ 25 ( 5x5 )
//		// 연속하는 정수, 연속하지 않는 정수
//
//		// 포맷 기준
//		int data = 1;
//		 for(int row = 0; row < 5; row++) {
//			 for(int col = 0; col < 5; col++) {
//				 System.out.print(data+" ");
//				 ++data;// 연속하는 정수
//			 }
//			 System.out.println("");
//		 }
//		
//		// 포맷 기준
//		int count = 0;// 출력한 개수
//		for(int i=1 ; i<=25; ++i) {
//			System.out.print(i+" ");
//			++count;
//			if( count == 5) {
//				System.out.println("");
//				count = 0;// 각 행 개수
//			}
//		}
//
//		// 데이터를 파악
//		for(int i=1 ; i<=25; ++i) {
//			System.out.print(i+" ");
//			if(i % 5 == 0) {
//				System.out.println("");
//			}
//		}
//		
//		
//
//	}

}
