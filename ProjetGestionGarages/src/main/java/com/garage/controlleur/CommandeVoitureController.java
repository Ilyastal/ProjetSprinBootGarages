package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.CommandeVoiture;
import com.garage.bean.Voiture;
import com.garage.dao.DaoCommandeVoiture;
import com.garage.iservice.IServiceCommandeVoiture;

/**
 * 
 */
@Controller
public class CommandeVoitureController {

	/**
	 * Default constructor
	 */
	public CommandeVoitureController() {
	}

	@Autowired
	private DaoCommandeVoiture daoCommandeVoiture;

	@GetMapping("/afficherCommandeVoiture")
	public String Afficher(Model model) {
		model.addAttribute("listCommandeVoiture", daoCommandeVoiture.findCommande());
		return "listCommandeVoiture";
	}

}