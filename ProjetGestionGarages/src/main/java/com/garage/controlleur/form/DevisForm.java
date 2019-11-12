package com.garage.controlleur.form;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import com.garage.bean.Client;
import com.garage.bean.Utilisateur;
import com.garage.bean.Voiture;

/**
 * 
 */
public class DevisForm {
	public DevisForm() {
	}
	private Integer id;
	@NotEmpty
	private String dateDevis;
	@NotEmpty
	private String description;
	@NotEmpty
	private Boolean validationDevis;
	@NotEmpty
	private String prixHt;
	@NotEmpty
	private String tva;
	@NotEmpty
	private String quantite;
	@NotEmpty
	private Boolean refusDevis;
	@NotEmpty
	private Boolean annulationDevis;
	
	
	
	private Client client;
	
	
	private Utilisateur utilisateur;
	
	
	private Voiture voiture;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDateDevis() {
		return dateDevis;
	}

	public void setDateDevis(String dateDevis) {
		this.dateDevis = dateDevis;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getValidationDevis() {
		return validationDevis;
	}

	public void setValidationDevis(Boolean validationDevis) {
		this.validationDevis = validationDevis;
	}

	public String getPrixHt() {
		return prixHt;
	}

	public void setPrixHt(String prixHt) {
		this.prixHt = prixHt;
	}

	public String getTva() {
		return tva;
	}

	public void setTva(String tva) {
		this.tva = tva;
	}

	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	public Boolean getRefusDevis() {
		return refusDevis;
	}

	public void setRefusDevis(Boolean refusDevis) {
		this.refusDevis = refusDevis;
	}

	public Boolean getAnnulationDevis() {
		return annulationDevis;
	}

	public void setAnnulationDevis(Boolean annulationDevis) {
		this.annulationDevis = annulationDevis;
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

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
}