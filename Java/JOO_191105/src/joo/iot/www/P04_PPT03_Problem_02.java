package joo.iot.www;

public class P04_PPT03_Problem_02 {

	public static void main(String[] args) {
	int a = 2;
	int b = 3;
	int	c = 5; 
	int d = 6;
	double solution = 0; 
	
	solution  = Math.pow(c, b)+(Math.pow(d, a)-Math.pow(a, a));
	solution = solution - (Math.pow(a, b)*Math.pow(b, a));
	solution = solution/c;
	System.out.println((int)solution);

		
	}

}
