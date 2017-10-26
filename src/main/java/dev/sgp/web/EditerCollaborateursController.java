package dev.sgp.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class EditerCollaborateursController extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String matricule = req.getParameter("matricule"); 
		String titre = req.getParameter("titre");
		String nom = req.getParameter("nom");
		String prenom = req.getParameter("prenom");
		if(matricule == null ){
			resp.sendError(400,"Un matricule est attendu");
		}else if(titre == null || nom == null || prenom == null){
			String str = "";
			str += (titre == null) ? "tire" : "";
			str += (nom == null) ? ", nom" : "";
			str += (prenom == null) ? ", prenom" : "";
			resp.sendError(400,"Les paramètres suivants sont incorrects :"+str);
		}
		
		resp.setContentType("text/html"); 
		 resp.setStatus(201);
		// code HTML ecrit dans le corps de la reponse 
		resp.getWriter().write("<h1>Creation d’un collaborateur avec les informations suivantes</h1> <h2>Matricule : "+ matricule + "</h2>"
		+ "<ul>" 
		+ "<li>Matricule, "+ matricule+ "</li>"
		+ "<li>Titre, "+ titre+ "</li>"
		+ "<li>Nom, "+ nom+ "</li>"
		+ "<li>Prénom, "
		+ prenom + "</li>" + "</ul>"); 
	}
}
