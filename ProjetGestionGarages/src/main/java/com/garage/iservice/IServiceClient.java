package com.garage.iservice;

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