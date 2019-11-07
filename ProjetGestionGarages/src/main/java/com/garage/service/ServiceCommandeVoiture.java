package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.garage.bean.CommandeVoiture;
import com.garage.bean.Devis;
import com.garage.dao.DaoCommandeVoiture;
import com.garage.dao.DaoDevis;
import com.garage.iservice.IServiceCommandeVoiture;

/**
 * 
 */
@Service
public class ServiceCommandeVoiture implements IServiceCommandeVoiture {
	DaoCommandeVoiture daoCommandeVoiture;
    DaoDevis daoDevis;
	/**
	 * Default constructor
	 */
	public ServiceCommandeVoiture() {
	}
	@Transactional
	@Override
	public List<CommandeVoiture> rechercheCommandeVoiture() {
		// TODO Auto-generated method stub
		return daoCommandeVoiture.findAll();
	}
	@Transactional
	@Override
	public CommandeVoiture rechercherCommandeVoitureId(int id) {
		// TODO Auto-generated method stub
		return daoCommandeVoiture.findById(id).get();
	}
	@Transactional
	@Override
	public void creerCommandeVoiture(CommandeVoiture commandeVoiture) {
		daoCommandeVoiture.save(commandeVoiture);
	}
	@Transactional
	@Override
	public void modifierCommandeVoiture(CommandeVoiture commandeVoiture) {
		daoCommandeVoiture.save(commandeVoiture);
		
	}
	@Transactional
	@Override
	public void supprimerCommandeVoiture(CommandeVoiture commandeVoiture) {
		daoCommandeVoiture.deleteById(commandeVoiture.getId());
		
	}
	@Transactional
	@Override
	public List<CommandeVoiture> listerCommandeValidee() {
		
		List<CommandeVoiture> listCommandeVoitures =daoCommandeVoiture.findAll();
		List<CommandeVoiture> listCommandeValidee=null;
		List<Devis> listDevis=daoDevis.findAll();
		for(CommandeVoiture commande : listCommandeVoitures){
			for(Devis devis: listDevis) {
				if(devis.getValidationDevis()==true) {
					listCommandeValidee.add(commande);	
				}
		}
		
		}
		
		return listCommandeValidee;
	}
	@Transactional
	@Override
	public List<CommandeVoiture> listerCommandeLivree() {
		// TODO Auto-generated method stub
		return null;
	}

}