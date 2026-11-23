package tds.gastos.negocio.modelo;

import java.time.LocalDate;
import java.util.Objects;

public class Gasto {

	private int id;
	private double cantidad;
	private LocalDate fecha;
	private Categoria categoria;
	
	public Gasto(double cantidad, LocalDate fecha, Categoria categoria) {
		this.cantidad = cantidad;
		this.fecha = fecha;
		this.categoria = categoria;
	}

	
	

	public int getId() {
		return id;
	}




	public void setId(int id) {
		this.id = id;
	}




	public double getCantidad() {
		return cantidad;
	}




	public void setCantidad(double cantidad) {
		this.cantidad = cantidad;
	}




	public LocalDate getFecha() {
		return fecha;
	}




	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}




	public Categoria getCategoria() {
		return categoria;
	}




	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}




	@Override
	public int hashCode() {
		return Objects.hash(Integer.valueOf(id));
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Gasto other = (Gasto) obj;
		return id == other.id;
	}
	
	
	
	
	
	
	
}
