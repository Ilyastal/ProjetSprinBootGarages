package com.garage.controlleur.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;

import com.garage.enums.Genre;

public class ClientForm {
	
	private Integer id;

    @NotEmpty
	private String nom;
    
    @NotEmpty
	private String prenom;
    
    @NotEmpty
    private String adresse;
    
    @NotEmpty
    @Pattern(regexp = "^([0-9]{5})$")
	private String codePostal;
    
    @NotEmpty
	private String ville;
    
    @NotEmpty
    @Pattern(regexp = "^(([+]{1}[0-9]{2}|0)[0-9]{9})$")
	private String telephone;
    
    private Genre sexe;
	
	
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

	public Genre getSexe() {
		return sexe;
	}

	public void setSexe(Genre sexe) {
		this.sexe = sexe;
	}
}