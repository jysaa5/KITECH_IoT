package aop;

public class ExeTimeCalcurator implements Calcurator {
	
	// 실행을 대행한다.
	// 대행하기위한 객체가 필요
	private  Calcurator delegate;
	
	// 실행을 위한 객체를 받는다.
	public ExeTimeCalcurator(Calcurator delegate) {
		this.delegate = delegate;
	}

	@Override
	public long factorial(long num) {
		
		long startTime = System.nanoTime();
		
		long result = delegate.factorial(num);
		
		long endTime = System.nanoTime();
		
		System.out.println("factorial("+num+") 실행시간 : " + (endTime - startTime));
		
		
		return result;
	}

	
	
	
	
	
	
	
	
	
	
}
