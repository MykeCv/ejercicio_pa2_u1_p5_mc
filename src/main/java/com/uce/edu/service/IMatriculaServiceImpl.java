package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IMatriculaRepository;
import com.uce.edu.repository.modelo.Matricula;
@Service
public class IMatriculaServiceImpl implements IMatriculaService {
	
	@Autowired
	private IMatriculaRepository iMatriculaRepository;
	@Override
	public Matricula buscar(String vehiculo) {
		return this.iMatriculaRepository.registrar(vehiculo);
		
	}

	@Override
	public void guardar(Matricula matricula) {
		this.iMatriculaRepository.insertar(matricula);

	}

	@Override
	public void actulizar(Matricula matricula) {
		this.iMatriculaRepository.actulizar(matricula);

	}

	@Override
	public void borrar(String vehiculo) {
		this.iMatriculaRepository.eliminar(vehiculo);

	}

}
