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
	
        return voiture;
    }
	
	@GetMapping("/Voitures/Ajouter")
	public String afficher(Model model) {
		final List<Voiture> lvoit = servicevoiture.rechercheVoiture();
		model.addAttribute("listVoiture", lvoit); //attribut du fichier html
		model.addAttribute("action", "Ajout");
		if(model.containsAttribute("CreerVoiture") == false) {
			VoitureForm voitureForm = new VoitureForm();
			voitureForm.setId(0);
			model.addAttribute("CreerVoiture", voitureForm);
		}
		return "listVoiture"; //correspond au fichier html
	}
	
	
	@PostMapping("/Voitures/Ajouter")
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
		return this.afficher(model);
	}
	
	@GetMapping("/Voitures/Modifier/{id}")
	public String afficher(@PathVariable final Integer id, Model model) {
		model.addAttribute("listVoiture", servicevoiture.rechercheVoiture()); //attribut du fichier html
	
		
		model.addAttribute("action", "Modification");
		if(!model.containsAttribute("voitureModif")) {
			VoitureForm voitureForm = new VoitureForm();
			
	
			final Voiture uti = servicevoiture.rechercherVoitureId(id);
			voitureForm.setId(uti.getId());
			voitureForm.setAnnee(String.valueOf(uti.getAnnee()));
			voitureForm.setCategorie(uti.getCategorie());
			voitureForm.setCo2(String.valueOf(uti.getCo2()));
			voitureForm.setCouleur(uti.getCouleur());
			voitureForm.setEnergie(uti.getEnergie());
			voitureForm.setMarque(uti.getMarque());
			voitureForm.setModele(uti.getModele());
			voitureForm.setPorte(String.valueOf(uti.getPorte()));
			voitureForm.setPrixUnitaire(String.valueOf(uti.getPrixUnitaire()));
			voitureForm.setQuantite(String.valueOf(uti.getQuantite()));
			voitureForm.setPhoto(uti.getPhoto());
			
			
			
			model.addAttribute("voitureModif", voitureForm);
		}
		
		return "listVoiture"; //correspond au fichier html
	}
	
	@PostMapping("/Voitures/Modifier")
	public String modifVoiture(
			@Valid @ModelAttribute(name = "voitureModif") VoitureForm voitureForm,
			BindingResult voitureResult,
			Model model)
	{
		if(!voitureResult.hasErrors()) {
			try {
				Voiture uti = convertForm(voitureForm);
				servicevoiture.modifierVoiture(uti);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	}
	
	
	
	
}