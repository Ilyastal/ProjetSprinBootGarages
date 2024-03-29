package com.garage.controlleur.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garage.bean.CommandeVoiture;
import com.garage.bean.Piece;
import com.garage.bean.Voiture;
import com.garage.service.ServiceCommandeVoiture;
import com.garage.service.ServicePiece;
import com.garage.service.ServiceVoiture;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/commande_voitures/")
public class CommandeVoitureRest {

	@Autowired
	 ServiceCommandeVoiture serviceCommandeVoiture;
	
	@GetMapping(name = "/")
	public List<CommandeVoiture> getall() {
		return serviceCommandeVoiture.rechercheCommandeVoiture();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody CommandeVoiture commandeVoiture) {
		//System.out.println(cl.getId());
		serviceCommandeVoiture.creerCommandeVoiture(commandeVoiture);
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody CommandeVoiture commandeVoiture) {
//		if(serviceclient.rechercherClientId(id) == null) return null;
		serviceCommandeVoiture.modifierCommandeVoiture(commandeVoiture);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}



}