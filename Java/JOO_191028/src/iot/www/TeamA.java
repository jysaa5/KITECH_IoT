package iot.www;

public class TeamA {

public static void main(String[] args) {
		// 숫자맞히기 - 야구게임
		// 각 자리에 중복은 없어야 한다
		// 3자리 정수를 서로 맞히기: 백, 십, 일 / 값이 같다. 위치가 같다 = 스트라이크(3개 자리가 맞으면)
		// 위치가 다르다 = 볼(3개 자리 중에 틀리면 볼)
	int[] number = new int [10];
	int ANSWER=0;
		
	for(int i=0;i<number.length;i++)
	{
		number[i]=i;
	}//배열에 숫자 집어넣기
		
	do{
		for(int j=0;j<10;j++) 
		{
		 int k= (int)(Math.random()*10);//0~9 숫자 임의 생성
		 int tmp = number[j];
		 number[j] = number[k];
		 number[k] = tmp;
		 }	
		 ANSWER = number[0]*100 + number[1]*10 + number[2];
		 }while(100>ANSWER);//두 자리일 때에는 반복
	
	System.out.println(ANSWER);
		int[] b_v = new int[3]; 
		int[] c_v = new int[3];
		int s = 0;
		int b = 0;
		
		for(int i=0;i<3;i++) 
		{
			for(int k=0;k<3;k++) 
			{ 
				for(int m=0;m<10;++m)
				{
						b_v[0] = m; // 백의 자리
						b_v[1] = m; // 십의 자리 
						b_v[2] = m; // 일의 자리
		
				if(number[i] == b_v[k]) 
				{
					if(i==k) 
					{
						s++;
						c_v[s-1]=m;
						
					}		
					else 
					{
						b++;
					}
					
					if(s==3) 
					{
						break;
					}

				}
			
			}
//System.out.println("\nS:"+s+", B:"+b);
		}
// 스트라이크가 3개가 아니면 이어서 해야된다. 
		System.out.print(c_v[0]);
		System.out.print(c_v[1]);
		System.out.println(c_v[2]);
	}


}//메인함수 끝
}//클래스 끝
