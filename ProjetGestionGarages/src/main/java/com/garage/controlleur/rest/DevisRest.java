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

import com.garage.bean.Devis;
import com.garage.bean.Utilisateur;
import com.garage.service.ServiceDevis;
import com.garage.service.ServiceUtilisateur;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/devis/")
public class DevisRest {

	@Autowired
	 ServiceDevis serviceDevis;
	
	@GetMapping(name = "/")
	public List<Devis> getall() {
		return serviceDevis.rechercheDevis();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody Devis devis) {
		//System.out.println(cl.getId());
		serviceDevis.creerDevis(devis);
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody Devis devis) {
//		if(serviceclient.rechercherClientId(id) == null) return null;
		serviceDevis.modifierDevis(devis);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}

	

}