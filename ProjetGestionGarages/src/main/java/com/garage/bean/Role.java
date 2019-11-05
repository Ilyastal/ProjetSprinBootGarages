package com.garage.bean;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.garage.enums.Fonction;

/**
 * 
 */
@Entity
@Table(name = "role")
public class Role {

	/**
	 * Default constructor
	 */
	public Role() {
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
	@Enumerated(EnumType.STRING)
    @Column(columnDefinition = "ENUM('ADMINISTRATEUR', 'CHEFATELIER', 'COMMERCIAL','MECANICIEN','MAGASINIER')")
	private Fonction fonction;



	public Integer getId() {
		return id;
	}



	public void setId(Integer id) {
		this.id = id;
	}



	public Fonction getFonction() {
		return fonction;
	}



	public void setFonction(Fonction fonction) {
		this.fonction = fonction;
	}




}