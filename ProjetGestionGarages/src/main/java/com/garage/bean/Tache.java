package com.garage.bean;


import java.util.Collection;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
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

import com.garage.enums.Etat;
import com.garage.enums.Priorite;

/**
 * 
 */
@Entity
@Table(name = "tache")
public class Tache {

	/**
	 * Default constructor
	 */
	public Tache() {
	}

	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	
	@OneToMany(fetch = FetchType.EAGER)
	@JoinColumn(name = "piece_id")
	private Collection<Piece> piece;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "Utilisateur_id")
	private Utilisateur utilisateur;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "fiche_id")
	private Fiche fiche;
	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinTache;

	/**
	 * 
	 */
	private String description;

	/**
	 * 
	 */
	@Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('TRESURGENT','URGENT','NORMAL','NONPRIORITAIRE')")
	private Priorite niveauPriorite;

	/**
	 * 
	 */
	@Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('AFAIRE','ENCOUR','TERMINER','VALIDER')")
	private Etat etatFiche;

	/**
	 * 
	 */
	private Boolean cloture;

	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;






	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateFinTache() {
		return dateFinTache;
	}

	public void setDateFinTache(Date dateFinTache) {
		this.dateFinTache = dateFinTache;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Priorite getNiveauPriorite() {
		return niveauPriorite;
	}

	public void setNiveauPriorite(Priorite niveauPriorite) {
		this.niveauPriorite = niveauPriorite;
	}

	public Etat getEtatFiche() {
		return etatFiche;
	}

	public void setEtatFiche(Etat etatFiche) {
		this.etatFiche = etatFiche;
	}

	public Boolean getCloture() {
		return cloture;
	}

	public void setCloture(Boolean cloture) {
		this.cloture = cloture;
	}

	public Date getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(Date dateCreation) {
		this.dateCreation = dateCreation;
	}



	public Collection<Piece> getPiece() {
		return piece;
	}

	public void setPiece(Collection<Piece> piece) {
		this.piece = piece;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Fiche getFiche() {
		return fiche;
	}

	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
	}
	
	






}