package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.FactureEntretien;
import com.garage.dao.DaoFactureEntretien;
import com.garage.iservice.IServiceFactureEntretien;

/**
 * 
 */
@Service
public class ServiceFactureEntretien implements IServiceFactureEntretien {
	@Autowired DaoFactureEntretien factureentretienDao;
	/**
	 * Default constructor
	 */
	public ServiceFactureEntretien() {
	}

	@Transactional
	@Override
	public List<FactureEntretien> rechercheFactureEntretien() {
		// TODO Auto-generated method stub
		return factureentretienDao.findAll();
	}

	@Transactional
	@Override
	public FactureEntretien rechercherFactureEntretienId(int id) {
		// TODO Auto-generated method stub
		return factureentretienDao.findById(id).get();
	}

	@Transactional
	@Override
	public void creerFactureEntretien(FactureEntretien facture) {
		// TODO Auto-generated method stub
		factureentretienDao.save(facture);
	}

	@Transactional
	@Override
	public void modifierFactureEntretien(FactureEntretien facture) {
		// TODO Auto-generated method stub
		factureentretienDao.save(facture);
	}

	@Transactional
	@Override
	public void supprimerFactureEntretien(FactureEntretien facture) {
		// TODO Auto-generated method stub
		factureentretienDao.deleteById(facture.getId());
	}

}