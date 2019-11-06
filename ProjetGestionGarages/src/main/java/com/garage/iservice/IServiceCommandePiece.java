package com.garage.iservice;

import java.util.*;

import com.garage.bean.CommandePiece;

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