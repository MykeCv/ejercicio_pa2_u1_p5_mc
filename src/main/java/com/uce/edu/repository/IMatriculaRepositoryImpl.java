package com.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Matricula;

@Repository
public class IMatriculaRepositoryImpl implements IMatriculaRepository {

	private static List<Matricula> base = new ArrayList<Matricula>();

	@Override
	public Matricula registrar(String vehiculo) {
		for (Matricula matricula : base)
			if (matricula.getVehiculo() == vehiculo) {
				Matricula matricula1 = new Matricula();
				matricula1.setFechaMatricula(matricula.getFechaMatricula());
				matricula1.setPropietario(matricula.getPropietario());
				matricula1.setValorMatricula(matricula.getValorMatricula());
				matricula1.setVehiculo(matricula.getVehiculo());

				return matricula1;
			}

		return null;
	}

	@Override
	public void insertar(Matricula matricula) {
		base.add(matricula);

	}

	@Override
	public void actulizar(Matricula matricula) {
		this.eliminar(matricula.getVehiculo());
		this.insertar(matricula);

	}

	public Matricula seleccionarEliminar(String vehiculo) {
		for (Matricula matricula : base) {
			if (matricula.getVehiculo().equals(vehiculo)) {
				return matricula;
			}
		}

		return null;
	}

	@Override
	public void eliminar(String vehiculo) {
		Matricula matricula = this.seleccionarEliminar(vehiculo);
		base.remove(matricula);
	}

}
