package com.devs4j.di.aop;


import java.lang.reflect.Modifier;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class MyAspect {

	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	@Before("PointcutExample.targetObjectMethods()")
	public void before(JoinPoint joingPoint) {
		log.info("Method name {}", joingPoint.getSignature().getName());
		log.info("Object type {}", joingPoint.getSignature().getDeclaringTypeName());
		log.info("Modifiers {}", joingPoint.getSignature().getModifiers());
		log.info("Is public {}", Modifier.isPublic(joingPoint.getSignature().getModifiers()));
		log.info("Arguments {}", joingPoint.getArgs());
		log.info("Before advice");
	}
	
}
