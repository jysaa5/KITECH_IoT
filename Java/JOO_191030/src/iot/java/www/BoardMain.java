package iot.java.www;
import java.util.Scanner;


public class BoardMain {

 public static void main(String[] args) {
   
  	Scanner kb = new Scanner(System.in); //키보드 입력을 받는다. 

		String[][] board = new String[9][]; //게시물 배열 생성
		int boardnumber = 1; //게시물번호
		int boardwrite = 0; //저장된 게시물 횟수

		while(true) {
			System.out.println("-------------공지사항 게시판----------------");
			System.out.println("");
			System.out.println("[1]게시글 쓰기==[2]게시글 찾기==[3]게시글 수정하기");
			System.out.println("");
			System.out.println("[4]게시글 삭제하기==[5]게시글 리스트==[6]나가기");
			System.out.println("");
			System.out.println("----------------------------------------");
			String user = kb.next(); //사용자가 선택한 번호가 들어옴.

			if (user.equals("1")) 
			{//게시글 쓰기
				
				if (boardwrite == board.length) //게시물 가득 찬 경우
				{
					System.out.println("사용하신 게시물이 초과했습니다.\n 작성하신 게시물을 삭제하세요."+"\t");
					continue;
				}

				//게시물 작성할 수 있는 곳
				String no = String.valueOf(boardnumber); //int형 변수를 string으로 변환 
				
				System.out.println("게시물 번호: "+no); //사용자에게 게시물 번호를 보여준다.
				System.out.println("제목을 작성해주세요: "+"\t");
				System.out.println("");
				String title = kb.next(); //제목 저장
				System.out.println("");
				
				System.out.println("내용을 작성해주세요: "+"\t");
				System.out.println("");
				String content = kb.next(); //내용 저장
				System.out.println("");
				
				String[] newboard = new String[3]; //게시물 배열 생성
				//배열이므로 초기화 한다.
				newboard[0] = no; //게시물 번호
				newboard[1] = title; //게시물 제목
				newboard[2] = content; //게시물 내용

				board[boardwrite++] = newboard; //게시물공간 배열에 게시물 번호 배열을 넣는다.
				boardnumber++; //게시물번호를 증가시킨다.
				System.out.println("");
				System.out.println("");
				System.out.println("게시물 작성이 완료되었습니다.\t");
				System.out.println("당신의 게시물 번호는 "+no+" 입니다.\t");
		
			
			}//사용자 선택 1끝 
			
			else if (user.equals("2")) //게시글 찾기
			{
				
				System.out.println("찾고 싶은 게시물의 번호를 입력하세요."+"\t");
				String no = kb.next(); //게시물 번호 입력 받음.				
				
				boolean flag = false; //flag 거짓으로 초기화.		

				for (String[] readboard : board) //게시글 보여주기
				{
					if (readboard != null && readboard[0].equals(no)) 
					{
						System.out.println("게시물 번호: " + readboard[0]);
						System.out.println("제목: " + readboard[1]);
						System.out.println("내용: " + readboard[2]);
						flag = true;
						break;
					}
				}

				if (!flag) //flag가 false이면
				{
					System.out.println("게시글이 없습니다."+"\t");
				}
			}//사용자 선택 2끝
			
			else if (user.equals("3")) 
			{//사용자 선택 3
				
				System.out.println("작성한 게시물의 번호를 입력하세요: ");
				String no = kb.next();	//사용자에게 번호 입력 받기. 				
				
				boolean flag = false;		//flag 초기화

				for (String[] readboard : board) 
				{
					if (readboard != null && readboard[0].equals(no)) 
					{
						System.out.println("< 이전에 작성한 게시물 >");
						System.out.println("게시물 번호: " + readboard[0]);
						System.out.println("제목: " + readboard[1]);
						System.out.println("내용: " + readboard[2]);
						System.out.println(" ");
						System.out.println("제목을 수정하세요: "+"\t");
						String title = kb.next();
						System.out.println("내용을 수정하세요: "+"\t");
						String content = kb.next();

						readboard[1] = title; //새로운 제목 저장
						readboard[2] = content; //새로운 내용 저장

						flag = true; 
						break;
					}
				}
				
				if (flag) 
				{
					System.out.println("게시물 작성이 완료되었습니다.\t");
					System.out.println("당신의 게시물 번호는 "+no+" 입니다.\t");
				} 
				else 
				{
					System.out.println("게시글이 없습니다."+"\t");
				}
			} 
			else if (user.equals("4")) 
			{

				System.out.println("작성한 게시물의 번호를 작성해주세요: ");
				String no = kb.next();					
				
				int index = -1;			
				boolean flag = false;		
				
				if (boardwrite == 0) {
					System.out.println("입력된 게시글이 없습니다."+"\t");
					continue;
				}

				for (int i=0; i<board.length; i++) {
					String[] bbs =board[i];

					if (bbs != null && bbs[0].equals(no)) {
						board[i] = null;
						index = i;
						boardwrite--;
						flag = true;
						break;
					}
				}
				
				if (flag) {
					
					int length = board.length;				

					for (int i=0; i<length; i++)
					{
						
						if (index == 0) 
						{
							break;
						}

						if (index == length-1) 
						{
							break;
						}					

						if (i > index) 
						{
							if (i < length) 
							{
								board[i-1] = board[i];
								board[i] = null;
							}
						}
					}

					System.out.println("Complete! 짝짝짝");
				} 
				else 
				{
					System.out.println("게시글이 없습니다."+"\t");
				}

			} 
			else if (user.equals("5")) 
			{
				for (int i=0; i<board.length; i++) 
				{
					if (board[i] == null) continue;				
					{
					System.out.println("index: " + i);
					System.out.println("no: " + board[i][0]);
					System.out.println("title: " + board[i][1]);
					System.out.println("content: " + board[i][2]);
					}
				}			
			} 
			else if (user.equals("6")) 
			{
				System.out.println("프로그램을 종료합니다."+"\t");
				break;
			}
			else if(!user.equals("1")&&!user.equals("2")&&!user.equals("3")&&!user.equals("4")&&!user.equals("5")&&!user.equals("6"))
			{
				System.out.println("잘못 입력 하셨습니다.\n다시 입력해주십시오."+"\t");
			}
			
    }//while 함수 끝	
  }//main 함수 끝
}//클래스 끝

