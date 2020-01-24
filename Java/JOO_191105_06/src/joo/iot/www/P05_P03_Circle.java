package joo.iot.www;

public class P05_P03_Circle {
	
	double r;
	double area;
	double cir;
	
	public void area (double r) {
		area = r*r*Math.PI;
		System.out.println("원의 넓이:"+String.format("%.2f",area));
		
	}
	
	public void cir (double r) {
		cir = r*2*Math.PI;
		System.out.println("원의 둘레:"+String.format("%.2f",cir));
	}
	
}//클래스 끝
