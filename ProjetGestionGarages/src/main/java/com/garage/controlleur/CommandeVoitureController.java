package com.garage.controlleur;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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
    
    
    private CommandeVoiture convertForm(CommandeVoitureForm commandeform) throws Exception {
    	CommandeVoiture commande = new CommandeVoiture();
    	commande.setId(commandeform.getId());
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
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

    ///Modifier/{id}
    //@PathVariable final Integer id,
  @GetMapping("/afficherCommandeVoiture")
	public String afficher(Model model) {
	  List<CommandeVoiture> list =daoCommandeVoiture.findCommande();
	List<String> AttVoiture = new ArrayList<String>();
	  for(CommandeVoiture cVoiture : list) {
		 String mqVoiture= cVoiture.getVoiture().getMarque();
		String modeleVoiture=cVoiture.getVoiture().getModele();
		String modMq=mqVoiture +" "+ modeleVoiture;
		AttVoiture.add(modMq);
	  }
	  
		model.addAttribute("listCommandeVoiture", list); //attribut du fichier html
		model.addAttribute("listVoiture", AttVoiture);
	/**	model.addAttribute("action", "Modification");
		if(!model.containsAttribute("CommandeModif")) {
			CommandeVoitureForm commandeform = new CommandeVoitureForm();
		
			
			final CommandeVoiture uti = serviceCommandeVoiture.rechercherCommandeVoitureId(id);
			commandeform.setId(uti.getId());
			
			
			commandeform.setDateCommande(new 
					SimpleDateFormat("yyyy-MM-dd").format(
							uti.getDateCommande()));
			commandeform.setDateReception(new 
					SimpleDateFormat("yyyy-MM-dd").format(
							uti.getDateReception()));
			
			commandeform.setDateCloture(new 
					SimpleDateFormat("yyyy-MM-dd").format(
							uti.getDateCloture()));
			commandeform.setQuantite(String.valueOf(uti.getQuantite()));
			
			commandeform.setUtilisateur(String.valueOf(uti.getUtilisateur().getId()));
			commandeform.setVoiture(String.valueOf(uti.getVoiture().getId()));
			commandeform.setPassword(uti.getPassword());
			commandeform.setDesactiveUser(uti.getDesactiveUser());
			userForm.setDesactiveAngular(uti.getDesactiveAngular());
			userForm.setRoles(uti.getRoles());
			
			model.addAttribute("action", "Modification");
			model.addAttribute("userModif", userForm);
		}**/
		
		return "listCommandeVoiture"; //correspond au fichier html
	}
  /**  @PostMapping("/Utilisateurs/Modifier")
	public String modifUtilisateur(
			@Valid @ModelAttribute(name = "CommandeModif") UtilisateurForm userForm,
			BindingResult userResult,
			Model model)
	{
		if(!userResult.hasErrors()) {
			try {
				Utilisateur uti = convertForm(userForm);
				serviceutilisateur.modifierUtilisateur(uti);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	} **/
}


