package com.garage.bean;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.garage.enums.Priorite;

@Entity
@Table(name = "fiche")
public class Fiche {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	private String description;
	
	@Temporal(TemporalType.DATE)
	private Date dateCreation;
	
	@Temporal(TemporalType.DATE)
	private Date dateValidation;
	
	private Boolean validation;
	
	@Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('TRESURGENT','URGENT','NORMAL','NONPRIORITAIRE')")
	private Priorite niveauPriorite;
	
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur utilisateur;
	
	/*
	@OneToMany(mappedBy="fiche", fetch = FetchType.EAGER)
    private List<FactureEntretien> facturesEntretien;
	*/
	
	@OneToMany(mappedBy="fiche", fetch = FetchType.LAZY)
	@JsonBackReference
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
	
	public Priorite getNiveauPriorite() {
		return niveauPriorite;
	}
	
	public void setNiveauPriorite(Priorite niveauPriorite) {
		this.niveauPriorite = niveauPriorite;
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
	

	public List<Tache> getTaches() {
		return taches;
	}

	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
}