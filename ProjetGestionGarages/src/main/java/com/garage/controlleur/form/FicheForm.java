package com.garage.controlleur.form;

import java.util.Date;
import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.garage.bean.Client;

import com.garage.bean.Utilisateur;

/**
 * 
 */
public class FicheForm {

	public FicheForm() {
	}
	private Integer id;
	
	 @NotEmpty
	private String description;
	
	 @NotEmpty
	private String dateCreation;
	
	 @NotEmpty
	private Client client;
	 
	 @NotEmpty
	private Utilisateur utilisateur;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	
}