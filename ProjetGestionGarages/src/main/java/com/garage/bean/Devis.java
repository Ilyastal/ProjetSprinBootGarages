package com.garage.bean;

import java.util.Date;
import java.util.List;

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

@Entity
@Table(name = "devis")
public class Devis {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date dateDevis;
	
	private String description;
	
	private Boolean validationDevis;
	
	private Double prixHt;
	
	private Double tva;
	
	private Integer quantite;
	
	private Boolean refusDevis;
	
	private Boolean annulationDevis;
	
	
	@ManyToOne
	@JoinColumn(name = "client_id")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "utilisateur_id")
	private Utilisateur utilisateur;
	
	@ManyToOne
	@JoinColumn(name = "voiture_id")
	private Voiture voiture;
	

	@OneToMany(mappedBy = "devis", fetch = FetchType.EAGER)
	private List<CommandeVoiture> commandesVoiture;
	
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDateDevis() {
		return dateDevis;
	}

	public void setDateDevis(Date dateDevis) {
		this.dateDevis = dateDevis;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Boolean getValidationDevis() {
		return validationDevis;
	}

	public void setValidationDevis(Boolean validationDevis) {
		this.validationDevis = validationDevis;
	}

	public Double getPrixHt() {
		return prixHt;
	}

	public void setPrixHt(Double prixHt) {
		this.prixHt = prixHt;
	}

	public Double getTva() {
		return tva;
	}

	public void setTva(Double tva) {
		this.tva = tva;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	public Boolean getRefusDevis() {
		return refusDevis;
	}

	public void setRefusDevis(Boolean refusDevis) {
		this.refusDevis = refusDevis;
	}

	public Boolean getAnnulationDevis() {
		return annulationDevis;
	}

	public void setAnnulationDevis(Boolean annulationDevis) {
		this.annulationDevis = annulationDevis;
	}
	
	
	public Client getClient() {
		return client;
	}
	
	public void setClient(Client client) {
		this.client = client;
	}

	public Utilisateur getUtilisateur() {
		return utilisateur;
	}

	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}

	public Voiture getVoiture() {
		return voiture;
	}

	public void setVoiture(Voiture voiture) {
		this.voiture = voiture;
	}
	

	public List<CommandeVoiture> getCommandesVoiture() {
		return commandesVoiture;
	}

	public void setCommandesVoiture(List<CommandeVoiture> commandesVoiture) {
		this.commandesVoiture = commandesVoiture;
	}
}