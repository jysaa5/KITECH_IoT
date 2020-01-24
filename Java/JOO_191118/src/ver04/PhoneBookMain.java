package ver04;

public class PhoneBookMain {

	public static void main(String[] args) {

	//	PhoneBookManager manager = new PhoneBookManager(); //싱글톤 패턴으로 인스턴스 생성 불가. 
		
		PhoneBookManager manager = PhoneBookManager.getInstance();

		while (true) {
			System.out.println("======================");
			System.out.println("메뉴를 입력해주세요.");
			System.out.println("1. 대학친구입력");
			System.out.println("2. 회사친구입력");
			System.out.println("3. 친구 검색");
			System.out.println("4. 친구 삭제");
			System.out.println("5. 친구 전체 리스트");
			System.out.println("6. 프로그램 종료");
			System.out.println("======================");

			int select = manager.sc.nextInt();
			manager.sc.nextLine();

			switch (select) {
			case 1:
				manager.insertInfor(select);
				break;
			case 2:
				manager.insertInfor(select);
				break;
			case 3:
				manager.searchInfor();
				break;

			case 4:
				manager.deleteInfor();
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

}
