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
	private String dateCommande;
	
	@NotEmpty
	private String dateReception;
	@NotEmpty
	private String quantite;
	
	@NotEmpty
	private String dateCloture;
	@NotEmpty
	private String utilisateur;
	@NotEmpty
	private String voiture;
	@NotEmpty
	private String devis;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}



	public String getQuantite() {
		return quantite;
	}

	public void setQuantite(String quantite) {
		this.quantite = quantite;
	}

	
	

	public String getDateCommande() {
		return dateCommande;
	}

	public void setDateCommande(String dateCommande) {
		this.dateCommande = dateCommande;
	}

	public String getDateReception() {
		return dateReception;
	}

	public void setDateReception(String dateReception) {
		this.dateReception = dateReception;
	}

	public String getDateCloture() {
		return dateCloture;
	}

	public void setDateCloture(String dateCloture) {
		this.dateCloture = dateCloture;
	}

	public String getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(String utilisateur) {
		this.utilisateur = utilisateur;
	}

	public String getVoiture() {
		return voiture;
	}

	public void setVoiture(String voiture) {
		this.voiture = voiture;
	}
	
	public String getDevis() {
		return devis;
	}

	public void setDevis(String devis) {
		this.devis = devis;
	}
}