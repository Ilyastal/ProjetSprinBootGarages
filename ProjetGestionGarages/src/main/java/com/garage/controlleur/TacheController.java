package com.garage.controlleur;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Tache;
import com.garage.controlleur.form.TacheForm;
import com.garage.iservice.IServiceTache;

/**
 * 
 */
@Controller
public class TacheController {

	
	
	@Autowired
	private IServiceTache servicetache;
	
	 private Tache convertForm(TacheForm tacheForm) throws Exception {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			Date date = sdf.parse(tacheForm.getDateCreation());
			Date date2 = sdf.parse(tacheForm.getDateFinTache());
	        Tache tache = new Tache();
	        tache.setId(tacheForm.getId());
	        tache.setDescription(tacheForm.getDescription());
	        tache.setDateCreation(date);
	        tache.setDateFinTache(date2);
	        return tache;
	    }
	 
	    @GetMapping("/Taches")
	    public String Afficher(Model model) {
	        final List<Tache> ltache = servicetache.rechercheTache();
	        model.addAttribute("listTache", ltache);
	        model.addAttribute("action", "CreerTache");
	        if(model.containsAttribute("tacheForm") == false) {
	            TacheForm tacheForm = new TacheForm();
	            tacheForm.setId(0);
	            model.addAttribute("tacheForm", tacheForm);
	        }
	        return "listTache";
	    }
	}

