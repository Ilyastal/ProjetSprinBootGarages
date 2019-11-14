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

import com.garage.bean.FactureEntretien;
import com.garage.bean.Fiche;
import com.garage.service.ServiceFactureEntretien;
import com.garage.service.ServiceFiche;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/fiches/")
public class FicheRest {

	@Autowired
	 ServiceFiche serviceFiche;
	
	@GetMapping(name = "/")
	public List<Fiche> getall() {
		return serviceFiche.rechercheFiche();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody Fiche fiche) {
		//System.out.println(cl.getId());
		serviceFiche.creerFiche(fiche);
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody Fiche fiche) {

		serviceFiche.modifierFiche(fiche);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}

	

}