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
@Table(name = "fiche")
public class Fiche {

	/**
	 * Default constructor
	 */
	public Fiche() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	
	@ManyToOne
	@JoinColumn(name = "Utilisateur_id")
	private Utilisateur utilisateur;
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	
	@OneToMany(mappedBy="fiche")
    private Collection<Tache> taches;
	
	@OneToOne(mappedBy="fiche")
    private FactureEntretien factures;
	/**
	 * 
	 */
	private String description;

	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateValidation;

	/**
	 * 
	 */
	private Boolean validation;

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

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Collection<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Collection<Tache> taches) {
		this.taches = taches;
	}

	public FactureEntretien getFactures() {
		return factures;
	}

	public void setFactures(FactureEntretien factures) {
		this.factures = factures;
	}







}