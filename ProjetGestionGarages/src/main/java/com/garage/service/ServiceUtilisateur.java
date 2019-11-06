package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.Utilisateur;
import com.garage.dao.DaoUtilisateur;
import com.garage.iservice.IServiceUtilisateur;

/**
 * 
 */
@Service
public class ServiceUtilisateur implements IServiceUtilisateur {
@Autowired DaoUtilisateur userDao;
	/**
	 * Default constructor
	 */
	public ServiceUtilisateur() {
		
	}

	@Transactional
	@Override
	public List<Utilisateur> rechercheUtilisateur() {
		// TODO Auto-generated method stub
		return userDao.findAll();
	}

	@Transactional
	@Override
	public void creerUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Transactional
	@Override
	public void modifierUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		userDao.save(user);
	}

	@Transactional
	@Override
	public void supprimerUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		userDao.deleteById(user.getId());
	}

	@Transactional
	@Override
	public void loginUser(String user, String motpasse) {
		
		
	}

	@Transactional
	@Override
	public Utilisateur rechercherUtilisateurId(int id) {
		// TODO Auto-generated method stub
		return userDao.findById(id).get();
	}
}