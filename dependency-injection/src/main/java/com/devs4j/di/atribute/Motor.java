package com.devs4j.di.atribute;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Motor {

	/** Inyección de dependencias por atributos de clase
	@Value("Xl1")
	private String marca;
	@Value("1982")
	private Integer modelo;
	
	public Motor() {
		
	}

	public Motor(String marca, Integer modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	} */
	
	
	/** Inyección de dependencias por constructor
	
	private String marca;
	private Integer modelo;
	
	public Motor() {
		
	}

	public Motor(@Value("Xl1") String marca, @Value("Xl1") Integer modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	} */
	
	/** Inyección de dependencias por getters y setters */
	
	
	private String marca;
	private Integer modelo;
	
	public Motor() {
	}

	public Motor(String marca, Integer modelo) {
		this.marca = marca;
		this.modelo = modelo;
	}


	public String getMarca() {
		return marca;
	}
	@Value("Xl1")
	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Integer getModelo() {
		return modelo;
	}
	@Value("1982")
	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}

	@Override
	public String toString() {
		return "Motor [marca=" + marca + ", modelo=" + modelo + "]";
	}
	
}
