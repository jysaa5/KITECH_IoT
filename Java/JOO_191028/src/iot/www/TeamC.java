package iot.www;

public class TeamC {

	public static void main(String[] args) {
		game();
		
		
	}//메인함수 끝
	
	public static void game () {

		int x = (int)((Math.random()*1000000)%1000); // 임의 난수 지정
		int a;
		int b;
		int c;
		
		int i=0;
		int k=0;
		
		int strike=0;
		int ball=0;
		int strikeA =0;
		int ballA =0;
		int strikeB=0;
		int ballB =0;
		int strikeC=0;
		int ballC =0;
		
		
		a = x/100; 
		b = (x-(100*a))/10; 
		c = x-((100*a)+(10*b));
	System.out.println(a+","+b+","+c);
				
		//
        int []a_v = new int[3];
		a_v[0] = a;
		a_v[1] = b;
		a_v[2] = c;
		
		//System.out.println(a_v[0]+","+a_v[1]+","+a_v[2]);
		
		int []b_v = new int[3];
		b_v[0] = 1;
		b_v[1] = 2;
		b_v[2] = 3;
		
		int[] c_v = new int[3];
		c_v[0] = 4;
		c_v[1] = 5;
		c_v[2] = 6;
		
		int[] d_v = new int[3];
		d_v[0] = 7;
		d_v[1] = 8;
		d_v[2] = 9;
		

		for(i=0; i<3;++i)
		{//a_v
			for(k=0; k<3; ++k) 
			{//b_v
				if(a_v[i] == b_v[k]) 
					
				{
					if(i==k)
					{ strike++;
					}else ball++;
				
				}
				
			}
		}
		strikeA = strike;
		ballA = ball;
		if(!(strikeA ==0 && ballA==0)) {
		System.out.println("S:"+strikeA+",B:"+ballA);
		}
		
		if(strikeA == 0 && ballA == 0)
		{
			for(i=0; i<3;++i)
			{//a_v
				for(k=0; k<3; ++k) 
				{//b_v
					if(a_v[i] == c_v[k]) 
						
					{
						if(i==k)
						{
							strike++;
						}else ball++;
					
					}
					
				}
				strikeB = strike;
				ballB = ball;
				
			}
			System.out.println("S:"+strikeB+",B:"+ballB);
		
			
			
			if(strikeB == 0 && ballB == 0)
			{
				for(i=0; i<3;++i)
				{//a_v
					for(k=0; k<3; ++k) 
					{//b_v
						if(a_v[i] == d_v[k]) 
							
						{
							if(i==k)
							{ strike =0;
							ball = 0;
								strike++;
							}else ball++;
						
						}
						
					}
			}
				strikeC =strike;
				ballC = ball;
				System.out.println("S:"+strikeC+",B:"+ballC);
				
				if(strikeC == 3)
				{
					System.out.println("S:"+strikeC+"correct");
				}else if(strikeC == 1 && ballC==2)
				{
					if(a_v[i]==d_v[k])
					{
					
				}
				}
				
			}
		

		
		
		
		
		
		}
	}
}//클래스 함수 끝
