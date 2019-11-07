package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.CommandePiece;
import com.garage.dao.DaoCommandePiece;
import com.garage.iservice.IServiceCommandePiece;

/**
 * 
 */
@Service
public class ServiceCommandePiece implements IServiceCommandePiece{
	@Autowired DaoCommandePiece commandePieceDao;
	/**
	 * Default constructor
	 */
	public ServiceCommandePiece() {
	}
	@Transactional
	@Override
	public List<CommandePiece> rechercheCommandePiece() {
		
		return commandePieceDao.findAll();
	}
	@Transactional
	@Override
	public CommandePiece rechercherCommandePieceId(int id) {
		// TODO Auto-generated method stub
		return commandePieceDao.findById(id).get();
	}
	@Transactional
	@Override
	public void creerCommandePiece(CommandePiece commandePiece) {
		commandePieceDao.save(commandePiece);
		
	}
	@Transactional
	@Override
	public void modifierCommandePiece(CommandePiece commandePiece) {
		commandePieceDao.save(commandePiece);
		
	}
	@Transactional
	@Override
	public void supprimerCommandePiece(CommandePiece commandePiece) {
		commandePieceDao.deleteById(commandePiece.getId());
		
	}

}