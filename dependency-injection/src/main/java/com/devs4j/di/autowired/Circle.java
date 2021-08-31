package com.devs4j.di.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Circle implements Figure{

	@Value("${circle.radius}")
	private double radious;
	
	@Override
	public Double calculateArea() {
		return Math.PI * Math.pow(radious, 2);
	}

}
