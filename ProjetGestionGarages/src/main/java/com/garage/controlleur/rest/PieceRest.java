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
import com.garage.service.ServicePiece;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/pieces/")
public class PieceRest {

	@Autowired
	 ServicePiece servicepiece;
	
	@GetMapping(name = "/")
	public List<Piece> getall() {
		return servicepiece.recherchePiece();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody Piece piece) {
		//System.out.println(cl.getId());
		servicepiece.ajouterPiece(piece);
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody Piece piece) {
//		if(serviceclient.rechercherClientId(id) == null) return null;
		servicepiece.modifierPiece(piece);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}

	
}