package org.mtrs.apspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.mtrs.controller.BusController;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ApplicationLoggingAspects {
	private static final Logger logger=LoggerFactory.getLogger(BusController.class);
	
//	
//	@Pointcut("within(* org.mtrs.controller.BusController.addBus1(..))")
//	public void pointCut1() {
//		
//	}
//	@Pointcut("within(* org.mtrs.controller.BusController.addBus2(..))")
//	public void pointCut2() {
//		
//	}
	
	@Before("execution(* org.mtrs.controller.BusController.addBus(..))")
	@Order(2)
	public void beforeMyAdvice1(JoinPoint joinPoint) throws Throwable {
		System.out.println("logger from beforeMyAdvice1 ");

	}
	@Before("execution(* org.mtrs.controller.BusController.addBus(..))")
	@Order(1)
	public void beforeMyAdvice2(JoinPoint joinPoint) throws Throwable {
		System.out.println("logger from beforeMyAdvice2 ");

	}

//	@Around("execution(* org.mtrs.controller.BusController.method2(..))")
//	public void MyAdvice1(JoinPoint joinPoint) throws Throwable {
//		logger.info("post request has reached to controller"+joinPoint);
//		logger.info("controller is calling bus serice and passing the dto");
//		logger.warn("bus obj is  created");
//	
//		logger.info("controller is calling bus serice and passing the dto");
//		logger.warn("bus obj is  created");
////		System.out.println("before advice is got executed");
////		System.out.println(joinPoint.getTarget());
////		for(Object object:joinPoint.getArgs()) {
////			System.out.println(object.toString());
////		}
////		System.out.println(joinPoint.getSignature());
////		System.out.println(joinPoint.getKind());
////		System.out.println(joinPoint.getSourceLocation());
//		
//	}
//	public void MyAdvice2(ProceedingJoinPoint joinPoint) throws Throwable {
//		logger.info("post request has reached to controller"+joinPoint);
//		logger.info("controller is calling bus serice and passing the dto");
//		logger.warn("bus obj is  created");
//		joinPoint.proceed();
//		logger.info("controller is calling bus serice and passing the dto");
//		logger.warn("bus obj is  created");
////		System.out.println("before advice is got executed");
////		System.out.println(joinPoint.getTarget());
////		for(Object object:joinPoint.getArgs()) {
////			System.out.println(object.toString());
////		}
////		System.out.println(joinPoint.getSignature());
////		System.out.println(joinPoint.getKind());
////		System.out.println(joinPoint.getSourceLocation());
//		
	//}
}
