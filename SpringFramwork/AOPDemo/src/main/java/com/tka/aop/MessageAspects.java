package com.tka.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MessageAspects {
	
//	@After("execution(public void depoist1())")
//    public void sendSMS() {
//	System.out.println("SMS send to the client");
//}	
//	@After("execution(public void depoist1(..))")
//	public void sendSMS(JoinPoint jt) {
//		System.out.println("SMS send To the Client...U amt is "+Arrays.toString(jt.getArgs()));
//	}
//	@Before("execution(public void withdraw())")
//	public void pinValid() {
//		System.out.println("pin is validate");
//	}
	@Around("execution(* com.tka.entity.Account.*(..))")
	public void arroundMessage(ProceedingJoinPoint p) {
		System.out.println("== befor method pin is valideted ");
	// pin validation logic
		//end of validation logic
		try {
			p.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//send sms logic
		System.out.println("==After method send sms logic==");
	}
}
