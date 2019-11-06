package com.garage.iservice;

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