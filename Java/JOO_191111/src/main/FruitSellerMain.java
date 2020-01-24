package main;

import joo.iot.www.FruitBuyer;
import joo.iot.www.FruitSeller;

public class FruitSellerMain {

	public static void main(String[] args) {
	//인스턴스를 생성해야 한다. 
	//샐러 생성
		//샐러1 생성
		FruitSeller seller; //참조변수 생성: 인스턴스의 주소를 저장. 
		//seller = new FruitSeller(0,30,1500); //메모리에 저장된 인스턴스의 주소를 저장. 
		seller = new FruitSeller();
		
		//샐러2 생성
		//FruitSeller seller2 = new FruitSeller(0,10,1000);
		FruitSeller seller2 = new FruitSeller (seller);
		
		// 인스턴스 생성 -> 인스턴스 메모리의 주소값을 반환 
		//바이어 생성 
		FruitBuyer buyer = new FruitBuyer(10000);
		//위에꺼나 아래꺼나 똑같음. 변수 생성과 인스턴스 생성을 동시에 함.
		
		
		//구매자가 5000원 어치 사과를 구매 
		buyer.buyApple(seller, 3000);
		buyer.buyApple(seller2, 3000);
		
		System.out.println("판매자1의 현재 상황");
		seller.showSaleResult();
		
		System.out.println("판매자2의 현재 상황");
		seller2.showSaleResult();
		
		System.out.println("=======================================");
		
		System.out.println("구매자의 현재 상황");
		buyer.showBuyResult ();
		

		System.out.println("구매자의 보유한 돈의 액수:"+buyer.getMyMoney());
	}

}
