package bverse;
import java.sql.SQLException;

import bverse.baseDatos.*;
import bverse.clases.hijas.*;
import bverse.ventanas.Inicio;

public class Main {

	public static void main(String[] args) {
		//System.out.println("hola");
		//Conexion c = new Conexion();
		//c.getConexionPostgres();
		//para probar la busqueda
		/*
		Libro l = BookSearch.buscar("Harry Potter");
		System.out.println(l.toString());
		try {
			l.insertar();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		Inicio i = new Inicio ();
		i.setVisible(true);
		
	}

}
