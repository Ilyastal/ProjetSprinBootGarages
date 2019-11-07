package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Voiture;
import com.garage.iservice.IServiceVoiture;

/**
 * 
 */
@Controller
public class VoitureController {

	/**
	 * Default constructor
	 */
	public VoitureController() {
	}
	
	@Autowired
	private IServiceVoiture servicevoiture;
	
	@GetMapping("/afficherUser")
	public String Afficher(Model model) {
		final List<Voiture> lvoit = servicevoiture.rechercheVoiture();
		model.addAttribute("listVoiture", lvoit); //attribut du fichier html
		return "listVoiture"; //correspond au fichier html
	}

}