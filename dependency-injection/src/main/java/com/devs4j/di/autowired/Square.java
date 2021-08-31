package com.devs4j.di.autowired;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Square implements Figure{

	@Value("${square.side}")
	private double side;
	
	@Override
	public Double calculateArea() {
		return side * side;
	}

}
