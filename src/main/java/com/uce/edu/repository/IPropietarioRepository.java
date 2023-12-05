package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Propietario;

@Repository
public interface IPropietarioRepository {

	public Propietario crear(String cedula );

	public void insertar(Propietario propietario);

	public void actulizar(Propietario propietario);
	
	public void eliminar(String cedula);


}
