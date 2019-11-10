package com.garage.controlleur.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.garage.bean.Client;
import com.garage.dao.DaoClient;

/**
 * 
 */
@RestController
@RequestMapping(name = "client")
public class ClientRest {
@Autowired
DaoClient serviceclient;
	
	@GetMapping
	public List<Client> getall() {
		return serviceclient.findAll();
	}
	
	@PostMapping
	public Client add(Client cl) {
		return serviceclient.save(cl);
	}
	
	

}