package com.garage.controlleur.form;

import javax.validation.constraints.NotEmpty;

/**
 * 
 */
public class DevisForm {
	
	private Integer id;
	@NotEmpty
	private String dateDevis;
	@NotEmpty
	private String description;
	@NotEmpty
	private String validationDevis;
	@NotEmpty
	private String prixHt;
	@NotEmpty
	private String tva;
	@NotEmpty
	private String quantite;
	@NotEmpty
	private String refusDevis;
	@NotEmpty
	private String annulationDevis;
	
	
	
//	private Client client;
//	
//	
//	private Utilisateur utilisateur;
//	
//	
//	private Voiture voiture;
	
	
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

	public String getValidationDevis() {
		return validationDevis;
	}

	public void setValidationDevis(String validationDevis) {
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

	public String getRefusDevis() {
		return refusDevis;
	}

	public void setRefusDevis(String refusDevis) {
		this.refusDevis = refusDevis;
	}

	public String getAnnulationDevis() {
		return annulationDevis;
	}

	public void setAnnulationDevis(String annulationDevis) {
		this.annulationDevis = annulationDevis;
	}
	

//	public Date getDateDevis() {
//		return dateDevis;
//	}
//
//	public void setDateDevis(Date dateDevis) {
//		this.dateDevis = dateDevis;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public Boolean getValidationDevis() {
//		return validationDevis;
//	}
//
//	public void setValidationDevis(Boolean validationDevis) {
//		this.validationDevis = validationDevis;
//	}
//
//	public Double getPrixHt() {
//		return prixHt;
//	}
//
//	public void setPrixHt(Double prixHt) {
//		this.prixHt = prixHt;
//	}
//
//	public Double getTva() {
//		return tva;
//	}
//
//	public void setTva(Double tva) {
//		this.tva = tva;
//	}
//
//	public Integer getQuantite() {
//		return quantite;
//	}
//
//	public void setQuantite(Integer quantite) {
//		this.quantite = quantite;
//	}
//
//	public Boolean getRefusDevis() {
//		return refusDevis;
//	}
//
//	public void setRefusDevis(Boolean refusDevis) {
//		this.refusDevis = refusDevis;
//	}
//
//	public Boolean getAnnulationDevis() {
//		return annulationDevis;
//	}
//
//	public void setAnnulationDevis(Boolean annulationDevis) {
//		this.annulationDevis = annulationDevis;
//	}
//	
//
//	public Client getClient() {
//		return client;
//	}
//
//	public void setClient(Client client) {
//		this.client = client;
//	}

//	public Utilisateur getUtilisateur() {
//		return utilisateur;
//	}
//
//	public void setUtilisateur(Utilisateur utilisateur) {
//		this.utilisateur = utilisateur;
//	}
//
//	public Voiture getVoiture() {
//		return voiture;
//	}
//
//	public void setVoiture(Voiture voiture) {
//		this.voiture = voiture;
//	}
}