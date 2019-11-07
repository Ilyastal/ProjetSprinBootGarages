package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Piece;
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
}