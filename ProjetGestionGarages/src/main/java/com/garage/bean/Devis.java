package com.garage.bean;


import java.util.Collection;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 */
@Entity
@Table(name = "devis")
public class Devis {


	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@ManyToOne
	@JoinColumn(name = "Utilisateur_id")
	private Utilisateur utilisateur;
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "voiture_id")
	private Collection<Voiture> voiture;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@OneToOne(mappedBy="devis")
    private FactureVoiture factures;
	
	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDevis;

	/**
	 * 
	 */
	private String description;

	/**
	 * 
	 */
	private Boolean validationDevis;

	/**
	 * 
	 */
	private Double prixHT;

	/**
	 * 
	 */
	private Double tva;

	/**
	 * 
	 */
	private Integer quantite;

	/**
	 * 
	 */
	private Boolean refusDevis;

	/**
	 * 
	 */
	private Boolean annulationDevis;

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

	public Double getPrixHT() {
		return prixHT;
	}

	public void setPrixHT(Double prixHT) {
		this.prixHT = prixHT;
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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	

	public Collection<Voiture> getVoiture() {
		return voiture;
	}

	public void setVoiture(Collection<Voiture> voiture) {
		this.voiture = voiture;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public FactureVoiture getFactures() {
		return factures;
	}

	public void setFactures(FactureVoiture factures) {
		this.factures = factures;
	}





}