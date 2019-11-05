package com.garage.bean;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "voiture")
public class Voiture {

	/**
	 * Default constructor
	 */
	public Voiture() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 
	 */
	private String categorie;

	/**
	 * 
	 */
	private String marque;

	/**
	 * 
	 */
	private String model;

	/**
	 * 
	 */
	private Integer annee;

	/**
	 * 
	 */
	private Integer porte;

	/**
	 * 
	 */
	private String energie;

	/**
	 * 
	 */
	private Integer co2;

	/**
	 * 
	 */
	private Double prixUnitaire;

	/**
	 * 
	 */
	private String couleur;

	/**
	 * 
	 */
	private Integer quantite;

	/**
	 * 
	 */
	private String photo;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public Integer getAnnee() {
		return annee;
	}

	public void setAnnee(Integer annee) {
		this.annee = annee;
	}

	public Integer getPorte() {
		return porte;
	}

	public void setPorte(Integer porte) {
		this.porte = porte;
	}

	public String getEnergie() {
		return energie;
	}

	public void setEnergie(String energie) {
		this.energie = energie;
	}

	public Integer getCo2() {
		return co2;
	}

	public void setCo2(Integer co2) {
		this.co2 = co2;
	}

	public Double getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(Double prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public String getCouleur() {
		return couleur;
	}

	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}


}