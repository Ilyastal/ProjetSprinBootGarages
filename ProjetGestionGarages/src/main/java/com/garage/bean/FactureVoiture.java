package com.garage.bean;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
/**
 * 
 */
@Entity
@Table(name = "facturevoiture")
public class FactureVoiture {
	/**
	 * Default constructor
	 */
	public FactureVoiture() {
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
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "devis_id")
	private Devis devis;
	private Integer nFacture;
	/**
	 * 
	 */
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFacture;
	/**
	 * 
	 */
	private String description;

	private Double tva;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getnFacture() {
		return nFacture;
	}

	public void setnFacture(Integer nFacture) {
		this.nFacture = nFacture;
	}

	public Date getDateFacture() {
		return dateFacture;
	}

	public void setDateFacture(Date dateFacture) {
		this.dateFacture = dateFacture;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getTva() {
		return tva;
	}

	public void setTva(Double tva) {
		this.tva = tva;
	}

	public Devis getDevis() {
		return devis;
	}

	public void setDevis(Devis devis) {
		this.devis = devis;
	}

	
	
}