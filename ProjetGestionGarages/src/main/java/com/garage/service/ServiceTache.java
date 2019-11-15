package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.Tache;
import com.garage.dao.DaoTache;
import com.garage.enums.Etat;
import com.garage.iservice.IServiceTache;

/**
 * 
 */
@Service
public class ServiceTache implements IServiceTache {
	@Autowired DaoTache tacheDao;
	

	@Transactional
	@Override
	public List<Tache> rechercheTache() {
		return tacheDao.findAll();
	}

	@Transactional
	@Override
	public Tache rechercherTacheId(int id) {
		return tacheDao.findById(id).get();
	}

	@Transactional
	@Override
	public void creerTache(Tache tache) {
		tacheDao.save(tache);
	}

	@Transactional
	@Override
	public void modifierTache(Tache tache) {
		tacheDao.save(tache);
	}

	@Transactional
	@Override
	public void supprimerTache(Tache tache) {
		tacheDao.deleteById(tache.getId());
	}

	@Transactional
	@Override
	public void validerTache(Tache tache) {
		tache.setEtatTache(Etat.VALIDER);
		tacheDao.save(tache);
	}

}