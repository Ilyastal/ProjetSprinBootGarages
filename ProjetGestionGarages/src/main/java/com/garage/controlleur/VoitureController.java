package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.garage.bean.Voiture;
import com.garage.iservice.IServiceVoiture;

@Controller
public class VoitureController {

	@Autowired
	private IServiceVoiture servicevoiture;
	
	@GetMapping("/afficherVoiture")
	public String Afficher(Model model) {
		final List<Voiture> lvoit = servicevoiture.rechercheVoiture();
		model.addAttribute("listVoiture", lvoit); //attribut du fichier html
		return "listVoiture"; //correspond au fichier html
	}
	
	@GetMapping("/supprimerVoiture/{id}")
	public String Supprimer(@PathVariable final Integer id,Model model) {
		Voiture voit = servicevoiture.rechercherVoitureId(id);
		if(voit  != null) {
			servicevoiture.supprimerVoiture(voit);;
		}
		return this.Afficher(model);
	}
}