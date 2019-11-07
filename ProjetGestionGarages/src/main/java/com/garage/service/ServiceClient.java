package com.garage.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.garage.bean.Client;
import com.garage.iservice.IServiceClient;

/**
 * 
 */
@Service
public class ServiceClient implements IServiceClient {

	/**
	 * Default constructor
	 */
	public ServiceClient() {
	}

	@Override
	public List<Client> rechercheClient() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Client rechercherClientId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void creerClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifierClient(Client client) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void supprimerClient(Client client) {
		// TODO Auto-generated method stub
		
	}

}