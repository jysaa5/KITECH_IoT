package www.iot.joo;
import java.util.Scanner;
public class P02_vote {

	public static void main(String[] args) {
		int ran;
		Scanner kb = new Scanner(System.in);	
		int captain;
		System.out.println("제비뽑기를 시작하려면 1번을 누르세요");
		int menu = Integer.parseInt(kb.nextLine());
			
		if(menu==1)
	    { ran = (int)(Math.random()*100);
	      captain =ran%25;    	 
		if(captain == 1) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("고현주입니다.");	
		}if(captain == 2) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("구자윤입니다.");	
		}if(captain == 3) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("김난형입니다.");	
		}if(captain == 4) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("김동진입니다.");	
		}if(captain == 5) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("김주연입니다.");	
		}if(captain == 6) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("문영기입니다.");	
		}if(captain == 7) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("박준섭입니다.");	
		}if(captain == 8) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("박지은입니다.");	
		}if(captain == 9) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("방창용입니다.");	
		}if(captain == 10) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("양햇살입니다.");	
		}if(captain == 11) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("엄예빈입니다.");	
		}if(captain == 12) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("위은주입니다.");	
		}if(captain == 13) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("이용재입니다.");	
		}if(captain == 14) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("이진형입니다.");	
		}if(captain == 15) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("이택수입니다.");	
		}if(captain == 16) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("장한솔입니다.");	
		}if(captain == 17) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("정엄지입니다.");	
		}if(captain == 18) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("정용기입니다.");	
		}if(captain == 19) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("조지윤입니다.");	
		}if(captain == 20) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("조성빈입니다.");	
		}if(captain == 21) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("최찬영입니다.");	
		}if(captain == 22) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("하재운입니다.");	
		}if(captain == 23) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("홍지수입니다.");	
		}if(captain == 24) {
			System.out.print("축하합니다. 반장은 ");
			System.out.println("황다울입니다.");	
		}
	    }

	}

}
