package bverse.clases.hijas;

import java.util.ArrayList;

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
		super("Biblioteca", descripccion,null);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void agregarLibro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void eliminarLibro() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void vaciarEstante() {
		// TODO Auto-generated method stub
		
	}

}
