package com.devs4j.di;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

import com.devs4j.di.autowired.AreaCalculatorService;

@SpringBootApplication
public class DependencyInjectionApplication {

	private static final Logger log = LoggerFactory.getLogger(DependencyInjectionApplication.class);
	
	@Bean
	public String getAplicationName() {
		return "¡Dev4j rules!";
	}
	
	public static void main(String[] args) {
		
//		ConfigurableApplicationContext context =  SpringApplication.run(DependencyInjectionApplication.class, args);
//		AreaCalculatorService calculator = context.getBean(AreaCalculatorService.class);
//		log.info("Area total == {}", calculator.calcAreas());
		
		ExpressionParser parser = new SpelExpressionParser();
		Expression expression = parser.parseExpression("10 >= 20");
		log.info("Result {}", expression.getValue());
	}
	

}
