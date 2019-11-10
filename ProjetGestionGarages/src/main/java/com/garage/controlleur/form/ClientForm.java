package com.garage.controlleur.form;

import javax.persistence.Column;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.garage.enums.Genre;

/**
 * 
 */
public class ClientForm {

	/**
	 * Default constructor
	 */
	public ClientForm() {
	}
private Integer id;

    @Pattern(regexp = "MADAME|MONSIEUR")
    private String sexe;

	private String nom;
    @NotEmpty
	private String prenom;
    @NotEmpty
	private String adresse;
    @NotEmpty
	private String codePostal;
    @NotEmpty
	private String ville;
    @NotEmpty
	private String telephone;
	
	
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

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(String codePostal) {
		this.codePostal = codePostal;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}
}