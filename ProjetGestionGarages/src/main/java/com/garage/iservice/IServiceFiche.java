package com.garage.iservice;

import java.util.*;

import com.garage.bean.Fiche;

/**
 * 
 */
public interface IServiceFiche {
	public List<Fiche> rechercheFiche();
	public Fiche rechercherFicheId(final int id);
	public void creerFiche(final Fiche fiche);
	public void modifierFiche(final Fiche fiche);
	public void supprimerFiche(final Fiche fiche);
	public void ValiderFiche(final Fiche fiche);
}