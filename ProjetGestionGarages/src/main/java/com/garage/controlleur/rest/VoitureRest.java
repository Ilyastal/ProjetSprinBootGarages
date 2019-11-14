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

import com.garage.bean.Voiture;
import com.garage.service.ServiceVoiture;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/voitures/")
public class VoitureRest {

	@Autowired
	 ServiceVoiture serviceVoiture;
	
	@GetMapping(name = "/")
	public List<Voiture> getall() {
		return serviceVoiture.rechercheVoiture();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody Voiture voiture) {
		//System.out.println(cl.getId());
		serviceVoiture.creerVoiture(voiture);;
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody Voiture voiture) {

		serviceVoiture.modifierVoiture(voiture);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}


}