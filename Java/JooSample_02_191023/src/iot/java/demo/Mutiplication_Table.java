package iot.java.demo;

public class Mutiplication_Table {
	
	public static void main (String[] args) {
	// 3columns, 여러 개 문자열 합쳐서 (+) 하나의 문자열
	int unit = (int)(Math.random()*10.0)%4;// 0~3에서의 임의의 정수가 될 것이다.
		//제어: 변화 대응
		for(int i=2; i<10; i+=unit) //unit이 들어간 자리는 컬럼 수를 변화시킨다. 
		{//단별 출력
			for(int k=1; k<10; ++k) 
			{
		
			String line ="";
			for(int c=0; c<unit; c++) 
			{
			int dan = i+c; //offset 사용 , 10 9 8 7 6 5 4 3 2 
			int v = dan * k; //
			
			if(dan<10)
			{//출력을 실행할 조건을 써야 된다. 
			String exp = dan+"x"+k+ "="+v+"\t";
			line +=exp;
			}
			}
			System.out.println(line);
			
		}
		
		}
		
	}
	
	
	
	public static void main_1column (String[] args) {
		//TODO Auto-generated method stub
		
		{
			for(int k=2 ; k<=9; ++k) 
			{
			for(int i=1; i<=9; ++i)
			{//속도: 단항>다항
				//변하는 값, 영향(관계)
				int v=k*i;
				String str =(k+"x"+i+"="+v);
				System.out.println(str);
				str.length();
			}
			System.out.println("-------------------");
			}
		
		}
		
		
	}

}
