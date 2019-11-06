package com.garage.iservice;

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