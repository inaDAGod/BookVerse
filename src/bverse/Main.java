package bverse;
import bverse.baseDatos.*;
import bverse.clases.hijas.*;

public class Main {

	public static void main(String[] args) {
		//System.out.println("hola");
		//Conexion c = new Conexion();
		//c.getConexionPostgres();
		Libro l = BookSearch.buscar("Harry Potter");
		System.out.println(l.toString()); 
		
	}

}
