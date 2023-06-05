package bverse;
import bverse.baseDatos.*;

public class Main {

	public static void main(String[] args) {
		System.out.println("hola");
		Conexion c = new Conexion();
		c.getConexionPostgres();
		
	}

}
