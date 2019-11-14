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
import com.garage.bean.FactureEntretien;
import com.garage.service.ServiceDevis;
import com.garage.service.ServiceFactureEntretien;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/facture_entretiens/")
public class FactureEntretienRest {

	@Autowired
	 ServiceFactureEntretien serviceFactureEntretien;
	
	@GetMapping(name = "/")
	public List<FactureEntretien> getall() {
		return serviceFactureEntretien.rechercheFactureEntretien();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody FactureEntretien factureEntretien) {
		//System.out.println(cl.getId());
		serviceFactureEntretien.creerFactureEntretien(factureEntretien);;
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody FactureEntretien factureEntretien) {

		serviceFactureEntretien.modifierFactureEntretien(factureEntretien);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}

}