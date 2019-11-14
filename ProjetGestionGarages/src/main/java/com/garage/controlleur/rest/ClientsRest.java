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

import com.garage.bean.Client;
import com.garage.service.ServiceClient;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/clients/")
public class ClientsRest {
	@Autowired
	 ServiceClient serviceclient;
	
	@GetMapping(name = "/")
	public List<Client> getall() {
		return serviceclient.rechercheClient();
	}
	
	
	@PostMapping(value = "/")
	public void add(@RequestBody Client cl) {
		System.out.println(cl.getId());
		serviceclient.creerClient(cl);
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody Client cl) {
//		if(serviceclient.rechercherClientId(id) == null) return null;
		serviceclient.modifierClient(cl);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}
}
