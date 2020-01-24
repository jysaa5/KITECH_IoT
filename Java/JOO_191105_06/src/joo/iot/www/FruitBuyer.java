package joo.iot.www;

public class FruitBuyer {


	//상태 값: 보유 금액, 사과의 개수
	
	//int myMoney = 10000; //보유 금액: 초기값은 10,000원
	//int numOfApple = 0; //보유한 사과의 개수 
	
	int myMoney; //보유 금액: 초기값은 10,000원
	int numOfApple; //보유한 사과의 개수 
	
	FruitBuyer(int money) {
		myMoney = money;
		//numofApple = 0; 이미 클래스에서 선언할 때 초기화됨. 
	}
	
	//기능: 구매, 구매 현황
	//구매: 구매할 셀러, 구매할 금액 -> 샐러에게 판매 요청(금액) -> 반환 받은 사과의 개수로 보유한 사과의 개수를 변경. -> 보유한 금액 변경
	//반환하는게  없다.->void
	void buyApple(FruitSeller seller, int money) {
		//구매한 사과의 개수
		int num = seller.saleApple(money);
		//numOfApple = numOfApple+num;
		numOfApple += num; //사과의 개수 변경 
		myMoney -= money;
		
	}
	
	void showBuyResult () {
		System.out.println("현재 보유금액 :"+myMoney);
		System.out.println("사과의 개수: "+numOfApple);
		
	}
	
	
}
