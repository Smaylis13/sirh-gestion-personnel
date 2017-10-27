package dev.sgp.util;

import java.util.ResourceBundle;

import dev.sgp.service.CollaborateurService;

public interface Constantes {

	CollaborateurService COLLAB_SERVICE = new CollaborateurService();
	ResourceBundle BUNDLE = ResourceBundle.getBundle("application");
}
