package com.garage.iservice;

import java.util.*;

import com.garage.bean.Tache;

/**
 * 
 */
public interface IServiceTache {
	public List<Tache> rechercheTache();
	public Tache rechercherTacheId(final int id);
	public void creerTache(final Tache tache);
	public void modifierTache(final Tache tache);
	public void supprimerTache(final Tache tache);
	public void ValiderTache(final Tache tache);
}