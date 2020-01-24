package problem.iot.ww;

public class Product {
	
	int price; //가격
	int bonusPoint; // 보너스
	
	public Product(int price) { //생성자
		this.price = price;
		this.bonusPoint = (int)(price/10f);		
	}

	
	public static void main(String[]args) { //위치는 파일의 클래스인 곳 아래에 위치 해야 한다. 
		Buyer b = new Buyer();
		
		Tv tv = new Tv(100);
		//Product p1 = tv; //다형성
		
		Computer com = new Computer(300);
		//Product p2 =com; //다형성
		Audio aud =new Audio(50);
		
		b.buy(tv);
		b.buy(com);
		b.buy(aud);
		
		b.summary();
		
		System.out.println("===================================");
		System.out.println("현재 남은 돈: "+ b.money);
		System.out.println("현재 보너스 포인트: "+ b.bonusPoint);
		
	}//메인메소드 끝
}//Product 클래스 끝

class Audio extends Product{
	public Audio(int price) {//생성자
		super(price);
		
	}

	@Override //오버라이딩, @: 어노테이션, 부수적인 의미 부여  //오버라이딩의 환경을 검사해준다. 
	public String toString() {
		return "Audio";
	}
	
}



class Tv extends Product {

	public Tv(int price) {//생성자
		super(price);
		
	}

	@Override //오버라이딩, @: 어노테이션, 부수적인 의미 부여  //오버라이딩의 환경을 검사해준다. 
	public String toString() {
		return "Tv";
	}
}


class Computer extends Product{

	public Computer(int price) {
		super(price);
	
	}

	@Override
	public String toString() {
		return "Computer";
	}
	
}


class Buyer {

	int money = 1000;
	int bonusPoint = 0; 
	
	//장바구니
	Product [] cart = new Product[10]; //생성자를 만들어서 배열의 크기를 구매자마다 다르게 할 수 있다.
	//구매 상품의 개수, 배열의 입력할 때 index 값으로 사용, 반복문 사용시 반복의 조건 
	int cnt = 0; //
	
	
	void buy(Product p) { //Product 타입의 p 변수로 받음. 
	
		if(money<p.price) {
			System.out.println("전액이 부족해서 구매할 수 없습니다.");
		return; //메서드의 종료를 의미함.
		}
		money = money - p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		
		//바구니에 추가 
		cart[cnt++] = p;
		//구매 상품의 개수를 1증가. 
		//cnt++; 
		System.out.println(p+"을/를 구입하셨습니다."); //toString() 호출 / p -> computer, Tv
		
	}
	
	void summary() {
		//구매 상품의 총 금액 
		int sum = 0;
		//구매 제품 리스트 
		String productList="";
		
		for(int i=0; i<cnt; i++) {
			//제품 가격을 더한다.
			sum += cart[i].price;
			//제품리스트
			productList += cart[i] + ",";
		}
		
		System.out.println("구입한 제품의 총 금액은 " + sum + "원 입니다.");
		System.out.println("구입한 제품의 목록은 "+productList+"입니다.");
		
		
	}
}
