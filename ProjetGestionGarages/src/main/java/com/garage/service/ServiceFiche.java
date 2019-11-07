package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.Fiche;
import com.garage.dao.DaoFiche;
import com.garage.iservice.IServiceFiche;

/**
 * 
 */
@Service
public class ServiceFiche implements IServiceFiche {
	@Autowired DaoFiche ficheDao;
	/**
	 * Default constructor
	 */
	public ServiceFiche() {
	}

	@Transactional
	@Override
	public List<Fiche> rechercheFiche() {
		// TODO Auto-generated method stub
		return ficheDao.findAll();
	}

	@Transactional
	@Override
	public Fiche rechercherFicheId(int id) {
		// TODO Auto-generated method stub
		return ficheDao.findById(id).get();
	}

	@Transactional
	@Override
	public void creerFiche(Fiche fiche) {
		// TODO Auto-generated method stub
		ficheDao.save(fiche);
	}

	@Transactional
	@Override
	public void modifierFiche(Fiche fiche) {
		// TODO Auto-generated method stub
		ficheDao.save(fiche);
	}

	@Transactional
	@Override
	public void supprimerFiche(Fiche fiche) {
		// TODO Auto-generated method stub
		ficheDao.deleteById(fiche.getId());
	}

	@Transactional
	@Override
	public void ValiderFiche(Fiche fiche) {
		// TODO Auto-generated method stub

	}

}