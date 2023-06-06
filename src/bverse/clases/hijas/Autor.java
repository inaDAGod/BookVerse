package bverse.clases.hijas;

import java.util.*;

import bverse.clases.madres.*;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import bverse.baseDatos.*;
public class Autor extends Persona{
	private ArrayList <Publicacion> libros;

	public Autor(String nombre, String fotoUrl, ArrayList<Publicacion> libros) {
		super(nombre, fotoUrl);
		this.libros = libros;
		
	}
	public Autor() {
		super("", "");
		this.libros = null;
		
	}
	public Autor(String nombre) {
		super(nombre, "");
		this.libros = null;
		
	}
	

	public Autor(String nombre, String fotoUrl) {
		super(nombre, fotoUrl);
		// TODO Auto-generated constructor stub
	}


	public ArrayList<Publicacion> getLibros() {
		return libros;
	}

	public void setLibros(ArrayList<Publicacion> libros) {
		this.libros = libros;
	}
	
	public void agregarPubli(Publicacion pu) {
		this.libros.add(pu);
	}
	
	public void insertar()throws SQLException{
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionPostgres();
		PreparedStatement s;
		String query="insert into autores"
				+ "(nombre, photoUrl) values "
				+ "(?,?)";
		try {
			s=(PreparedStatement) conexion.prepareStatement(query);
			s.setString(1, this.getNombre());
			s.setString(2, this.getFotoUrl());
			s.executeUpdate();
			System.out.println("Datos ingresados correctamente");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		conexion.close();
		System.out.println("Datos ingresados correctamente");
	}
	

	
	
	
	

}
