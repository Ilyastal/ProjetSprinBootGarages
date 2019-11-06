package com.garage.bean;


import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "utilisateur")
public class Utilisateur {

	/**
	 * Default constructor
	 */
	public Utilisateur() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	@OneToMany(mappedBy="utilisateur")
    private Collection<CommandePiece> commandes;
	
	@OneToMany(mappedBy="utilisateur")
    private Collection<CommandeVoiture> voitures;
	
	@OneToMany(mappedBy="utilisateur")
    private Collection<Devis> devis;
	
	@OneToMany(mappedBy="utilisateur")
    private Collection<FactureEntretien> factures;
	
	
	@OneToMany(mappedBy="utilisateur")
    private Collection<Fiche> fiches;
	
	@OneToMany(mappedBy="utilisateur")
    private Collection<Tache> taches;
	
	public Collection<Devis> getDevis() {
		return devis;
	}

	public void setDevis(Collection<Devis> devis) {
		this.devis = devis;
	}

	public Collection<CommandePiece> getCommandes() {
		return commandes;
	}

	public void setCommandes(Collection<CommandePiece> commandes) {
		this.commandes = commandes;
	}

	public Collection<CommandeVoiture> getVoitures() {
		return voitures;
	}

	public void setVoitures(Collection<CommandeVoiture> voitures) {
		this.voitures = voitures;
	}

	@ManyToMany
    private Collection<Role> roles;
	
	/**
	 * 
	 */
	private String nom;

	/**
	 * 
	 */
	private String prenom;

	/**
	 * 
	 */
	private String user;
	private String motpass;
	/**
	 * 
	 */
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

	public Collection<Role> getRoles() {
		return roles;
	}

	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}

	public Collection<FactureEntretien> getFactures() {
		return factures;
	}

	public void setFactures(Collection<FactureEntretien> factures) {
		this.factures = factures;
	}

	public Collection<Fiche> getFiches() {
		return fiches;
	}

	public void setFiches(Collection<Fiche> fiches) {
		this.fiches = fiches;
	}

	public Collection<Tache> getTaches() {
		return taches;
	}

	public void setTaches(Collection<Tache> taches) {
		this.taches = taches;
	}



}