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
@Table(name = "commandepiece")
public class CommandePiece {



	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 
	 */
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "piece_id")
	private Collection<Piece> pieces;
	
	@ManyToOne
	@JoinColumn(name = "Utilisateur_id")
	private Utilisateur utilisateur;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;

	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateLivraison;

	/**
	 * 
	 */
	private Boolean reception;

	/**
	 * 
	 */
	private String description;

	/**
	 * 
	 */
	private Integer quantite;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}

	public Date getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(Date dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public Boolean getReception() {
		return reception;
	}

	public void setReception(Boolean reception) {
		this.reception = reception;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	

	public Collection<Piece> getPieces() {
		return pieces;
	}

	public void setPieces(Collection<Piece> pieces) {
		this.pieces = pieces;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	



}