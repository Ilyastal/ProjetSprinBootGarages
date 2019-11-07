package com.garage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.garage.bean.Piece;
import com.garage.iservice.IServicePiece;

/**
 * 
 */
@Service
public class ServicePiece implements IServicePiece {

	/**
	 * Default constructor
	 */
	public ServicePiece() {
	}

	@Override
	public void ajouterPiece(Piece piece) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Piece> recherchePiece() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Piece rechercherPieceId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void modifierPiece(Piece piece) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerPiece(Piece piece) {
		// TODO Auto-generated method stub
		
	}

}