package com.garage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.garage.bean.CommandeVoiture;
import com.garage.iservice.IServiceCommandeVoiture;

/**
 * 
 */
@Service
public class ServiceCommandeVoiture implements IServiceCommandeVoiture {

	/**
	 * Default constructor
	 */
	public ServiceCommandeVoiture() {
	}

	@Override
	public List<CommandeVoiture> rechercheCommandeVoiture() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public CommandeVoiture rechercherCommandeVoitureId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerCommandeVoiture(CommandeVoiture commandeVoiture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierCommandeVoiture(CommandeVoiture commandeVoiture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerCommandeVoiture(CommandeVoiture commandeVoiture) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<CommandeVoiture> listerCommandeValidee() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<CommandeVoiture> listerCommandeLivree() {
		// TODO Auto-generated method stub
		return null;
	}

}