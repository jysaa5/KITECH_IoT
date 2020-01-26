package iot.www;
import java.util.Arrays; //배열을 다루기 위한 다양한 메소드가 포함되어 있다. 
public class TeamB {

	public static void main(String[] args) {
	int s = 0;
	int b = 0;
	int a_v[]; 
	int b_v[];

	a_v = new int[3];
	
	a_v[0] = 0;
	a_v[1] = 0;
	a_v[2] = 0;
	
	a_v[0] = (int)(Math.random()*10);
	a_v[1] = (int)(Math.random()*10);
	a_v[2] = (int)(Math.random()*10);
	
	
	if((a_v[0]==a_v[1])||(a_v[0]==a_v[2])||(a_v[1]==a_v[2]))
	{
		a_v[0] = (int)(Math.random()*10);
		a_v[1] = (int)(Math.random()*10);
		a_v[2] = (int)(Math.random()*10);
	}
	

	System.out.println("정답:");
	System.out.println(Arrays.toString(a_v)); //배열 내용 출력하기 
	System.out.println(" ");
	System.out.println("대답:");
	
	while(s != 3) 
	{
	b_v = new int[3];
	
	b_v[0] = 0;
	b_v[1] = 0;
	b_v[2] = 0;
	
	b_v[0] = (int)(Math.random()*10);
	b_v[1] = (int)(Math.random()*10);
	b_v[2] = (int)(Math.random()*10);
	
	if((b_v[2]==b_v[0])||(b_v[2]==b_v[1])||(b_v[0]==b_v[1]))
	{
		b_v[0] = (int)(Math.random()*10);
		b_v[1] = (int)(Math.random()*10);
		b_v[2] = (int)(Math.random()*10);
	}
	
	System.out.println(Arrays.toString(b_v));
	
	for( int i =0; i<3;++i) 
	{
	 for(int k=0; k<3; ++k) 
	 {
		if(a_v[i] == b_v[k]) 
		{
			if(i == k)  
			{
				s++;
			}else if (s == 3) 
			{

			break;
			}
		}
	 }
	}
	}

	System.out.println("S:"+s+", B:"+b);
	System.out.println("혹시 선택된 수가"+Arrays.toString(a_v)+"인가요? Yes or No");
	
}//메인함수끝
}//클래스함수 끝
