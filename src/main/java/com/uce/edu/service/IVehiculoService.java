package com.uce.edu.service;

import com.uce.edu.repository.modelo.Vehiculo;

public interface IVehiculoService {

	public Vehiculo buscar(String placa);

	public void guardar(Vehiculo matricula);

	public void actulizar(Vehiculo matricula);

	public void borrar(String placa);
}
