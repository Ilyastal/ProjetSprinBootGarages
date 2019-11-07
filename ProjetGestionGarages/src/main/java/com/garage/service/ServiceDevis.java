package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.garage.bean.Devis;
import com.garage.dao.DaoDevis;
import com.garage.iservice.IServiceDevis;

/**
 * 
 */
@Service
public class ServiceDevis implements IServiceDevis {
DaoDevis daoDevis;
	/**
	 * Default constructor
	 */
	public ServiceDevis() {
	}
	@Transactional
	@Override
	public List<Devis> rechercheDevis() {
		// TODO Auto-generated method stub
		return daoDevis.findAll();
	}
	@Transactional
	@Override
	public Devis rechercherDevisId(int id) {
		// TODO Auto-generated method stub
		return daoDevis.findById(id).get();
	}
	@Transactional
	@Override
	public void creerDevis(Devis devis) {
		daoDevis.save(devis);
		
	}
	@Transactional
	@Override
	public void modifierDevis(Devis devis) {
		daoDevis.save(devis);

		
	}
	@Transactional
	@Override
	public void supprimerDevis(Devis devis) {
	daoDevis.deleteById(devis.getId());
	
	}

}