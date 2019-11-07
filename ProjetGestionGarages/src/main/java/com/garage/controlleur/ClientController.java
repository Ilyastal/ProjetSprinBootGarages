package com.garage.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.garage.bean.Client;
import com.garage.controlleur.form.ClientForm;
import com.garage.iservice.IServiceClient;

/**
 * 
 */
@Controller
public class ClientController {

	public ClientController() {
	}
	@Autowired
	private IServiceClient serviceClient;
	
	@GetMapping("/Client")
	public String Afficher(Model model) {
	     final List<Client> lClient = serviceClient.rechercheClient();
	        model.addAttribute("listlClient", lClient); //attribut du fichier html
	        model.addAttribute("action", "CreerClient");
	        if(model.containsAttribute("clientForm") == false) {
	        	ClientForm clientForm = new ClientForm();
	        	clientForm.setId(0);
	            model.addAttribute("clientForm", clientForm);
	        }
	        return "listlClient"; //correspond au fichier html
	    }
}