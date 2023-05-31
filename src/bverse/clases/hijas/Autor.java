package bverse.clases.hijas;

import java.util.*;

import bverse.clases.madres.*;

public class Autor extends Persona{
	private ArrayList <Publicacion> libros;

	public Autor(String nombre, String fotoUrl, ArrayList<Publicacion> libros) {
		super(nombre, fotoUrl);
		this.libros = libros;
		
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

	@Override
	public void agregar() {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
