package com.garage.iservice;

import java.util.List;

import com.garage.bean.FactureEntretien;

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