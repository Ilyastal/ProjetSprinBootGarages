package com.garage.iservice;

import java.util.List;

import com.garage.bean.Client;

import com.garage.bean.Client;

/**
 * 
 */
public interface IServiceClient {
	public List<Client> rechercheClient();
	public Client rechercherClientId(final int id);
	public void creerClient(final Client client);
	public void modifierClient(final Client client);
	public void supprimerClient(final Client client);
}