package com.uce.edu;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.uce.edu.repository.modelo.Matricula;
import com.uce.edu.repository.modelo.Propietario;
import com.uce.edu.repository.modelo.Vehiculo;
import com.uce.edu.service.IMatriculaService;
import com.uce.edu.service.IPropietarioService;
import com.uce.edu.service.IVehiculoService;

@SpringBootApplication
public class EjercicioPa2U1P5McApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService iPropietarioService;
	
	@Autowired
	private IMatriculaService iMatriculaService;
	
	@Autowired
	private IVehiculoService iVehiculoService;
	
	public static void main(String[] args) {
		SpringApplication.run(EjercicioPa2U1P5McApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Vehiculo v1 = new Vehiculo();
		v1.setMarca("Audi");
		v1.setPlaca("PAB1212");
		v1.setPrecio(20000);
		v1.setTipo("Liviano");
		
		this.iVehiculoService.guardar(v1);
		
		Vehiculo v2 = new Vehiculo();
		v2.setMarca("HINO");
		v2.setPlaca("PCA2012");
		v2.setPrecio(40000);
		v2.setTipo("Pesado");
		
		this.iVehiculoService.guardar(v2);
		
		Matricula m1 = new Matricula();
		m1.setFechaMatricula("2013-10-18");
		m1.setPropietario("JUAN AGUILAR");
		m1.setValorMatricula("1500");
		m1.setVehiculo("HINO");
		
		this.iMatriculaService.guardar(m1);
		
		Propietario p1 = new Propietario();
		p1.setApellido("ANDRADE");
		p1.setCedula("0501774053");
		p1.setGenero("Masculino");
		p1.setNombre("JOSE");
		
		this.iMatriculaService.guardar(m1);

		
	}

}
