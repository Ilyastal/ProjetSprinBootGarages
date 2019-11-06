package com.garage.iservice;

import java.util.List;

import com.garage.bean.CommandeVoiture;

/**
 * 
 */
public interface IServiceCommandeVoiture {
	public List<CommandeVoiture> rechercheCommandeVoiture();
	public CommandeVoiture rechercherCommandeVoitureId(final int id);
	public void creerCommandeVoiture(final CommandeVoiture commandeVoiture);
	public void modifierCommandeVoiture(final CommandeVoiture commandeVoiture);
	public void supprimerCommandeVoiture(final CommandeVoiture commandeVoiture);
	public List<CommandeVoiture> listerCommandeValidee();
	public List<CommandeVoiture> listerCommandeLivree();

}