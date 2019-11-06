package com.garage.iservice;

import java.util.List;

import com.garage.bean.Voiture;

import com.garage.bean.Voiture;

/**
 * 
 */
public interface IServiceVoiture {
  
	public List<Voiture> rechercheVoiture();
	public Voiture rechercherVoitureId(final int id);
	public void creerVoiture(final Voiture voiture);
	public void modifierVoiture(final Voiture voiture);
	public void supprimerVoiture(final Voiture voiture);
}