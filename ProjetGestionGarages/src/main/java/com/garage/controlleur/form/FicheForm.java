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
	private Date dateCreation;
	
	 @NotEmpty
	private Date dateValidation;
	 @NotEmpty
	private Boolean validation;
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
	
	public Date getDateCreation() {
		return dateCreation;
	}
	
	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}
	
	public Date getDateValidation() {
		return dateValidation;
	}
	
	public void setDateValidation(Date dateValidation) {
		this.dateValidation = dateValidation;
	}
	
	public Boolean getValidation() {
		return validation;
	}
	
	public void setValidation(Boolean validation) {
		this.validation = validation;
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