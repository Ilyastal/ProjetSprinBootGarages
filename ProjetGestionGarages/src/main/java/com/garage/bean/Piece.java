package com.garage.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "piece")
public class Piece {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nom;
	
	private Double prixUnitaire;
	
	private Integer quantite;
	
	private String description;
	
	private String typeLot;
	
	/*
	@OneToMany(mappedBy = "piece", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<CommandePiece> commandesPiece;

	@OneToMany(mappedBy = "piece", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Tache> taches;
	*/
	
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