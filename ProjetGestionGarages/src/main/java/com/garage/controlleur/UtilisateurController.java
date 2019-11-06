package com.garage.controlleur;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Utilisateur;
import com.garage.controlleur.form.UtilisateurForm;
import com.garage.iservice.IServiceUtilisateur;

/**
 * 
 */
@Controller
public class UtilisateurController {

	/**
	 * Default constructor
	 */
	public UtilisateurController() {
	}
	
	@Autowired
	private IServiceUtilisateur serviceutilisateur;
	
	@GetMapping("/afficherUser")
	public String Afficher(Model model) {
		final List<Utilisateur> luti = serviceutilisateur.rechercheUtilisateur();
		model.addAttribute("listeUser", luti); //attribut du fichier html
		return "listeUser"; //correspond au fichier html
	}
	
	@GetMapping("/creerUser")
	public String creerUtilisateur(Model model) {
		final List<Utilisateur> luti = serviceutilisateur.rechercheUtilisateur();
		model.addAttribute("listeUser", luti); //attribut du fichier html
		model.addAttribute("action", "CreerUser");
		if(model.containsAttribute("userForm") == false) {
			UtilisateurForm userForm = new UtilisateurForm();
			userForm.setId(0);
			model.addAttribute("userForm", userForm);
		}
		return "listeUser"; //correspond au fichier html
	}

}
