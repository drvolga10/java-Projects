package com.aop.sample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class EmployeeServiceAspect {
	//@Before(value = "execution(* com.javainuse.service.EmployeeService.*(..)) and args(name,empId)")
	@Before(value = "execution(* com.aop.sample.service.EmployeeService.*(..)) and args(name,empId)")
	public void beforeAdvice(JoinPoint joinPoint,String name, String empId)
	{
		System.out.println("Before method:"+joinPoint.getSignature());
		
		System.out.println("Creating Employee with name "+name);
	}
	@After(value="execution(* com.aop.sample.service.EmployeeService.*(..)) and args(name,empId)")
	public void afterAdvice(JoinPoint joinPoint, String name, String empId)
	{
		System.out.println("Before method:"+joinPoint.getSignature());
		
		System.out.println("Created employee"+ name);
	}

}
