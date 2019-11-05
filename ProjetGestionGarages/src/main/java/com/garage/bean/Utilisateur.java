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
@Table(name = "utilisateur")
public class Utilisateur {

	/**
	 * Default constructor
	 */
	public Utilisateur() {
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
	private String nom;

	/**
	 * 
	 */
	private String prenom;

	/**
	 * 
	 */
	private String user;

	/**
	 * 
	 */
	private Boolean desactiverUser;

	/**
	 * 
	 */
	private Boolean desactiverAngular;

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

	public Boolean getDesactiverUser() {
		return desactiverUser;
	}

	public void setDesactiverUser(Boolean desactiverUser) {
		this.desactiverUser = desactiverUser;
	}

	public Boolean getDesactiverAngular() {
		return desactiverAngular;
	}

	public void setDesactiverAngular(Boolean desactiverAngular) {
		this.desactiverAngular = desactiverAngular;
	}



}