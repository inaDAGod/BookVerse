package bverse.clases.hijas;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import bverse.baseDatos.Conexion;
import bverse.clases.madres.*;

public class Biblioteca extends Estante{
	
	public Biblioteca( ArrayList<Publicacion> publicaciones) {
		super("Biblioteca", "", publicaciones);
		// TODO Auto-generated constructor stub
	}
	public Biblioteca(String descripccion, ArrayList<Publicacion> publicaciones) {
		super("Biblioteca", descripccion, publicaciones);
		// TODO Auto-generated constructor stub
	}
	public Biblioteca(String descripccion) {
		super("Biblioteca", descripccion,new ArrayList<>());
		// TODO Auto-generated constructor stub
	}
	public Biblioteca() {
		super("Biblioteca", "",new ArrayList<>());
		// TODO Auto-generated constructor stub
	}
	
	public static void insertarLibro(String ISBM)throws SQLException{
		Conexion con=new Conexion();
		Connection conexion = (Connection) con.getConexionPostgres();
		PreparedStatement s;
		String query="insert into estanteria_publicacion"
				+ "(idEstanteria, isbm) values "
				+ "(?,?)";
		try {
			s=(PreparedStatement) conexion.prepareStatement(query);
			s.setInt(1, 0);
			s.setString(2, ISBM);
			s.executeUpdate();
			System.out.println("Datos ingresados correctamente");
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
		conexion.close();
		System.out.println("Datos ingresados correctamente");
	}
	
	
	

	
	

}
