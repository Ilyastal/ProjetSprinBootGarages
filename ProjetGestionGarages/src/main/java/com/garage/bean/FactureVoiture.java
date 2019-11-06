package com.garage.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "facture_voiture")
public class FactureVoiture {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	private Integer nFacture;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date dateFacture;
	
	private String description;
	
	private Double prix;
	
	private Integer quantite;
	
	private Double tva;
	
	private Double total;
	

	@ManyToOne
	@JoinColumn(name = "devis_id")
	private Devis devis;


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
	
	public Double getPrix() {
		return prix;
	}
	
	public void setPrix(Double prix) {
		this.prix = prix;
	}
	
	public Integer getQuantite() {
		return quantite;
	}
	
	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}
	
	public Double getTva() {
		return tva;
	}
	
	public void setTva(Double tva) {
		this.tva = tva;
	}
	
	public Double getTotal() {
		return total;
	}
	
	public void setTotal(Double total) {
		this.total = total;
	}
	
	
	public Devis getDevis() {
		return devis;
	}
	
	public void setDevis(Devis devis) {
		this.devis = devis;
	}
}