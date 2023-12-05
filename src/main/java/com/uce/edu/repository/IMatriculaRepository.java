package com.uce.edu.repository;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Matricula;

@Repository
public interface IMatriculaRepository {

	public Matricula registrar(String vehiculo);
	
	public void insertar(Matricula matricula);
	
	public void actulizar(Matricula matricula);

	public void eliminar(String vehiculo);

	

}
