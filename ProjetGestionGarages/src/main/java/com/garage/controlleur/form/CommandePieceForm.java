package com.garage.controlleur.form;

import java.util.Date;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;

import com.garage.bean.Piece;
import com.garage.bean.Utilisateur;

/**
 * 
 */
public class CommandePieceForm {

	/**
	 * Default constructor
	 */
	public CommandePieceForm() {
	}
	private Integer id;

	@NotEmpty
	private Date dateCreation;
	
	@NotEmpty
	private Date dateLivraison;
	@NotEmpty
	private Boolean reception;
	@NotEmpty
	private String description;
	@NotEmpty
	private Integer quantite;
	
	@NotEmpty
	private Piece piece;
	@NotEmpty
	private Utilisateur utilisateur;
	
	
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
	

	public Piece getPiece() {
		return piece;
	}

	public void setPiece(Piece piece) {
		this.piece = piece;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
}