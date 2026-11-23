package tds.gastos.adapters.repository.impl;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class BaseDatosSQLite implements AutoCloseable{

	private static final String URL = "jdbc:sqlite:basedatos.db";
	private Connection conexion;
	
	public BaseDatosSQLite() throws SQLException {
		conexion = DriverManager.getConnection(URL);
		crearTablas();
	}

	@Override
	public void close() throws Exception {
		try {
			if(conexion != null) {
				conexion.close();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	private void crearTablas() throws SQLException {
		String sqlCategorias = """		
			CREATE TABLE IF NOT EXISTS Categorias (
			 nombre TEXT NOT NULL PRIMARY KEY
			);""";
	
		String sqlGastos = """
			 CREATE TABLE IF NOT EXISTS Gastos(
			  id INTEGER PRIMARY KEY AUTOINCREMENT,
			  fecha TEXT NOT NULL,
			  cantidad REAL NOT NULL,
			  categoria TEXT,
			  FOREIGN KEY (categoria) REFERENCES Categorias(nombre)
			  );""";
	
		try (Statement stmt = conexion.createStatement()){
			stmt.execute(sqlCategorias);
			stmt.execute(sqlGastos);
		}
	}
	
	
	public Connection getConexion() {
	    return conexion;
	}
	
}
