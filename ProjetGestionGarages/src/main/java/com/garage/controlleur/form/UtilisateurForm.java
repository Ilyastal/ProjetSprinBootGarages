package com.garage.controlleur.form;

import java.util.*;

import javax.validation.constraints.NotEmpty;

/**
 * 
 */
public class UtilisateurForm {

	/**
	 * Default constructor
	 * gkjgkmoilhlfdjs
	 * jjcytdfthfuy
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
	private String motpass;
	private Boolean desactiverUser;

	/**
	 * 
	 */
	private Boolean desactiverAngular;

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

	public Boolean getDesactiverUser() {
		return desactiverUser;
	}

	public void setDesactiverUser(Boolean desactiverUser) {
		this.desactiverUser = desactiverUser;
	}

	public Boolean getDesactiverAngular() {
		return desactiverAngular;
	}

	public void setDesactiverAngular(Boolean desactiverAngular) {
		this.desactiverAngular = desactiverAngular;
	}

	public String getMotpass() {
		return motpass;
	}

	public void setMotpass(String motpass) {
		this.motpass = motpass;
	}


}