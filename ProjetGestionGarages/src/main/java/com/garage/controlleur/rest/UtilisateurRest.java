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

import com.garage.bean.Utilisateur;
import com.garage.service.ServiceUtilisateur;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/utilisateurs/")
public class UtilisateurRest {

	@Autowired
	 ServiceUtilisateur serviceUtilisateur;
	
	@GetMapping(name = "/")
	public List<Utilisateur> getall() {
		return serviceUtilisateur.rechercheUtilisateur();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody Utilisateur utilisateur) {
		//System.out.println(cl.getId());
		serviceUtilisateur.creerUtilisateur(utilisateur);
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody Utilisateur utilisateur) {
//		if(serviceclient.rechercherClientId(id) == null) return null;
		serviceUtilisateur.modifierUtilisateur(utilisateur);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}

	

}