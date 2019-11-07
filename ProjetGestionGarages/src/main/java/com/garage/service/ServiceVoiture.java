package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.Voiture;
import com.garage.dao.DaoVoiture;
import com.garage.iservice.IServiceVoiture;

/**
 * 
 */
@Service
public class ServiceVoiture implements IServiceVoiture {
	@Autowired DaoVoiture daoVoiture;
	/**
	 * Default constructor
	 */
	public ServiceVoiture() {
	}
	@Transactional
	@Override
	public List<Voiture> rechercheVoiture() {
		// TODO Auto-generated method stub
		return daoVoiture.findAll();
	}
	@Transactional
	@Override
	public Voiture rechercherVoitureId(int id) {
		// TODO Auto-generated method stub
		return daoVoiture.findById(id).get();
	}
	@Transactional
	@Override
	public void creerVoiture(Voiture voiture) {
		daoVoiture.save(voiture);
		
	}
	@Transactional
	@Override
	public void modifierVoiture(Voiture voiture) {
		daoVoiture.save(voiture);
		
	}
	@Transactional
	@Override
	public void supprimerVoiture(Voiture voiture) {
		daoVoiture.deleteById(voiture.getId());
	}

}