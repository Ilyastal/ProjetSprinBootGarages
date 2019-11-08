package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Devis;
import com.garage.controlleur.form.DevisForm;
import com.garage.iservice.IServiceDevis;

/**
 * 
 */
@Controller
public class DevisController {

	/**
	 * Default constructor
	 */
	public DevisController() {
	}
	
	@Autowired
	private IServiceDevis servicedevis;
	
	@GetMapping("/afficherDevis")
	public String Afficher(Model model) {
		final List<Devis> ldevis = servicedevis.rechercheDevis();
		model.addAttribute("listDevis", ldevis); //attribut du fichier html
		model.addAttribute("action", "CreerDevis");
        if(model.containsAttribute("devisForm") == false) {
            DevisForm devisForm = new DevisForm();
            devisForm.setId(0);
            model.addAttribute("devisForm", devisForm);
        }
		return "listDevis"; //correspond au fichier html
	}

}