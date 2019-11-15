package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.Fiche;
import com.garage.dao.DaoFiche;
import com.garage.enums.Etat;
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
		return ficheDao.findAll();
	}

	@Transactional
	@Override
	public Fiche rechercherFicheId(int id) {
		return ficheDao.findById(id).get();
	}

	@Transactional
	@Override
	public void creerFiche(Fiche fiche) {
		ficheDao.save(fiche);
	}

	@Transactional
	@Override
	public void modifierFiche(Fiche fiche) {
		ficheDao.save(fiche);
	}

	@Transactional
	@Override
	public void supprimerFiche(Fiche fiche) {
		ficheDao.deleteById(fiche.getId());
	}

	@Transactional
	@Override
	public void cloturerFiche(Fiche fiche) {
        fiche.setValidation(true);
        ficheDao.save(fiche);
    }

}