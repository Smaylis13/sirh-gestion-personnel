package dev.sgp.service;

import java.util.ArrayList;
import java.util.List;

import dev.sgp.entite.Departement;

public class DepartementService {
	public static List<Departement> listeDepartements = new ArrayList<>();

	static {
		listeDepartements.add(new Departement("listeDepartements"));
		listeDepartements.add(new Departement("Comptabilite"));
		listeDepartements.add(new Departement("Ressources Humaines"));
		listeDepartements.add(new Departement("Informatique"));
		listeDepartements.add(new Departement("Administratif"));
	}
}
