package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.garage.bean.Piece;
import com.garage.bean.Utilisateur;
import com.garage.controlleur.form.PieceForm;
import com.garage.controlleur.form.UtilisateurForm;
import com.garage.iservice.IServicePiece;

@Controller
public class PieceController {
	
	@Autowired
	private IServicePiece servicepiece;
	
	private Piece convertForm(PieceForm pieceForm) throws Exception {

		Piece piece = new Piece();
		piece.setId(pieceForm.getId());
		piece.setNom(pieceForm.getNom());
		piece.setPrixUnitaire(pieceForm.getPrixUnitaire());;
		piece.setQuantite(pieceForm.getQuantite());
		piece.setDescription(pieceForm.getDescription());
		piece.setTypeLot(pieceForm.getTypeLot());
        return piece;
    }
	
	@GetMapping("/Pieces")
	public String Afficher(Model model) {
		final List<Piece> lpiece = servicepiece.recherchePiece();
		model.addAttribute("listPiece", lpiece); //attribut du fichier html
		model.addAttribute("action", "CreerPiece");
		if(model.containsAttribute("pieceForm") == false) {
			UtilisateurForm pieceForm = new UtilisateurForm();
			pieceForm.setId(0);
			model.addAttribute("pieceForm", pieceForm);
		}
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