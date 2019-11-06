package com.garage.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.garage.enums.Etat;
import com.garage.enums.Priorite;

@Entity
@Table(name = "tache")
public class Tache {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFinTache;
	
	private String description;
	
	@Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('TRESURGENT','URGENT','NORMAL','NONPRIORITAIRE')")
	private Priorite niveauPriorite;
	
	@Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('AFAIRE','ENCOUR','TERMINER','VALIDER')")
	private Etat etatTache;
	
	private Boolean cloture;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateCreation;
	
	
	@ManyToOne
	@JoinColumn(name = "fiche_id")
	private Fiche fiche;
	
	@ManyToOne
	@JoinColumn(name = "piece_id")
	private Piece piece;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur utilisateur;
	
	
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
	
	public Etat getEtatTache() {
		return etatTache;
	}
	
	public void setEtatTache(Etat etatTache) {
		this.etatTache = etatTache;
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
	
	
	public Fiche getFiche() {
		return fiche;
	}
	
	public void setFiche(Fiche fiche) {
		this.fiche = fiche;
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