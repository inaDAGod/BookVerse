package bverse.clases.madres;

import bverse.clases.hijas.*;

public class Publicacion {
	private String ISBM;
	private String titulo;
	private String precio;
	private String portadaUrl;
	private int estado;
	private int tipo;
	private String calificacion;
	private String resenia;
	
	public Publicacion(String iSBM, String titulo, String precio, String portadaUrl, int estado, int tipo, String calificacion,String resenia) {
		super();
		ISBM = iSBM;
		this.titulo = titulo;
		this.precio = precio;
		this.portadaUrl = portadaUrl;
		this.estado = estado;
		this.tipo = tipo;
		this.calificacion = calificacion;
		this.resenia = resenia;
	}
	

	public String getISBM() {
		return ISBM;
	}

	public void setISBM(String iSBM) {
		ISBM = iSBM;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getPortadaUrl() {
		return portadaUrl;
	}

	public void setPortadaUrl(String portadaUrl) {
		this.portadaUrl = portadaUrl;
	}

	


	public int getEstado() {
		return estado;
	}

	public void setEstado(int estado) {
		this.estado = estado;
	}

	

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
	}

	public String getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(String calificacion) {
		this.calificacion = calificacion;
	}

	public String getResenia() {
		return resenia;
	}

	public void setResenia(String resenia) {
		this.resenia = resenia;
	}
	
	
	
	
	
	
}
