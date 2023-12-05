package com.uce.edu.service;

import com.uce.edu.repository.modelo.Propietario;

public interface IPropietarioService {

	public Propietario buscar(String cedula);

	public void guardar(Propietario matricula);

	public void actulizar(Propietario matricula);

	public void borrar(String cedula);
}
