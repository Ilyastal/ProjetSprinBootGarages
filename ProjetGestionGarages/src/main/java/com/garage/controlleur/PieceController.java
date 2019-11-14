package com.garage.controlleur;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.garage.bean.Piece;
import com.garage.controlleur.form.PieceForm;
import com.garage.iservice.IServicePiece;

@Controller
public class PieceController {

	@Autowired
	private IServicePiece servicePiece;

	private Piece convertForm(PieceForm pieceForm) throws Exception {
		Piece piece = new Piece();
		piece.setId(pieceForm.getId());
		piece.setNom(pieceForm.getNom());
		piece.setPrixUnitaire(Double.valueOf(pieceForm.getPrixUnitaire()));;
		piece.setQuantite(Integer.valueOf(pieceForm.getQuantite()));
		piece.setDescription(pieceForm.getDescription());
		piece.setTypeLot(pieceForm.getTypeLot());
		return piece;
	}

	@GetMapping("/Pieces/Ajouter")
	public String afficher(Model model) {
		model.addAttribute("listPiece", servicePiece.recherchePiece()); //attribut du fichier html
		
		model.addAttribute("action", "Ajout");
		if(!model.containsAttribute("pieceAdd")) {
			PieceForm pieceForm = new PieceForm();
			pieceForm.setId(0);
			
			model.addAttribute("pieceAdd", pieceForm);
		}
		
		return "listPiece"; //correspond au fichier html
	}
	
	@GetMapping("/Pieces/Modifier/{id}")
	public String afficher(@PathVariable final Integer id, Model model) {
		model.addAttribute("listPiece", servicePiece.recherchePiece()); //attribut du fichier html
		
		model.addAttribute("action", "Modification");
		if(!model.containsAttribute("pieceModif")) {
			PieceForm pieceForm = new PieceForm();
			
			if(id == null || id < 1) {
				return this.afficher(model);
			}
			
			final Piece pi = servicePiece.rechercherPieceId(id);
			pieceForm.setId(pi.getId());
			pieceForm.setNom(pi.getNom());
			pieceForm.setPrixUnitaire(pi.getPrixUnitaire().toString());
			pieceForm.setQuantite(pi.getQuantite().toString());
			pieceForm.setTypeLot(pi.getTypeLot());
			pieceForm.setDescription(pi.getDescription());
			
			model.addAttribute("pieceModif", pieceForm);
		}
		
		return "listPiece"; //correspond au fichier html
	}
	
	@PostMapping("/Pieces/Ajouter")
	public String ajoutPiece(
			@Valid @ModelAttribute(name = "pieceAdd") PieceForm pieceForm,
			BindingResult pieceResult,
			Model model)
	{
		if(!pieceResult.hasErrors()) {
			try {
				Piece pi = convertForm(pieceForm);
				servicePiece.creerPiece(pi);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	}
	
	@PostMapping("/Pieces/Modifier")
	public String modifPiece(
			@Valid @ModelAttribute(name = "pieceModif") PieceForm pieceForm,
			BindingResult pieceResult,
			Model model)
	{
		if(!pieceResult.hasErrors()) {
			try {
				Piece pi = convertForm(pieceForm);
				servicePiece.modifierPiece(pi);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	}
}