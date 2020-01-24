package aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.Signature;

public class ExeTimeAspect {

	public Object measure(ProceedingJoinPoint joinPoint) throws Throwable {

		long start = System.nanoTime();

		try {
			Object result = joinPoint.proceed(); // 어드바이스가 적용된 객체의 메서드 실행
			return result;
		} finally {
			long end = System.nanoTime();

			// 실행 메서드 정보
			Signature sig = joinPoint.getSignature();

			System.out.printf("%s.%s 실행 시간 : %d ns\n", joinPoint.getTarget().getClass().getSimpleName(), sig.getName(),
					(end - start));

		}

	}

}
