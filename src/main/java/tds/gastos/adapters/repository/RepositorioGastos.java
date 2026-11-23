package tds.gastos.adapters.repository;

import java.util.List;
import java.util.Optional;

import tds.gastos.negocio.modelo.Gasto;

public interface RepositorioGastos {

	
	List<Gasto> getGastos();
	
	Optional<Gasto> buscarGasto(int id);
	
	//Asigna el id cuando se añade a la BD el id que devuelve se le mete como atributo id
	void addGasto(Gasto gasto);
	
	void removeGasto(Gasto gasto);
	
	void updateGasto(Gasto gasto);
	
	
}
