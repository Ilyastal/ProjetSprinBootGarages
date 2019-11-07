package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.CommandeVoiture;
import com.garage.iservice.IServiceCommandeVoiture;

/**
 * 
 */
@Controller
public class CommandeVoitureController {

	/**
	 * Default constructor
	 */
	public CommandeVoitureController() {
	}
	
	@Autowired
	private IServiceCommandeVoiture serviceutilisateur;
	
	@GetMapping("/afficherCommandeVoiture")
	public String Afficher(Model model) {
		final List<CommandeVoiture> lcomvoit = serviceutilisateur.rechercheCommandeVoiture();
		model.addAttribute("listCommandeVoiture", lcomvoit); //attribut du fichier html
		return "listCommandeVoiture"; //correspond au fichier html
	}

}