package dev.sgp.entite;

public class Departement {
	private int id;
	private String nom;
	
	public Departement(String pNom) {
		nom = pNom;
	}
	
	public String getNom() {
		return nom;
	}
	public Departement setNom(String nom) {
		this.nom = nom;
		return this;
	}
}
