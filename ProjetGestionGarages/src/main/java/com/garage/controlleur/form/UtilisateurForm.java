package com.garage.controlleur.form;

import java.util.List;

import javax.validation.constraints.NotEmpty;

import com.garage.bean.Role;

public class UtilisateurForm {
	
	private Integer id;

	@NotEmpty
	private String nom;
	
	@NotEmpty
	private String prenom;
	
	@NotEmpty
	private String user;
	
	@NotEmpty
	private String password;

	private Boolean activeUser;

	private Boolean activeAngular;
	
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