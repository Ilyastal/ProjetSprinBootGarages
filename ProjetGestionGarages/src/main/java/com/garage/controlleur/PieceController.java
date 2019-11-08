package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.garage.bean.Piece;
import com.garage.bean.Voiture;
import com.garage.iservice.IServicePiece;

@Controller
public class PieceController {
	
	@Autowired
	private IServicePiece servicepiece;
	
	@GetMapping("/afficherPiece")
	public String Afficher(Model model) {
		final List<Piece> lpiece = servicepiece.recherchePiece();
		model.addAttribute("listPiece", lpiece); //attribut du fichier html
		return "listPiece"; //correspond au fichier html
	}
	
	@GetMapping("/supprimerPiece/{id}")
	public String Supprimer(@PathVariable final Integer id,Model model) {
		Piece piece = servicepiece.rechercherPieceId(id);
		if(piece  != null) {
			servicepiece.supprimerPiece(piece);;
		}
		return this.Afficher(model);
	}
}