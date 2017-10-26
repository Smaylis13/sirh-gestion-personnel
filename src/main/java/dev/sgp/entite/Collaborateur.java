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
}
