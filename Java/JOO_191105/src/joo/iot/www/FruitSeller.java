package joo.iot.www;

public class FruitSeller {

//상태값: 사과의 개수, 수익금, 사과의 가격 ->변수
	int numofApple = 20; //사과의 개수 
	int myMoney = 0; //판매 금액
	final int APPLE_PRICE = 1000; //사과 1개의 금액
	
//기능: 판매, 판매 데이터 출력
//판매 기능: 돈을 받고 -> 사과의 개수를 계산 -> 사과의 개수 변경 -> 돈의 수치 변경 -> 사과의 개수 반환
	
	int saleApple(int money) {
		//판매할 사과의 개수 
		int num = money/APPLE_PRICE;
		numofApple = numofApple - num; //보유한 사과의 개수 변경 
		myMoney = myMoney + money; //보유한 돈의 데이터 변경
		
		return num;
	}
	
	
//판매 결과 출력 
    void showSaleResult() {
    	System.out.println("남은 사과의 개수: "+ numofApple);
    	System.out.println("판매 수익: "+ myMoney);
    	
    }

	
	
	
}
