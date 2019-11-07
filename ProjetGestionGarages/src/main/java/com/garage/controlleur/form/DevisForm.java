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
	private Date dateDevis;
	@NotEmpty
	private String description;
	@NotEmpty
	private Boolean validationDevis;
	@NotEmpty
	private Double prixHt;
	@NotEmpty
	private Double tva;
	@NotEmpty
	private Integer quantite;
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

	public Date getDateDevis() {
		return dateDevis;
	}

	public void setDateDevis(Date dateDevis) {
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

	public Double getPrixHt() {
		return prixHt;
	}

	public void setPrixHt(Double prixHt) {
		this.prixHt = prixHt;
	}

	public Double getTva() {
		return tva;
	}

	public void setTva(Double tva) {
		this.tva = tva;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
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