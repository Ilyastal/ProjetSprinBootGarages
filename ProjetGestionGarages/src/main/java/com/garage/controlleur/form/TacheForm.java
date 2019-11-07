package com.garage.controlleur.form;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.garage.bean.Fiche;
import com.garage.bean.Piece;
import com.garage.bean.Utilisateur;
import com.garage.enums.Etat;
import com.garage.enums.Priorite;

/**
 * 
 */
public class TacheForm {

	public TacheForm() {
	}
	private Integer id;

	@NotEmpty
	private Date dateFinTache;
	@NotEmpty
	private String description;
	
	@Pattern(regexp = "TRESURGENT|URGENT|NORMAL|NONPRIORITAIRE")
	private Priorite niveauPriorite;
	
    @Pattern(regexp = "AFAIRE|ENCOUR|TERMINER|VALIDER")
	private Etat etatTache;
    @NotEmpty
	private Boolean cloture;
	
    @NotEmpty
	private Date dateCreation;
	
	
    @NotEmpty
	private Fiche fiche;
	
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