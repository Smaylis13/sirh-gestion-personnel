package dev.sgp.web;

import java.io.IOException;
import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.text.Utilities;

import dev.sgp.entite.Collaborateur;
import dev.sgp.service.CollaborateurService;
import dev.sgp.util.Constantes;

public class ListerCollaborateursController  extends HttpServlet{
	
	private CollaborateurService collabService = Constantes.COLLAB_SERVICE;
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		List<Collaborateur> collaborateurs = collabService.listerCollaborateurs();
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
		.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		String adresse = req.getParameter("commune");
		String numeroDeSecuriteSociale = req.getParameter("num2secu");
		String emailPro = prenom+"."+nom+"@societe.com";
		String photo = "";
		ZonedDateTime dateHeureCreation = ZonedDateTime.now();
		LocalDate date2naissance =  LocalDate.parse(req.getParameter("date2naissance"));
		
		// ajouter un collab
		Collaborateur newCollaborateur = new Collaborateur().setActif(true).setNom(nom).setPrenom(prenom).setAdresse(adresse)
				.setNumeroDeSecuriteSociale(numeroDeSecuriteSociale).setEmailPro(emailPro).setPhoto(photo).setDateHeureCreation(dateHeureCreation)
				.setDateDeNaissance(date2naissance)
				.setMatricule("COL"+Constantes.COLLAB_SERVICE.getSize());
		Constantes.COLLAB_SERVICE.sauvegarderCollaborateur(newCollaborateur);
		
		System.out.println(newCollaborateur);
		
		req.getRequestDispatcher("/WEB-INF/views/collab/listerCollaborateurs.jsp")
			.forward(req, resp);
	}
	

}
