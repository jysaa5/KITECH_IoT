package aop;

public class RecCalcurator implements Calcurator {

	@Override
	public long factorial(long num) {
	
		if(num == 0) {
			return 1;
		} else {
			return num * factorial(num-1);
		}
		
	}

}
