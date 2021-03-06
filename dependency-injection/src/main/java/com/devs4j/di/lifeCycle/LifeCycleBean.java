package com.devs4j.di.lifeCycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Lazy // si el bean es lazy no se inicializará a menos que se inyecte
//@Scope("prototype") -- recordemos que pre destroy no se ejecuta para beans prototype
public class LifeCycleBean implements BeanNameAware,InitializingBean,DisposableBean{

	
	private static final Logger log = LoggerFactory.getLogger(LifeCycleBean.class);

	/**
	 * Se ejecuta durante la construcción del bean
	 */
	@Override
	public void setBeanName(String name) {
		log.info("Bean name aware {}", name);
	}
	
	/**
	*Esto se ejecutará después de la inyección de dependencia
	*/
	@PostConstruct
	public void init() {
		log.info("Post construct");
	}
	
	/**Esto se ejecutará antes de que el bean sea destruido
	*No se ejecua para bean prototype
	*/
	@PreDestroy
	public void destroyBean() {
		log.info("Pre destroy");
	}
	
	@Override
	public void afterPropertiesSet() throws Exception {
		log.info("After properties set");		
	}

	@Override
	public void destroy() throws Exception {
		log.info("Destroy method");
	}

}
