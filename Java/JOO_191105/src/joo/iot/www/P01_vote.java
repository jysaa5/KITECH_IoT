package joo.iot.www;
import java.util.Scanner;

public class P01_vote {
	static String[] name = {"고현주","구자윤","김난형","김동진","김주연","문영기","박준섭","박지은" 
	           ,"방창용","양햇살","엄예빈","위은주","이용재","황다울","이진형","이택수"
               ,"장한솔","정엄지","정용기","조성빈","조지윤","최찬영","하재운","홍지수"}; //메모리에 미리 올라가 있다. static 이므로.
			
	
	public static void main(String[] args) {
		Scanner s =new Scanner(System.in);
		
		while(true) {
			System.out.println("섞을 횟수:");
			int cnt = s.nextInt();
			if(cnt !=1) {
				suffle(cnt);
				System.out.println("반장 : "+name[0]); 
				
			}else {
				break;
			}
		}

	}


	private static void suffle(int num) { //매개변수: int num
		String temp = null;
		for(int i=0; i<num; i++) {
			int rNum = (int)(Math.random()*name.length); //배열도 instance //0<=name.length<=23 //name배열의 index
			temp = name[0];
			name[0] = name[rNum];
			name[rNum] = temp; 
			
		}
		
	}
}

