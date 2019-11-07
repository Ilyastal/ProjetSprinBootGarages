package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Fiche;
import com.garage.iservice.IServiceFiche;

/**
 * 
 */
@Controller
public class FicheController {

	/**
	 * Default constructor
	 */
	public FicheController() {
	}
	
	@Autowired
	private IServiceFiche servicefiche;
	
	@GetMapping("/afficherFiche")
	public String Afficher(Model model) {
		final List<Fiche> lfiche = servicefiche.rechercheFiche();
		model.addAttribute("listFiche", lfiche); //attribut du fichier html
		return "listFiche"; //correspond au fichier html
	}

}