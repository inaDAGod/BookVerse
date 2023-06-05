package bverse.clases.hijas;

import bverse.categorizaciones.*;
import bverse.clases.madres.*;

public class Libro extends Publicacion{
	private String calpromedio;
	private String descripcion;
	private Autor autor;
	private int paginas;
	private int genero;
	
	public Libro(String iSBM, String titulo, String precio, String portadaUrl, int estado, String calificacion,
			String resenia, String calpromedio, String descripcion, Autor autor, int paginas, int genero) {
		super(iSBM,titulo, precio, portadaUrl, estado, Tipo.libro, calificacion, resenia);
		this.calpromedio = calpromedio;
		this.descripcion = descripcion;
		this.autor = autor;
		this.paginas = paginas;
		this.genero = genero;
	}
	
	public Libro(String titulo) {
		super("",titulo, "", "", Estado.limbo, Tipo.libro, "", "");
		this.calpromedio = "";
		this.descripcion = "";
		this.autor = new Autor();
		this.paginas = 0;
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
	public int getPaginas() {
		return paginas;
	}
	public void setPaginas(int paginas) {
		this.paginas = paginas;
	}
	public int getGenero() {
		return genero;
	}
	public void setGenero(int genero) {
		this.genero = genero;
	}

	

}
