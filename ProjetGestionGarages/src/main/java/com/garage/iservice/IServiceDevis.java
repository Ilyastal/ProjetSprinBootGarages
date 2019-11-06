package com.garage.iservice;

/**
 * 
 */
public interface IServiceDevis {
	public List<Devis> rechercheDevis();
	public Devis rechercherDevisId(final int id);
	public void creerDevis(final Devis devis);
	public void modifierDevis(final Devis devis);
	public void supprimerDevis(final Devis devis);

}