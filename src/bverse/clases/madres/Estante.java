package bverse.clases.madres;

import java.util.*;

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
	
	public abstract void agregarLibro();
	public abstract void eliminarLibro();
	public abstract void vaciarEstante();
	
}
