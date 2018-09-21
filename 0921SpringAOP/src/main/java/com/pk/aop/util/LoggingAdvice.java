package com.pk.aop.util;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//bean을 자동으로 만들어주는 어노테이션
@Component
@Aspect
public class LoggingAdvice {
	//aop 동작할 메소드
	@Around("execution(* com.pk.aop.HomeController*.*(..))")
	public Object invoke (ProceedingJoinPoint joinPoint)throws Throwable{
		
			System.out.println("메소드가 호출되기 전에 수행합니다.");
		
		//원본 메소드 호출
			Object obj = joinPoint.proceed();
			
			System.out.println("메소드가 작업을 수행한 후에 수행합니다");
			
			return obj;
	}
}
