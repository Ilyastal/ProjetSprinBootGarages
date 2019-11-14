package com.garage.iservice;

import java.util.List;

import com.garage.bean.Utilisateur;

/**
 * 
 */
public interface IServiceUtilisateur {
	public List<Utilisateur> rechercheUtilisateur();
	public Utilisateur rechercherUtilisateurId(final int id);
	public void creerUtilisateur(final Utilisateur user);
	public void modifierUtilisateur(final Utilisateur user);
	public void desactiverUtilisateur(final Utilisateur user);
	public void loginUser(final String user,final String password);
	public Utilisateur auth(final String user, final String password);
}
