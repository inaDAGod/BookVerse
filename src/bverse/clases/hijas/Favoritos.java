package bverse.clases.hijas;

import java.util.*;

import bverse.clases.madres.*;

public class Favoritos extends Estante{

	public Favoritos(String descripccion, ArrayList<Publicacion> publicaciones) {
		super("Favoritos", descripccion, publicaciones);
		// TODO Auto-generated constructor stub
	}
	public Favoritos( ArrayList<Publicacion> publicaciones) {
		super("Favoritos", "", publicaciones);
		// TODO Auto-generated constructor stub
	}
	public Favoritos(String descripccion) {
		super("Favoritos", descripccion, null);
		// TODO Auto-generated constructor stub
	}
	public Favoritos() {
		super("Favoritos", "", null);
		// TODO Auto-generated constructor stub
	}

	
	


}
