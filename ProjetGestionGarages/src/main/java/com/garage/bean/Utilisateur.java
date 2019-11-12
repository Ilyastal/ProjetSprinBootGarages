package com.garage.bean;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	private String nom;
	
	@NotNull
	private String prenom;
	
	@NotNull
	private String user;
	
	@NotNull
	private String password;
	
	private Boolean activeUser;
	
	private Boolean activeAngular;
	
	/*
	@OneToMany(mappedBy="utilisateurCP", fetch = FetchType.EAGER)
    private List<CommandePiece> commandesPiece;
	
	@OneToMany(mappedBy="utilisateurV", fetch = FetchType.EAGER)
    private List<CommandeVoiture> voitures;
	
	@OneToMany(mappedBy="utilisateurD", fetch = FetchType.EAGER)
    private List<Devis> devis;
	
	@OneToMany(mappedBy="utilisateurFE", fetch = FetchType.EAGER)
    private List<FactureEntretien> factures;
	
	@OneToMany(mappedBy="utilisateurF", fetch = FetchType.EAGER)
    private List<Fiche> fiches;
	
	@OneToMany(mappedBy="utilisateurT", fetch = FetchType.EAGER)
    private List<Tache> taches;
	*/
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
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
	
	public Boolean getActiveUser() {
		return activeUser;
	}
	
	public void setActiveUser(Boolean activeUser) {
		this.activeUser = activeUser;
	}
	
	public Boolean getActiveAngular() {
		return activeAngular;
	}
	
	public void setActiveAngular(Boolean activeAngular) {
		this.activeAngular = activeAngular;
	}
	
	
	public List<Role> getRoles() {
		return roles;
	}
	
	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}
}