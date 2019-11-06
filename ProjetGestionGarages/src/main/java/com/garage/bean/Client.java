package com.garage.bean;




import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.garage.enums.Genre;

/**
 * 
 */

@Entity
@Table(name = "client")
public class Client {

	
	/**
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	/**
	 * 
	 */
	@Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('MADAME', 'MONSIEUR')")
	private Genre sexe;

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
	private String adresse;

	/**
	 * 
	 */
	private Integer codePostal;

	/**
	 * 
	 */
	private String ville;

	/**
	 * 
	 */
	private String telephone;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Genre getSexe() {
		return sexe;
	}

	public void setSexe(Genre sexe) {
		this.sexe = sexe;
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

	public Integer getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(Integer codePostal) {
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
	

}