package bverse.clases.hijas;

import java.util.*;

import bverse.clases.madres.*;

public class Favoritos extends Estante{
	
	private ArrayList <String> frases; //frases favoritas de cada libro
	
	

	public Favoritos(String nombre, String descripccion, ArrayList<Publicacion> publicaciones,
			ArrayList<String> frases) {
		super(nombre, descripccion, publicaciones);
		this.frases = frases;
	}
	public Favoritos(String descripccion, ArrayList<Publicacion> publicaciones,ArrayList<String> frases) {
		super("Favoritos", descripccion, publicaciones);
		this.frases = frases;
		// TODO Auto-generated constructor stub
	}
	public Favoritos( ArrayList<Publicacion> publicaciones,ArrayList<String> frases) {
		super("Favoritos", "", publicaciones);
		this.frases = frases;

		// TODO Auto-generated constructor stub
	}
	public Favoritos(String descripccion) {
		super("Favoritos", descripccion, new ArrayList<>());
		this.frases=new ArrayList<>();// TODO Auto-generated constructor stub
	}
	public Favoritos() {
		super("Favoritos", "", new ArrayList<>());
		this.frases=new ArrayList<>();
		// TODO Auto-generated constructor stub
	}
	public ArrayList<String> getFrases() {
		return frases;
	}
	public void setFrases(ArrayList<String> frases) {
		this.frases = frases;
	}

	
	


}
