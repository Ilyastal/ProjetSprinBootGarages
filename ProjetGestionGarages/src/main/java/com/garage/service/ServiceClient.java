package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.Client;
import com.garage.dao.DaoClient;
import com.garage.iservice.IServiceClient;

/**
 * 
 */
@Service
public class ServiceClient implements IServiceClient {
	@Autowired DaoClient clientDao;
	/**
	 * Default constructor
	 */
	public ServiceClient() {
	}
	@Transactional
	@Override
	public List<Client> rechercheClient() {
		// TODO Auto-generated method stub
		return clientDao.findAll();
	}
	@Transactional
	@Override
	public Client rechercherClientId(int id) {
		// TODO Auto-generated method stub
		return clientDao.findById(id).get();
	}
	@Transactional
	@Override
	public void creerClient(Client client) {
		clientDao.save(client);
		
	}
	@Transactional
	@Override
	public void modifierClient(Client client) {
		clientDao.save(client);
		
	}
	@Transactional
	@Override
	public void supprimerClient(Client client) {
		clientDao.deleteById(client.getId());
		
	}

}