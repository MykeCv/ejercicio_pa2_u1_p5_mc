package com.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.uce.edu.repository.modelo.Propietario;

@Repository
public class IPropietarioRepositoryImpl implements IPropietarioRepository {

	private static List<Propietario> base = new ArrayList<Propietario>();

	@Override
	public Propietario crear(String cedula) {
		for (Propietario propietario : base)
			if (propietario.getCedula() == cedula) {
				Propietario propietario1 = new Propietario();
				propietario1.setCedula(propietario.getCedula());
				propietario1.setNombre(cedula);

				return propietario1;
			}
		return null;
	}

	@Override
	public void insertar(Propietario propietario) {
		base.add(propietario);

	}

	@Override
	public void actulizar(Propietario propietario) {
		this.eliminar(propietario.getCedula());
		this.insertar(propietario);

	}

	public Propietario seleccionarEliminar(String cedula) {
		for (Propietario propietario : base) {
			if (propietario.getCedula().equals(cedula)) {
				return propietario;
			}
		}

		return null;
	}

	@Override
	public void eliminar(String cedula) {
		Propietario propietario = this.seleccionarEliminar(cedula);
		base.remove(propietario);
	}

}
