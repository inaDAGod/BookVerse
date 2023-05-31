package bverse.clases.madres;

public abstract class Persona {
	
	private String nombre;
	private String fotoUrl;
	
	public Persona(String nombre, String fotoUrl) {
		super();
		this.nombre = nombre;
		this.fotoUrl = fotoUrl;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFotoUrl() {
		return fotoUrl;
	}

	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}

	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", fotoUrl=" + fotoUrl + "]";
	}
	
	public abstract void agregar();

}
