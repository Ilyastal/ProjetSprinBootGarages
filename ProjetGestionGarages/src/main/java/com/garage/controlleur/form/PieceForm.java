package com.garage.controlleur.form;

import javax.validation.constraints.NotEmpty;

/**
 * 
 */
public class PieceForm {
	public PieceForm() {
	}
private Integer id;
    @NotEmpty
	private String nom;
    @NotEmpty
	private Double prixUnitaire;
    @NotEmpty
	private Integer quantite;
    @NotEmpty
	private String description;
    @NotEmpty
	private String typeLot;
	
	
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

	public Double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTypeLot() {
		return typeLot;
	}

	public void setTypeLot(String typeLot) {
		this.typeLot = typeLot;
	}
}