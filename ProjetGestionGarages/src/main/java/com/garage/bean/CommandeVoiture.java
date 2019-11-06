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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 */
@Entity
@Table(name = "commandevoiture")
public class CommandeVoiture {

	 

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Utilisateur_id")
	private Utilisateur utilisateur;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "voiture_id")
	private Voiture voiture;
	
	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "devis_id")
	private Collection<Devis> devis;
	
	
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCommande;

	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateReception;

	/**
	 * 
	 */
	private Integer quantite;

	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCloture;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(Date dateCommande) {
		this.dateCommande = dateCommande;
	}

	public Date getDateReception() {
		return dateReception;
	}

	public void setDateReception(Date dateReception) {
		this.dateReception = dateReception;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Date getDateCloture() {
		return dateCloture;
	}

	public void setDateCloture(Date dateCloture) {
		this.dateCloture = dateCloture;
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

	public Collection<Devis> getDevis() {
		return devis;
	}

	public void setDevis(Collection<Devis> devis) {
		this.devis = devis;
	}

	

	




}