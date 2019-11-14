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

import com.garage.bean.CommandePiece;
import com.garage.bean.CommandeVoiture;
import com.garage.service.ServiceCommandePiece;
import com.garage.service.ServiceCommandeVoiture;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/commande_pieces/")
public class CommandePieceRest {

	@Autowired
	 ServiceCommandePiece serviceCommandePiece;
	
	@GetMapping(name = "/")
	public List<CommandePiece> getall() {
		return serviceCommandePiece.rechercheCommandePiece();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody CommandePiece commandePiece) {
		//System.out.println(cl.getId());
		serviceCommandePiece.creerCommandePiece(commandePiece);;
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody CommandePiece commandePiece) {
//		if(serviceclient.rechercherClientId(id) == null) return null;
		serviceCommandePiece.modifierCommandePiece(commandePiece);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}

	

}