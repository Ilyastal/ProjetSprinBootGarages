package com.garage.service;

import java.util.*;

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

	@Override
	public List<Utilisateur> rechercheUtilisateur() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerUtilisateur(Utilisateur user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void loginUser(String user, String motpasse) {
		
		
	}

	@Override
	public Utilisateur rechercherUtilisateurId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}