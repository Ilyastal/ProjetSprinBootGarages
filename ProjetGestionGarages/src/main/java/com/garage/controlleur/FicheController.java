package com.garage.controlleur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Fiche;
import com.garage.controlleur.form.FicheForm;
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
	
	private Fiche convertForm(FicheForm ficheForm) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(ficheForm.getDateCreation());
        Fiche fiche = new Fiche();
        fiche.setId(ficheForm.getId());
        fiche.setDescription(ficheForm.getDescription());
        fiche.setDateCreation(date);
        fiche.setClient(ficheForm.getClient());
        fiche.setUtilisateur(ficheForm.getUtilisateur());
       return fiche;
   }
    
    @GetMapping("/Fiches")
    public String Afficher(Model model) {
        final List<Fiche> lfiche = servicefiche.rechercheFiche();
        model.addAttribute("listFiche", lfiche);
        model.addAttribute("action", "CreerFiche");
        if(model.containsAttribute("ficheForm") == false) {
            FicheForm ficheForm = new FicheForm();
            ficheForm.setId(0);
            model.addAttribute("ficheForm", ficheForm);
        }
        return "listFiche";
    }
}