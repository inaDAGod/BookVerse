package bverse.clases.hijas;

import bverse.categorizaciones.Estado;
import bverse.categorizaciones.Genero;
import bverse.categorizaciones.Tipo;
import bverse.clases.madres.Publicacion;

public class Comic extends Publicacion{
	
	
	private String calpromedio;
	private String descripcion;
	private Autor editorial;
	private Autor escritor;
	private Autor ilustrador;
	private int genero;
	public Comic(String iSBM,String titulo, String precio, String portadaUrl, int estado, String calificacion,
			String resenia,  String calpromedio, String descripcion, Autor editorial, Autor escritor,
			Autor ilustrador, int genero) {
		super(iSBM, titulo, precio, portadaUrl, estado, Tipo.comic, calificacion, resenia);

		this.calpromedio = calpromedio;
		this.descripcion = descripcion;
		this.editorial = editorial;
		this.escritor = escritor;
		this.ilustrador = ilustrador;
		this.genero = genero;
	}
	
	public Comic(String titulo) {
		super("",titulo, "", "", Estado.limbo, Tipo.comic, "", "");
		this.calpromedio = "";
		this.descripcion = "";
		this.editorial = new Autor();
		this.escritor = new Autor();
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
	public Autor getEditorial() {
		return editorial;
	}
	public void setEditorial(Autor editorial) {
		this.editorial = editorial;
	}
	public Autor getEscritor() {
		return escritor;
	}
	public void setEscritor(Autor escritor) {
		this.escritor = escritor;
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
