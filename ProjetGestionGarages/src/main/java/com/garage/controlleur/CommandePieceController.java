package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.CommandePiece;
import com.garage.bean.Utilisateur;
import com.garage.iservice.IServiceCommandePiece;
import com.garage.iservice.IServiceUtilisateur;

/**
 * 
 */
@Controller
public class CommandePieceController {

	/**
	 * Default constructor
	 */
	public CommandePieceController() {
	}
	
	@Autowired
	private IServiceCommandePiece servicecommandepiece;
	
	@GetMapping("/afficherCommandePiece")
	public String Afficher(Model model) {
		final List<CommandePiece> lcompiece = servicecommandepiece.rechercheCommandePiece();
		model.addAttribute("listCommandePiece", lcompiece); //attribut du fichier html
		return "listCommandePiece"; //correspond au fichier html
	}

}