package com.uce.edu.service;

import com.uce.edu.repository.modelo.Matricula;

public interface IMatriculaService {
	
	public Matricula buscar(String vehiculo);

	public void guardar(Matricula matricula);

	public void actulizar(Matricula matricula);

	public void borrar(String vehiculo);
}
