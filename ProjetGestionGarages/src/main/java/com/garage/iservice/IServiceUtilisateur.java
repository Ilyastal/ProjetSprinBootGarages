package com.garage.iservice;

import java.util.List;

import com.garage.bean.Utilisateur;

/**
 * 
 */
public interface IServiceUtilisateur {
	public List<Utilisateur> rechercheUtilisateur();
	public void creerUtilisateur(final Utilisateur user);
	public void modifierUtilisateur(final Utilisateur user);
	public void supprimerUtilisateur(final Utilisateur user);
	public void loginUser(final String user,final String motpasse);
}