package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.FactureEntretien;
import com.garage.iservice.IServiceFactureEntretien;

/**
 * 
 */
@Controller
public class FactureEntretienController {

	/**
	 * Default constructor
	 */
	public FactureEntretienController() {
	}
	
	@Autowired
	private IServiceFactureEntretien servicefacturentretien;
	
	@GetMapping("/afficherFactureEntretien")
	public String Afficher(Model model) {
		final List<FactureEntretien> lfactent = servicefacturentretien.rechercheFactureEntretien();
		model.addAttribute("listFactureEntretien", lfactent); //attribut du fichier html
		return "listFactureEntretien"; //correspond au fichier html
	}

}