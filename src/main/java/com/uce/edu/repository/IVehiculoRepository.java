package com.uce.edu.repository;

import com.uce.edu.repository.modelo.Vehiculo;

public interface IVehiculoRepository {

	public Vehiculo crear(String placa );

	public void insertar(Vehiculo vehiculo);

	public void actulizar(Vehiculo vehiculo);
	
	public void eliminar(String placa);
}


