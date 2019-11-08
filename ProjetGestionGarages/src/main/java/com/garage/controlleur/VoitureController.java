package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.garage.bean.Piece;
import com.garage.bean.Voiture;
import com.garage.controlleur.form.PieceForm;
import com.garage.controlleur.form.VoitureForm;
import com.garage.iservice.IServiceVoiture;

@Controller
public class VoitureController {

	@Autowired
	private IServiceVoiture servicevoiture;
	
	private Voiture convertForm(VoitureForm voitureForm) throws Exception {
		Voiture voiture = new Voiture();
		voiture.setId(voitureForm.getId());
		voiture.setAnnee(voitureForm.getAnnee());
		voiture.setCategorie(voitureForm.getCategorie());
		voiture.setModele(voitureForm.getModele());
		voiture.setCo2(voitureForm.getCo2());
		voiture.setCouleur(voitureForm.getCouleur());
		voiture.setEnergie(voitureForm.getEnergie());
		voiture.setMarque(voitureForm.getMarque());
		voiture.setPorte(voitureForm.getPorte());
		voiture.setPrixUnitaire(voitureForm.getPrixUnitaire());
		voiture.setQuantite(voitureForm.getQuantite());
		voiture.setPhoto(voitureForm.getPhoto());
        return voiture;
    }
	
	@GetMapping("/Voitures")
	public String Afficher(Model model) {
		final List<Voiture> lvoit = servicevoiture.rechercheVoiture();
		model.addAttribute("listVoiture", lvoit); //attribut du fichier html
		model.addAttribute("action", "CreerVoiture");
		if(model.containsAttribute("voitureForm") == false) {
			VoitureForm voitureForm = new VoitureForm();
			voitureForm.setId(0);
			model.addAttribute("voitureForm", voitureForm);
		}
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