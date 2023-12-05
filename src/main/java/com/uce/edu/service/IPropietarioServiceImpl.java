package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IPropietarioRepository;
import com.uce.edu.repository.modelo.Propietario;
@Service
public class IPropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepository iPropietarioRepository;
	@Override
	public Propietario buscar(String cedula) {
		return this.iPropietarioRepository.crear(cedula);
	}

	@Override
	public void guardar(Propietario matricula) {
		this.iPropietarioRepository.insertar(matricula);

	}

	@Override
	public void actulizar(Propietario matricula) {
		this.iPropietarioRepository.actulizar(matricula);

	}

	@Override
	public void borrar(String cedula) {
		this.iPropietarioRepository.eliminar(cedula);

	}

}
