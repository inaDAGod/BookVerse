package bverse.clases.hijas;

import bverse.categorizaciones.*;
import bverse.clases.madres.*;

public class NovelaGrafica extends Publicacion{

	private String calpromedio;
	private String descripcion;
	private Autor autor;
	private Autor ilustrador;
	private int genero;
	
	public NovelaGrafica(String iSBM,String titulo, String precio, String portadaUrl, int estado, String calificacion,
			String resenia, String calpromedio, String descripcion, Autor autor, Autor ilustrador,
			int genero) {
		super(iSBM, titulo, precio, portadaUrl, estado, Tipo.novela_grafica, calificacion, resenia);
		this.calpromedio = calpromedio;
		this.descripcion = descripcion;
		this.autor = autor;
		this.ilustrador = ilustrador;
		this.genero = genero;
	}
	
	public NovelaGrafica(String titulo) {
		super("",titulo, "", "", Estado.limbo, Tipo.novela_grafica, "", "");
		this.calpromedio = "";
		this.descripcion = "";
		this.autor = new Autor();
		this.ilustrador = new Autor();
		this.genero = Genero.desconocido;
	}
	


	public String getCalpromedio() {
		return calpromedio;
	}
	public void setCalpromedio(String calpromedio) {
		this.calpromedio = calpromedio;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Autor getAutor() {
		return autor;
	}
	public void setAutor(Autor autor) {
		this.autor = autor;
	}
	public Autor getIlustrador() {
		return ilustrador;
	}
	public void setIlustrador(Autor ilustrador) {
		this.ilustrador = ilustrador;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}
	
	
	
	

}
