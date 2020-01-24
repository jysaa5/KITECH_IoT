package aop;

public class CalcuratorImp implements Calcurator {

	@Override
	public long factorial(long num) {
		
		//long startTime = System.nanoTime();
		
		long result = 1;
		for(int i=1; i <= num; i++) {
			result = result * i; // result *= i;
		}
		
		//long endTime = System.nanoTime();
		//System.out.println("factorial("+num+") 실행시간 : " + (endTime - startTime));
		
		return result;
	}

	
	
	
	
	
	
}
