package com.garage.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name = "fiche")
public class Fiche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateValidation;
	
	private Boolean validation;
	
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur utilisateur;
	
	
	@OneToMany(mappedBy="fiche", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
    private List<FactureEntretien> facturesEntretien;

	@OneToMany(mappedBy="fiche", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
    private List<Tache> taches;
	
	
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
	
	
	public List<FactureEntretien> getFacturesEntretien() {
		return facturesEntretien;
	}
	
	public void setFacturesEntretien(List<FactureEntretien> facturesEntretien) {
		this.facturesEntretien = facturesEntretien;
	}

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
}