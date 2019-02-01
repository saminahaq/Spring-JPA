package com.samina.springAop.Aspect;


import org.aspectj.lang.annotation.Pointcut;

public class CommonJoinPointConfig {
	
	@Pointcut("execution(* com.samina.springAop.data.*.*(..))")
	public void dataLayerExecution(){}
	
	@Pointcut("execution(* com.samina.springAop.Business.*.*(..))")
	public void businessLayerExecution(){}
	
	@Pointcut("dataLayerExecution() && businessLayerExecution()")
	public void allLayerExecution(){}
	
	@Pointcut("bean(*dao*)")
	public void beanContainingDao(){}
	
	@Pointcut("within(com.samina.springAop.data..*)")
	public void dataLayerExecutionWithWithin(){}

	@Pointcut("@annotation(com.samina.springAop.Aspect.TrackTime)")
	public void trackTimeAnnotation(){}

}
