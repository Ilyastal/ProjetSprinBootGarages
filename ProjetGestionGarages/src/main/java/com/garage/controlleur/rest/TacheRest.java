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

import com.garage.bean.Piece;
import com.garage.bean.Tache;
import com.garage.service.ServiceTache;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/taches/")
public class TacheRest {

	@Autowired
	 ServiceTache servicetache;
	
	@GetMapping(name = "/")
	public List<Tache> getall() {
		return servicetache.rechercheTache();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody Tache tache) {
		//System.out.println(cl.getId());
		servicetache.creerTache(tache);
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody Tache tache) {
//		if(serviceclient.rechercherClientId(id) == null) return null;
		servicetache.modifierTache(tache);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}

}

