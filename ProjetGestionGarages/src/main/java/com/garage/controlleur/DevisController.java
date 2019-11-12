package com.garage.controlleur;

import java.text.SimpleDateFormat;
import java.util.Date;
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
	
	private Devis convertForm(DevisForm devisForm) throws Exception {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = sdf.parse(devisForm.getDateDevis());
		Devis devis = new Devis();
		devis.setId(devisForm.getId());
		devis.setDateDevis(date);
		devis.setDescription(devisForm.getDescription());
		devis.setPrixHt(Double.valueOf(devisForm.getPrixHt()));
		devis.setTva(Double.valueOf(devisForm.getTva()));
		devis.setQuantite(Integer.valueOf(devisForm.getQuantite()));
       return devis;
   }
	
	@GetMapping("/afficherDevis")
	public String Afficher(Model model) {
		final List<Devis> ldevis = servicedevis.rechercheDevis();
		model.addAttribute("listDevis", ldevis);
		model.addAttribute("action", "CreerDevis");
        if(model.containsAttribute("devisForm") == false) {
        	DevisForm devisForm = new DevisForm();
        	devisForm.setId(0);
            model.addAttribute("devisForm", devisForm);
        }
		return "listDevis";
	}

}