package dev.sgp.entite;

import java.time.LocalDate;
import java.time.ZonedDateTime;

public class Collaborateur {
	private String matricule;
	private String nom ;
	private String prenom ;
	private LocalDate dateDeNaissance ;
	private String adresse ;
	private String numeroDeSecuriteSociale;
	private String emailPro;
	private String photo ;
	private ZonedDateTime dateHeureCreation;
	private boolean actif;
	private String intitulePoste;
	private String banque;
	private String bic;
	private String iban;
	
	public String getIntitulePoste() {
		return intitulePoste;
	}
	public Departement getDepartement() {
		return departement;
	}
	public void setIntitulePoste(String intitulePoste) {
		this.intitulePoste = intitulePoste;
	}
	public void setDepartement(Departement departement) {
		this.departement = departement;
	}
	private Departement departement;
	
	
	
	public String getMatricule() {
		return matricule;
	}
	public String getNom() {
		return nom;
	}
	@Override
	public String toString() {
		return "Collaborateur [matricule=" + matricule + ", nom=" + nom + ", prenom=" + prenom + ", dateDeNaissance="
				+ dateDeNaissance + ", adresse=" + adresse + ", numeroDeSecuriteSociale=" + numeroDeSecuriteSociale
				+ ", emailPro=" + emailPro + ", photo=" + photo + ", dateHeureCreation=" + dateHeureCreation
				+ ", actif=" + actif + "]";
	}
	public String getPrenom() {
		return prenom;
	}
	public LocalDate getDateDeNaissance() {
		return dateDeNaissance;
	}
	public String getAdresse() {
		return adresse;
	}
	public String getNumeroDeSecuriteSociale() {
		return numeroDeSecuriteSociale;
	}
	public String getEmailPro() {
		return emailPro;
	}
	public String getPhoto() {
		return photo;
	}
	public ZonedDateTime getDateHeureCreation() {
		return dateHeureCreation;
	}
	public boolean isActif() {
		return actif;
	}
	public Collaborateur setMatricule(String matricule) {
		this.matricule = matricule;
		return this;
	}
	public Collaborateur setNom(String nom) {
		this.nom = nom;
		return this;
	}
	public Collaborateur setPrenom(String prenom) {
		this.prenom = prenom;
		return this;
	}
	public Collaborateur setDateDeNaissance(LocalDate dateDeNaissance) {
		this.dateDeNaissance = dateDeNaissance;
		return this;
	}
	public Collaborateur setAdresse(String adresse) {
		this.adresse = adresse;
		return this;
	}
	public Collaborateur setNumeroDeSecuriteSociale(String numeroDeSecuriteSociale) {
		this.numeroDeSecuriteSociale = numeroDeSecuriteSociale;
		return this;
	}
	public Collaborateur setEmailPro(String emailPro) {
		this.emailPro = emailPro;
		return this;
	}
	public Collaborateur setPhoto(String photo) {
		this.photo = photo;
		return this;
	}
	public Collaborateur setDateHeureCreation(ZonedDateTime dateHeureCreation) {
		this.dateHeureCreation = dateHeureCreation;
		return this;
	}
	public Collaborateur setActif(boolean actif) {
		this.actif = actif;
		return this;
	}
	
	
}
