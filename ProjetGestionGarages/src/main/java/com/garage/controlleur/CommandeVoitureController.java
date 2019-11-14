package com.garage.controlleur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

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
import com.garage.bean.Voiture;
import com.garage.controlleur.form.CommandeVoitureForm;
import com.garage.dao.DaoCommandeVoiture;
import com.garage.service.ServiceCommandeVoiture;
import com.garage.service.ServiceDevis;
import com.garage.service.ServiceUtilisateur;
import com.garage.service.ServiceVoiture;


/**
*
*/
@Controller
public class CommandeVoitureController {
@Autowired
private ServiceCommandeVoiture serviceCommandeVoiture;
@Autowired
private ServiceUtilisateur serviceUser;
@Autowired
private ServiceVoiture serviceVoiture;
@Autowired
private ServiceDevis serviceDevis;
    /**
     * Default constructor
     */
    public CommandeVoitureController() {
    }
    
   
    
    @Autowired
    private DaoCommandeVoiture daoCommandeVoiture;
    
    @InitBinder
    public void initBinder(WebDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        sdf.setLenient(true);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }
    private CommandeVoiture convertForm(CommandeVoitureForm commandeform) throws Exception {
    	CommandeVoiture commande = new CommandeVoiture();
    	commande.setId(commandeform.getId());
    	SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");   
    	Date dateCommande = sdf.parse(commandeform.getDateCommande());
       commande.setDateCommande(dateCommande);
        Date dateReception = sdf.parse(commandeform.getDateReception());
        commande.setDateReception(dateReception);
        Date dateCloture = sdf.parse(commandeform.getDateCloture());
        commande.setDateCloture(dateCloture);
        commande.setQuantite(Integer.valueOf(commandeform.getQuantite()));
        
        
        Utilisateur user = serviceUser.rechercherUtilisateurId(
				Integer.valueOf(commandeform.getUtilisateur()));
        commande.setUtilisateur(user);
        
        Voiture voiture = serviceVoiture.rechercherVoitureId(
				Integer.valueOf(commandeform.getVoiture()));
        commande.setVoiture(voiture);
        
        Devis  devis  = serviceDevis.rechercherDevisId(
				Integer.valueOf(commandeform.getDevis()));
        commande.setDevis(devis);
        return commande;
    }

    ///
    //@PathVariable final Integer id,
    
    @GetMapping("/afficherCommandeVoiture")
	public String afficher(Model model) {
    	 List<CommandeVoiture> list =daoCommandeVoiture.findCommande();
    		
   	  
 		model.addAttribute("listCommandeVoiture", list); //attribut du fichier html
 		
		
		return "listCommandeVoiture"; //correspond au fichier html
	}
    
    
    
    
    
  @GetMapping("/afficherCommandeVoiture/Modifier/{id}")
	public String afficher(@PathVariable final Integer id,Model model) {
	  List<CommandeVoiture> list =daoCommandeVoiture.findCommande();
		
   	  
	model.addAttribute("listCommandeVoiture", list); //attribut du fichier html
		
		
	model.addAttribute("action", "Modification");
		if(!model.containsAttribute("CommandeModif")) {
			CommandeVoitureForm commandeform = new CommandeVoitureForm();
		
			
			final CommandeVoiture uti = serviceCommandeVoiture.rechercherCommandeVoitureId(id);
			commandeform.setId(uti.getId());
			
			
			commandeform.setDateCommande(new 
					SimpleDateFormat("dd-MM-yyyy").format(
							uti.getDateCommande()));
			
			commandeform.setDateCloture(new 
					SimpleDateFormat("dd-MM-yyyy").format(
							uti.getDateCloture())); 
			commandeform.setQuantite(String.valueOf(uti.getQuantite()));
			
			commandeform.setUtilisateur(String.valueOf(uti.getUtilisateur().getId()));
			commandeform.setVoiture(String.valueOf(uti.getVoiture().getId()));
			commandeform.setDevis(String.valueOf(uti.getDevis().getId()));
			
			model.addAttribute("action", "Modification");
			model.addAttribute("CommandeModif", commandeform);
		}
		
		return "listCommandeVoiture"; //correspond au fichier html
	}
   @PostMapping("/CommandeVoiture/Modifier")
	public String modifCommandeVoiture(
			@Valid @ModelAttribute(name = "CommandeModif") CommandeVoitureForm commandeform,
			BindingResult userResult,
			Model model)
	{
		if(!userResult.hasErrors()) {
			try {
				CommandeVoiture uti = convertForm(commandeform);
				serviceCommandeVoiture.modifierCommandeVoiture(uti);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	} 
}


