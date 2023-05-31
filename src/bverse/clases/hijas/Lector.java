package bverse.clases.hijas;

import bverse.clases.madres.*;

public class Lector  extends Persona{
	private int presupuesto;
	private String contrasenia;
	
	public Lector(String nombre, String fotoUrl, int presupuesto, String contrasenia) {
		super(nombre, fotoUrl);
		this.presupuesto = presupuesto;
		this.contrasenia = contrasenia;
		
	}
	
	

	public Lector(String nombre, String fotoUrl) {
		super(nombre, fotoUrl);
		// TODO Auto-generated constructor stub
	}



	public int getPresupuesto() {
		return presupuesto;
	}

	public void setPresupuesto(int presupuesto) {
		this.presupuesto = presupuesto;
	}

	public String getContrasenia() {
		return contrasenia;
	}

	public void setContrasenia(String contrasenia) {
		this.contrasenia = contrasenia;
	}
	
	


	@Override
	public void agregar() {
		// TODO Auto-generated method stub
		
	}

}
