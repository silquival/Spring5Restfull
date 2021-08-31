package com.devs4j.di.profiles;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile(value = {"dev","default"})
public class DevEnviroment implements EnviromentService{

	@Override
	public String getEnviroment() {
		return "Dev";
	}

}
