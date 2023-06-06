package bverse.clases.hijas;

import bverse.categorizaciones.*;
import bverse.categorizaciones.Tipo;
import bverse.clases.madres.*;

public class Revista extends Publicacion{
	
	private String descripcion;
	private Autor editorial;
	private String genero;
	
	public Revista(String iSBM, String titulo, String precio, String portadaUrl, int estado,
			String calificacion, String resenia, String descripcion, Autor editorial, String genero) {
		super(iSBM, titulo, precio, portadaUrl, estado, Tipo.revista, calificacion, resenia);
		this.descripcion = descripcion;
		this.editorial = editorial;
		this.genero = genero;
	}
	public Revista(String titulo) {
		super("",titulo, "", "", Estado.limbo, Tipo.comic, "", "");
		this.descripcion = "";
		this.editorial = new Autor();
		this.genero = "";
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Autor getEditorial() {
		return editorial;
	}
	public void setEditorial(Autor editorial) {
		this.editorial = editorial;
	}
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	

	
	

}
