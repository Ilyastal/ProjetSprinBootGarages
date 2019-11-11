package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Tache;
import com.garage.iservice.IServiceTache;

/**
 * 
 */
@Controller
public class TacheController {

	
	
	@Autowired
	private IServiceTache servicetache;
	
	@GetMapping("/afficherTache")
	public String Afficher(Model model) {
		final List<Tache> ltache = servicetache.rechercheTache();
		model.addAttribute("listTache", ltache); //attribut du fichier html
		return "listTache"; //correspond au fichier html
	}

}