package com.garage.controlleur;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.garage.bean.Client;

import com.garage.controlleur.form.ClientForm;

import com.garage.iservice.IServiceClient;
import com.garage.enums.Genre;

/**
 * 
 */
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
        client.setSexe(Genre.valueOf(clientform.getSexe()));
        client.setTelephone(clientform.getTelephone());
        client.setVille(clientform.getVille());
        return client;
    }
	
	
	
	
	@GetMapping("/Client")
	public String Afficher(Model model) {
	     final List<Client> lClient = serviceClient.rechercheClient();
	        model.addAttribute("listClient", lClient); //attribut du fichier html
	        model.addAttribute("action", "CreerClient");
	        if(model.containsAttribute("clientForm") == false) {
	        	ClientForm clientForm = new ClientForm();
	        	clientForm.setId(0);
	            model.addAttribute("clientForm", clientForm);
	        }
	        return "listClient"; //correspond au fichier html
	    }
	
	
	@PostMapping("/Client")
	public String ajoutClient( 
			@Valid @ModelAttribute(name = "clientForm") ClientForm clientForm,
			BindingResult presult,
			Model model)
	{
		if(!presult.hasErrors()) {
			try
			{
				Client client = convertForm(clientForm);
				serviceClient.creerClient(client);
			}
			catch(Exception e) {
				System.err.println(e.getMessage());
			}
		}
		return this.Afficher(model);
	}
}