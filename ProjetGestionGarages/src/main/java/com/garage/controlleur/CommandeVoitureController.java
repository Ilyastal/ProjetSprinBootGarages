package com.garage.controlleur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.garage.bean.CommandeVoiture;
import com.garage.bean.Devis;
import com.garage.bean.Utilisateur;
import com.garage.controlleur.form.CommandeVoitureForm;
import com.garage.dao.DaoCommandeVoiture;
import com.garage.iservice.IServiceCommandeVoiture;
import com.garage.iservice.IServiceDevis;
import com.garage.iservice.IServiceUtilisateur;

@Controller
public class CommandeVoitureController {
	
	@Autowired
	private IServiceCommandeVoiture serviceCommandeVoiture;
	
	@Autowired
	private IServiceUtilisateur serviceUser;
	
	@Autowired
	private IServiceDevis serviceDevis;
	
	@Autowired
	private DaoCommandeVoiture daoCommandeVoiture;
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		sdf.setTimeZone(TimeZone.getTimeZone("GMT"));
		binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}
	
	private CommandeVoiture convertForm(CommandeVoitureForm commandeForm) throws Exception {
		CommandeVoiture com = new CommandeVoiture();
		com.setId(commandeForm.getId());
		com.setDateCommande(commandeForm.getDateCommande());
		com.setDateReception(commandeForm.getDateReception());
		com.setDateCloture(commandeForm.getDateCloture());
		com.setQuantite(Integer.valueOf(commandeForm.getQuantite()));
		
		Utilisateur user = serviceUser.rechercherUtilisateurId(
				Integer.valueOf(commandeForm.getUtilisateur()));
		com.setUtilisateur(user);
		
		com.setVoiture(commandeForm.getVoiture());
		
		Devis devis = serviceDevis.rechercherDevisId(
				Integer.valueOf(commandeForm.getDevis()));
		com.setDevis(devis);
		
		return com;
	}
	
	@GetMapping("/CommandesVoiture")
	public String afficher(Model model) {
 		model.addAttribute("listCommandeVoiture", daoCommandeVoiture.findCommande()); //attribut du fichier html
 		model.addAttribute("action", "Liste");
 		
		return "listCommandeVoiture"; //correspond au fichier html
	}
	
	@GetMapping("/CommandesVoiture/Modifier/{id}")
	public String afficher(@PathVariable final Integer id, Model model) {
		model.addAttribute("listCommandeVoiture", daoCommandeVoiture.findCommande()); //attribut du fichier html
		
		model.addAttribute("action", "Modification");
		if(!model.containsAttribute("commandeModif")) {
			CommandeVoitureForm commandeForm = new CommandeVoitureForm();
			
			final CommandeVoiture com = serviceCommandeVoiture.rechercherCommandeVoitureId(id);
			commandeForm.setId(com.getId());
			
			commandeForm.setDateCommande(com.getDateCommande());
			commandeForm.setDateReception(com.getDateReception());
			commandeForm.setDateCloture(com.getDateCloture());
			
			commandeForm.setQuantite(com.getQuantite().toString());
			commandeForm.setUtilisateur(com.getUtilisateur().getId().toString());
			commandeForm.setVoiture(com.getVoiture());
			commandeForm.setDevis(com.getDevis().getId().toString());
			
			model.addAttribute("commandeModif", commandeForm);
		}
		
		return "listCommandeVoiture"; //correspond au fichier html
	}
	
	@PostMapping("/CommandesVoiture")
	public String modifCommandeVoiture(
			@Valid @ModelAttribute(name = "commandeModif") CommandeVoitureForm commandeForm,
			BindingResult commandeResult,
			Model model)
	{
		if(!commandeResult.hasErrors()) {
			try {
				CommandeVoiture com = convertForm(commandeForm);
				serviceCommandeVoiture.modifierCommandeVoiture(com);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	} 
}


