package com.garage.bean;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.JoinColumn;

/**
 * 
 */
@Entity
@Table(name = "utilisateur")
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private String nom;
	
	private String prenom;
	
	private String user;
	
	private String password;
	
	private Boolean desactiveUser;
	
	private Boolean desactiveAngular;
	
	
	@OneToMany(mappedBy="utilisateur", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
    private List<CommandePiece> commandesPiece;
	
	@OneToMany(mappedBy="utilisateur", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
    private List<CommandeVoiture> voitures;
	
	@OneToMany(mappedBy="utilisateur", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
    private List<Devis> devis;
	
	@OneToMany(mappedBy="utilisateur", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
    private List<FactureEntretien> factures;
	
	@OneToMany(mappedBy="utilisateur", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
    private List<Fiche> fiches;
	
	@OneToMany(mappedBy="utilisateur", fetch = FetchType.EAGER)
	@Fetch(value = FetchMode.SUBSELECT)
    private List<Tache> taches;
	
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST, CascadeType.MERGE })
	@JoinTable(name = "utilisateur_role", joinColumns = { @JoinColumn(name = "utilisateur_id") }, inverseJoinColumns = { @JoinColumn(name = "role_id") })
	private List<Role> roles;


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
	
	public String getPrenom() {
		return prenom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public String getUser() {
		return user;
	}
	
	public void setUser(String user) {
		this.user = user;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public Boolean getDesactiveUser() {
		return desactiveUser;
	}
	
	public void setDesactiveUser(Boolean desactiveUser) {
		this.desactiveUser = desactiveUser;
	}
	
	public Boolean getDesactiveAngular() {
		return desactiveAngular;
	}
	
	public void setDesactiveAngular(Boolean desactiveAngular) {
		this.desactiveAngular = desactiveAngular;
	}
	
	
	public List<CommandePiece> getCommandesPiece() {
		return commandesPiece;
	}
	
	public void setCommandesPiece(List<CommandePiece> commandesPiece) {
		this.commandesPiece = commandesPiece;
	}
	public List<CommandeVoiture> getVoitures() {
		return voitures;
	}
	
	public void setVoitures(List<CommandeVoiture> voitures) {
		this.voitures = voitures;
	}
	
	public List<Devis> getDevis() {
		return devis;
	}
	
	public void setDevis(List<Devis> devis) {
		this.devis = devis;
	}
	
	public List<FactureEntretien> getFactures() {
		return factures;
	}
	
	public void setFactures(List<FactureEntretien> factures) {
		this.factures = factures;
	}
	
	public List<Fiche> getFiches() {
		return fiches;
	}
	
	public void setFiches(List<Fiche> fiches) {
		this.fiches = fiches;
	}
	
	public List<Tache> getTaches() {
		return taches;
	}
	
	public void setTaches(List<Tache> taches) {
		this.taches = taches;
	}
	
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}