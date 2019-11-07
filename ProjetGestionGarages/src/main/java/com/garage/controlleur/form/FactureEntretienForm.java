package com.garage.controlleur.form;

import java.util.Date;

import javax.validation.constraints.NotEmpty;

import com.garage.bean.Client;
import com.garage.bean.Fiche;
import com.garage.bean.Utilisateur;

/**
 * 
 */
public class FactureEntretienForm {

	public FactureEntretienForm() {
	}
private Integer id;
    @NotEmpty
	private Integer nFacture;
    @NotEmpty
	private Date dateFacture;
    @NotEmpty
	private String description;
    @NotEmpty
	private Double tva;
    @NotEmpty
	private Client client;
    @NotEmpty
	private Fiche fiche;
    @NotEmpty
	private Utilisateur utilisateur;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getnFacture() {
		return nFacture;
	}

	public void setnFacture(Integer nFacture) {
		this.nFacture = nFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTva() {
		return tva;
	}

	public void setTva(Double tva) {
		this.tva = tva;
	}
	
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}
	
	public Fiche getFiche() {
		return fiche;
	}
	
	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}
	
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}