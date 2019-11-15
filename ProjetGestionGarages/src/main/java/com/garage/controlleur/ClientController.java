package com.garage.controlleur;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.garage.bean.Client;
import com.garage.controlleur.form.ClientForm;
import com.garage.enums.Genre;
import com.garage.iservice.IServiceClient;

@Controller
public class ClientController {
	
	@Autowired
	private IServiceClient serviceClient;
	
	private Client convertForm(ClientForm clientform) throws Exception {
		Client client = new Client();
		client.setId(clientform.getId());
		client.setNom(clientform.getNom());
		client.setPrenom(clientform.getPrenom());
        client.setAdresse(clientform.getAdresse());
        client.setCodePostal(clientform.getCodePostal());
        client.setSexe(clientform.getSexe());
        client.setTelephone(clientform.getTelephone());
        client.setVille(clientform.getVille());
        return client;
    }
	
	@GetMapping("/Clients/Ajouter")
	public String afficher(Model model) {
		model.addAttribute("listClient", serviceClient.rechercheClient()); //attribut du fichier html
		model.addAttribute("possibleGenre", Genre.values());
		
		model.addAttribute("action", "Ajout");
		if(!model.containsAttribute("clientAdd")) {
			ClientForm clientForm = new ClientForm();
			clientForm.setId(0);
			
			model.addAttribute("clientAdd", clientForm);
		}
		
		return "listClient"; //correspond au fichier html
	}
	
	@GetMapping("/Clients/Modifier/{id}")
	public String afficher(@PathVariable final Integer id, Model model) {
		model.addAttribute("listClient", serviceClient.rechercheClient()); //attribut du fichier html
		model.addAttribute("possibleGenre", Genre.values());
		
		model.addAttribute("action", "Modification");
		if(!model.containsAttribute("clientModif")) {
			ClientForm clientForm = new ClientForm();
			
			if(id == null || id < 1) {
				return this.afficher(model);
			}
			
			final Client cli = serviceClient.rechercherClientId(id);
			clientForm.setId(cli.getId());
			clientForm.setNom(cli.getNom());
			clientForm.setPrenom(cli.getPrenom());
			clientForm.setAdresse(cli.getAdresse());
			clientForm.setCodePostal(cli.getCodePostal());
			clientForm.setVille(cli.getVille());
			clientForm.setSexe(cli.getSexe());
			clientForm.setTelephone(cli.getTelephone());
			
			model.addAttribute("clientModif", clientForm);
		}
		
		return "listClient"; //correspond au fichier html
	}
	
	@PostMapping("/Clients/Ajouter")
	public String ajoutClient(
			@Valid @ModelAttribute(name = "clientAdd") ClientForm clientForm,
			BindingResult clientResult,
			Model model)
	{
		if(!clientResult.hasErrors()) {
			try {
				Client cli = convertForm(clientForm);
				serviceClient.creerClient(cli);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	}
	
	@PostMapping("/Clients/Modifier")
	public String modifClient(
			@Valid @ModelAttribute(name = "clientModif") ClientForm clientForm,
			BindingResult clientResult,
			Model model)
	{
		if(!clientResult.hasErrors()) {
			try {
				Client cli = convertForm(clientForm);
				serviceClient.modifierClient(cli);
				
			} catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		
		return this.afficher(model);
	}
}