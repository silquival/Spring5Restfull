package com.devs4j.di.qualifiers;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class Pajaro extends Animal implements Volador{

	private static final Logger log = org.slf4j.LoggerFactory.getLogger(Pajaro.class);
	
	public Pajaro(@Value("Pajaro loco") String nombre, @Value("1") Integer edad) {
		super(nombre, edad);
	}
	
	@Override
	public void volar() {
		log.info("Soy un pajaro y estoy volando");		
	}

}
