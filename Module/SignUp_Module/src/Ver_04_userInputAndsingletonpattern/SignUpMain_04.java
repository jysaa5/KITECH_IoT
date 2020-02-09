package Ver_04_userInputAndsingletonpattern;

public class SignUpMain_04 {

	public static void main(String[] args) {

		//SignUpFunction manager = new SignUpFunction();
		SignUpFunction manager = SignUpFunction.getInstance();

		while (true) {
			System.out.println("==========================");
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("1. 대학친구입력");
			System.out.println("2. 회사친구입력");
			System.out.println("3. 친구 검색");
			System.out.println("4. 친구 삭제");
			System.out.println("5. 친구 전체 리스트");
			System.out.println("6. 프로그램 종료");
			System.out.println("==========================");

			int select = manager.sc.nextInt();
			manager.sc.nextLine();

			switch (select) {
			case 1:
				manager.insertInfo(select);
				break;
			case 2:
				manager.insertInfo(select);
				break;
			case 3:
				manager.searchInfo();
				break;
			case 4:
				manager.deleteInfo();
				break;
			case 5:
				manager.showAll();
				break;
			case 6:
				System.out.println("프로그램을 종료합니다.");
				return;
			}
		}

	}
	
}//SignUpMain_04 클래스 끝
