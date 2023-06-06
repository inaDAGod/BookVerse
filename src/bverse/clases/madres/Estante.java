package bverse.clases.madres;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;

import javax.swing.JOptionPane;

import bverse.baseDatos.Conexion;
import bverse.categorizaciones.Tipo;

public abstract class Estante {
	private String nombre;
	private String descripccion;
	private ArrayList <Publicacion> publicaciones;
	
	public Estante(String nombre, String descripccion, ArrayList<Publicacion> publicaciones) {
		super();
		this.nombre = nombre;
		this.descripccion = descripccion;
		this.publicaciones = publicaciones;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripccion() {
		return descripccion;
	}
	public void setDescripccion(String descripccion) {
		this.descripccion = descripccion;
	}
	public ArrayList<Publicacion> getPublicaciones() {
		return publicaciones;
	}
	public void setPublicaciones(ArrayList<Publicacion> publicaciones) {
		this.publicaciones = publicaciones;
	}
	
	//public abstract void agregarLibro();
	//public abstract void eliminarLibro();
	//public abstract void vaciarEstanteria();
	
	
	public void agregarLibro(Publicacion publi) {
		this.publicaciones.add(publi);
	}
	
	public void eliminarLibro(String titulo) {
		ArrayList <Publicacion> pub = new ArrayList<Publicacion>();
		for(Publicacion p : this.publicaciones) {
			if(p.getTitulo() != titulo) {
				pub.add(p);
			}
			
		}
		this.publicaciones = pub;
	}
	
	public void vaciarEstante() {
		ArrayList <Publicacion> pub = new ArrayList<Publicacion>();
		this.publicaciones = pub;
	}
	
	public static void cambiarEstante(int estante, String isbm) throws SQLException {
	    Conexion con = new Conexion();
	    Connection conexion = con.getConexionPostgres();

	    // Eliminar registros relacionados en la tabla "estanteria_publicacion"
	    String deleteEstanteriaQuery = "DELETE FROM estanteria_publicacion WHERE isbm = ?";
	    try (PreparedStatement deleteEstanteriaStmt = conexion.prepareStatement(deleteEstanteriaQuery)) {
	        deleteEstanteriaStmt.setString(1, isbm);
	        deleteEstanteriaStmt.executeUpdate();
	    }catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}

	    //se añade a la estanteria nueva con su estanterai
	   
	    PreparedStatement s;
		String query="insert into estanteria_publicacion values (?,?)";
		try {
			s=(PreparedStatement) conexion.prepareStatement(query);
			s.setInt(1, estante);
			s.setString(2, isbm);
			s.executeUpdate();
			System.out.println("Datos ingresados correctamente");
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
			
		}

	    conexion.close();
	   
	}
	
	
	
}
