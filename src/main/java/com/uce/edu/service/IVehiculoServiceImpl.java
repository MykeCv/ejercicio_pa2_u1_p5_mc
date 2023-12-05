package com.uce.edu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uce.edu.repository.IVehiculoRepository;
import com.uce.edu.repository.modelo.Vehiculo;
@Service
public class IVehiculoServiceImpl implements IVehiculoService {

	@Autowired
	private IVehiculoRepository iVehiculoRepository;
	@Override
	public Vehiculo buscar(String placa) {
		return this.iVehiculoRepository.crear(placa);
	}

	@Override
	public void guardar(Vehiculo matricula) {
		this.iVehiculoRepository.insertar(matricula);

	}

	@Override
	public void actulizar(Vehiculo matricula) {
		this.iVehiculoRepository.actulizar(matricula);

	}

	@Override
	public void borrar(String placa) {
		this.iVehiculoRepository.eliminar(placa);


	}

}
