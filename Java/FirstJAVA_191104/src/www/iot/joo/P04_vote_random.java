package www.iot.joo;
import java.util.Scanner;
public class P04_vote_random {

	public static void main(String[] args) {
		

		int number = 0; //24개의 배열중 임의 숫자를 저장하는 변수 
		int voteno = 0; //사용자가 입력한 랜덤으로 섞는 횟수
		int ran = 0; // 0~24 숫자중에서 임의 숫자를 저장하는 변수
		String vote [] = new String [1]; //name의 0번요소값을 저장하는 배열
		String	name [] = {"고현주","구자윤","김난형","김동진","김주연","문영기","박준섭","박지은" 
					           ,"방창용","양햇살","엄예빈","위은주","이용재","황다울","이진형","이택수"
		                       ,"장한솔","정엄지","정용기","조성빈","조지윤","최찬영","하재운","홍지수"}; //후보자의 이름(총 24명)
		
		while(true) { //랜덤뽑기를 무한반복(console창이 종료되기 전까지)
		System.out.println("< 랜덤 반장을 뽑겠습니다. >");
		System.out.println("랜덤을 몇 번 돌린 후에 뽑겠습니까?");
		System.out.println("1 이상의 숫자를 입력해주세요.");
		System.out.println("* 0을 입력하시면 이름순으로 가장 첫 번째 후보자가 당첨됩니다. *");
		Scanner kb = new Scanner(System.in); //키보드로 입력받은 문자열을 kb에 주소값을 저장 
		String kbString = kb.nextLine(); //입력된 한 줄을 kbString 문자열변수에 주소값을 저장
		 
			    if (isStringDouble(kbString)) //문자열이 숫자인지 판단
			    {
			      System.out.println("올바른 입력입니다.");
			      voteno = Integer.parseInt(kbString);
			  	for (int i=1; i<=voteno; i++) 
				{
				ran = (int)(Math.random()*25);
				number = ran;
				}
			
				vote[0] = name[0]; //기존 name배열의 0번 요소값을 vote배열에 저장
				name[0] = name[number]; //임의 name배열의 값을 name 0번 요소값으로 저장
				name[number] = vote[0]; //vote배열의 0번 요소값을 name의 임의 요소번호 값으로 저장
				System.out.println("**************************");
				System.out.println(name[0]+" 이(가) 반장으로 뽑혔습니다.");
				System.out.println("**************************");
			      
			    }
			      else
			      {
			    	  System.out.println("올바른 입력이 아닙니다.");
			    	  System.out.println("다시 입력해주세요.");
			    		System.out.println("**************************");
			      }
		}//while문 끝
	
	}//main함수 끝
			
			
	
      public static boolean isStringDouble(String s) { //문자열이 숫자인지 판단하는 함수를 예외처리 
         try {
         Double.parseDouble(s); //String double 타입으로 변환했을때 에러가 나지 않으면 true
          return true;
             }catch (NumberFormatException e) //String double 타입으로 변환했을때 에러가 나면 false
             {
             return false;
             }
         }//isStringDouble 함수 끝

}//클래스함수 끝

