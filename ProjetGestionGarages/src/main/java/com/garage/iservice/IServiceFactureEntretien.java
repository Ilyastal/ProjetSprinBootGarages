package com.garage.iservice;

/**
 * 
 */
public interface IServiceFactureEntretien {
	public List<FactureEntretien> rechercheFactureEntretien();
	public FactureEntretien rechercherFactureEntretienId(final int id);
	public void creerFactureEntretien(final FactureEntretien facture);
	public void modifierFactureEntretien(final FactureEntretien facture);
	public void supprimerFactureEntretien(final FactureEntretien facture);

}