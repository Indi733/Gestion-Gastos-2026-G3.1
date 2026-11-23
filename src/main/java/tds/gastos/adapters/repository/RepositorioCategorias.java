package tds.gastos.adapters.repository;

import java.util.List;
import java.util.Optional;

import tds.gastos.negocio.modelo.Categoria;

public interface RepositorioCategorias {

	
	List<Categoria> getCategorias();
	
	Optional<Categoria> buscarCategoria(String nombre);
	
	void addCategoria(Categoria categoria);
	
	//TODO: probablemente quitar enunciado no obliga a poder eliminar categorias
	void removeCategoria(Categoria categoria);
		
}
