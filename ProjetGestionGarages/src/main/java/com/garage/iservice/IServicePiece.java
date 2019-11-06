package com.garage.iservice;

import java.util.*;

import com.garage.bean.Piece;

/**
 * 
 */
public interface IServicePiece {
	public void ajouterPiece(Piece piece);
	public List<Piece> recherchePiece();
	public Piece rechercherPieceId(final int id);
	public void modifierPiece(final Piece piece);
	public void supprimerPiece(final Piece piece);
}