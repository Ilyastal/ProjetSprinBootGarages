package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.garage.bean.Piece;
import com.garage.dao.DaoPiece;
import com.garage.iservice.IServicePiece;

/**
 * 
 */
@Service
public class ServicePiece implements IServicePiece {
DaoPiece daoPiece;
	/**
	 * Default constructor
	 */
	public ServicePiece() {
	}
	@Transactional
	@Override
	public void ajouterPiece(Piece piece) {
		daoPiece.save(piece);
		
	}
	@Transactional
	@Override
	public List<Piece> recherchePiece() {
		return daoPiece.findAll();
	}
	@Transactional
	@Override
	public Piece rechercherPieceId(int id) {
		return daoPiece.findById(id).get();
	}
	@Transactional
	@Override
	public void modifierPiece(Piece piece) {
		daoPiece.save(piece);
		
	}
	@Transactional
	@Override
	public void supprimerPiece(Piece piece) {
		daoPiece.deleteById(piece.getId());
		
	}

}