package bverse.baseDatos;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Conexion {
	static final String DB_URL = "jdbc:postgresql://localhost/bookverse"; //telefonia es el nombre de la base de datos
	static final String USER = "danialee";//usuario del postgres
	static final String PASS = "2003";//contraseña del posstgres
	//siempre se debe crear el path descargando de https://jdbc.postgresql.org/download/
	//para java version 8
	
	
	public Connection getConexionPostgres()  {
		Connection conn = null;
		try {
			conn =  DriverManager.getConnection(DB_URL, USER, PASS);
			
		}catch(SQLException ex){
			System.out.println("No se pudo conectar a la base de datos");
			return null;
		}
		System.out.println("Conexion exitosa");
		return conn;
		
	}
	
	
}
