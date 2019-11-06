package com.garage.iservice;

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