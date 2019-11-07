package com.garage.controlleur.form;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import com.garage.bean.Devis;
import com.garage.bean.Utilisateur;
import com.garage.bean.Voiture;

/**
 * 
 */
public class CommandeVoitureForm {

	public CommandeVoitureForm() {
	}
	private Integer id;
	
	@NotEmpty
	private Date dateCommande;
	
	@NotEmpty
	private Date dateReception;
	@NotEmpty
	private Integer quantite;
	
	@NotEmpty
	private Date dateCloture;
	@NotEmpty
	private Utilisateur utilisateur;
	@NotEmpty
	private Voiture voiture;
	@NotEmpty
	private Devis devis;
	
	
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
	
	public Devis getDevis() {
		return devis;
	}

	public void setDevis(Devis devis) {
		this.devis = devis;
	}
}