package bverse.clases.hijas;

import bverse.clases.madres.*;

import java.util.*;

public class Lector  extends Persona{
	private int presupuesto;
	private String contrasenia;
	private ArrayList <Estante> estantes;
	
	



	public Lector(String nombre, String fotoUrl, int presupuesto, String contrasenia) {
		super(nombre, fotoUrl);
		
		ArrayList <Estante> es = new ArrayList<>();
		Biblioteca b = new Biblioteca();
		WishList wl = new WishList();
		Favoritos fav = new Favoritos();
		es.add(b);
		es.add(wl);
		es.add(fav);
		
		this.presupuesto = presupuesto;
		this.contrasenia = contrasenia;
		this.estantes = es;
	}



	public Lector(String nombre, String fotoUrl) {
		super(nombre, fotoUrl);
		ArrayList <Estante> es = new ArrayList<>();
		Biblioteca b = new Biblioteca();
		WishList wl = new WishList();
		Favoritos fav = new Favoritos();
		es.add(b);
		es.add(wl);
		es.add(fav);
		this.estantes = es;
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



	public ArrayList<Estante> getEstantes() {
		return estantes;
	}



	public void setEstantes(ArrayList<Estante> estantes) {
		this.estantes = estantes;
	}
	
	

}
