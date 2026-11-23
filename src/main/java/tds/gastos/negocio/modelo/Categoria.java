package tds.gastos.negocio.modelo;

import java.util.Objects;

public class Categoria {

	
	private String nombre;
	
	public Categoria(String nombre) {
		this.nombre = nombre;
	}

	
	
	
	//Getters y Setters=========================
	public String getNombre() {
		return nombre;
	}




	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}




	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Categoria other = (Categoria) obj;
		return Objects.equals(nombre, other.nombre);
	}
	
	
	
	
	
	
}


