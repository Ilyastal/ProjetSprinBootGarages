package com.garage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.garage.bean.Fiche;
import com.garage.iservice.IServiceFiche;

/**
 * 
 */
@Service
public class ServiceFiche implements IServiceFiche {

	/**
	 * Default constructor
	 */
	public ServiceFiche() {
	}

	@Override
	public List<Fiche> rechercheFiche() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Fiche rechercherFicheId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerFiche(Fiche fiche) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierFiche(Fiche fiche) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerFiche(Fiche fiche) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ValiderFiche(Fiche fiche) {
		// TODO Auto-generated method stub
		
	}

}