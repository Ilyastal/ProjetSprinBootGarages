package com.garage.controlleur.form;

import javax.validation.constraints.NotEmpty;

/**
 * 
 */
public class UtilisateurForm {

	/**
	 * Default constructor
	 */
	public UtilisateurForm() {
	}
	
	private Integer id;

	/**
	 * 
	 */
	@NotEmpty
	private String nom;

	/**
	 * 
	 */
	@NotEmpty
	private String prenom;

	/**
	 * 
	 */
	@NotEmpty
	private String user;

	/**
	 * 
	 */
	private String password;

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}