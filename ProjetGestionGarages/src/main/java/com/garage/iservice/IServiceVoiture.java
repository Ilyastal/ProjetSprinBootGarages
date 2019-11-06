package com.garage.iservice;

import java.util.*;

import com.garage.bean.Tache;
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