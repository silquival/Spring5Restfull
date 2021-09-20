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
@Order(0)
public class MyAspect2 {
	
	private static final Logger log = LoggerFactory.getLogger(MyAspect.class);

	@Before("PointcutExample.targetObjectMethods()")
	public void before(JoinPoint joingPoint) {
		log.info("1 Method name {}", joingPoint.getSignature().getName());
		log.info("1 Object type {}", joingPoint.getSignature().getDeclaringTypeName());
		log.info("1 Modifiers {}", joingPoint.getSignature().getModifiers());
		log.info("1 Is public {}", Modifier.isPublic(joingPoint.getSignature().getModifiers()));
		log.info("1 Arguments {}", joingPoint.getArgs());
		log.info("1 Before advice");
	}

}
