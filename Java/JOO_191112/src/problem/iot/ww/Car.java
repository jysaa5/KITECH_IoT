package problem.iot.ww;

public class Car { //public class는 java파일에서 대표 클래스 1개만 public이 가능하다. 
	
	int gasolinegauge;

public Car(int gasolinegauge) {
	super(); //Object()이다.

	this.gasolinegauge = gasolinegauge;
}
	

class HybridCar extends Car{
	
	int electronicGauge;
	
public HybridCar(int gasolinegauge) { 
	super(gasolinegauge);

}

public HybridCar(int gasolinegauge, int electronicGauge) {
	super(gasolinegauge);//이게 먼저 나와야 된다. 
	this.electronicGauge = electronicGauge;
}
}


class HybridWaterCar extends HybridCar {
	int waterGauge;
	
	public HybridWaterCar(int gasolinegauge, int electronicGauge, int waterGauge) {
		//super(gasolinegauge, electronicGauge);
		super(gasolinegauge);
		this.waterGauge = waterGauge;
	}

	
	
	
}

//public void main(String[]args) {
	//System.out.println("잔여 가솔린 : " + gasolinegauge);
//	System.out.println("잔여 가솔린 :"  + electronicGauge);
//	System.out.println("잔여 가솔린 :"  + waterGauge);
//}


}
