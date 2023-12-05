package com.uce.edu.repository.modelo;

import org.springframework.stereotype.Component;

@Component
public class Matricula {

	private String fechaMatricula;
	private String valorMatricula;
	private String propietario;
	private String vehiculo;
	
	@Override
	public String toString() {
		return "Matricula [fechaMatricula=" + fechaMatricula + ", valorMatricula=" + valorMatricula + ", propietario="
				+ propietario + ", vehiculo=" + vehiculo + ", getFechaMatricula()=" + getFechaMatricula()
				+ ", getValorMatricula()=" + getValorMatricula() + ", getPropietario()=" + getPropietario()
				+ ", getVehiculo()=" + getVehiculo() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	//set y gets
	public String getFechaMatricula() {
		return fechaMatricula;
	}
	public void setFechaMatricula(String fechaMatricula) {
		this.fechaMatricula = fechaMatricula;
	}
	public String getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(String valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}
	public String getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(String vehiculo) {
		this.vehiculo = vehiculo;
	}
	
	
	
}
	