package com.garage.controlleur;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.garage.bean.Voiture;
import com.garage.controlleur.form.VoitureForm;
import com.garage.iservice.IServiceVoiture;

@Controller
public class VoitureController {

	@Autowired
	private IServiceVoiture servicevoiture;
	
	private Voiture convertForm(VoitureForm voitureForm) throws Exception {
		Voiture voiture = new Voiture();
		voiture.setId(voitureForm.getId());
		voiture.setAnnee(Integer.valueOf(voitureForm.getAnnee()));
		voiture.setCategorie(voitureForm.getCategorie());
		voiture.setModele(voitureForm.getModele());
		voiture.setCo2(Integer.valueOf(voitureForm.getCo2()));
		voiture.setCouleur(voitureForm.getCouleur());
		voiture.setEnergie(voitureForm.getEnergie());
		voiture.setMarque(voitureForm.getMarque());
		voiture.setPorte(Integer.valueOf(voitureForm.getPorte()));
		voiture.setPrixUnitaire(Double.valueOf(voitureForm.getPrixUnitaire()));
		voiture.setQuantite(Integer.valueOf(voitureForm.getQuantite()));
		voiture.setPhoto(voitureForm.getPhoto());
        return voiture;
    }
	
	@GetMapping("/Voitures")
	public String afficherCreer(Model model) {
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
	
	@PostMapping("/supprimerVoiture/{id}")
	public String Supprimer(@PathVariable final Integer id,Model model) {
		Voiture voit = servicevoiture.rechercherVoitureId(id);
		if(voit  != null) {
			servicevoiture.supprimerVoiture(voit);;
		}
		return this.afficherCreer(model);
	}
	
	@PostMapping("/Voitures")
	public String ajoutVoiture( 
			@Valid @ModelAttribute(name = "voitureForm") VoitureForm voitureForm,
			BindingResult presult,
			Model model)
	{
		if(!presult.hasErrors()) {
			try
			{
				Voiture voit = convertForm(voitureForm);
				servicevoiture.creerVoiture(voit);
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return this.afficherCreer(model);
	}
}