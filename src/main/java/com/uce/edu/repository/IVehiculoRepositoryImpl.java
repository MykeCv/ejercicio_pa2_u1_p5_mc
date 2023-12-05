package com.uce.edu.repository;

import java.util.ArrayList;
import java.util.List;

import com.uce.edu.repository.modelo.Vehiculo;

public class IVehiculoRepositoryImpl implements IVehiculoRepository {

	private static List<Vehiculo> base = new ArrayList<Vehiculo>();

	@Override
	public Vehiculo crear(String placa) {

		for (Vehiculo vehiculo : base)
			if (vehiculo.getPlaca() == placa) {
				Vehiculo vehiculo1 = new Vehiculo();
				vehiculo1.setPlaca(vehiculo.getPlaca());
				vehiculo1.setMarca(vehiculo.getMarca());
				vehiculo1.setPrecio(vehiculo.getPrecio());
				vehiculo1.setTipo(vehiculo.getTipo());
				return vehiculo1;
			}
		return null;
	}

	@Override
	public void insertar(Vehiculo vehiculo) {
		base.add(vehiculo);

	}

	@Override
	public void actulizar(Vehiculo placa) {
		this.eliminar(placa.getPlaca());
		this.insertar(placa);
	}
	
	public Vehiculo seleccionarEliminar(String numero) {
		for (Vehiculo vehiculo : base) {
			if (vehiculo.getPlaca().equals(numero)) {
				return vehiculo;
			}
		}

		return null;
	}

	@Override
	public void eliminar(String placa) {
		Vehiculo vehiculo = this.seleccionarEliminar(placa);
		base.remove(vehiculo);
	}
}
