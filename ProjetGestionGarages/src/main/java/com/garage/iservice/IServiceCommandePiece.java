package com.garage.iservice;

import java.util.List;

import com.garage.bean.CommandePiece;
import com.garage.bean.CommandeVoiture;

/**
 * 
 */
public interface IServiceCommandePiece {
	public List<CommandePiece> rechercheCommandePiece();
	public CommandePiece rechercherCommandePieceId(final int id);
	public void creerCommandePiece(final CommandePiece commandePiece);
	public void modifierCommandePiece(final CommandePiece commandePiece);
	public void supprimerCommandePiece(final CommandePiece commandePiece);
	
}