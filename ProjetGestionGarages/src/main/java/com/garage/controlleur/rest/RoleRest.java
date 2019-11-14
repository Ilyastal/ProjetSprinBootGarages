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

import com.garage.bean.Fiche;
import com.garage.bean.Role;
import com.garage.service.ServiceFiche;
import com.garage.service.ServiceRole;

/**
 * 
 */
@RestController
@CrossOrigin
@RequestMapping("/Rest/roles/")
public class RoleRest {

	@Autowired
	 ServiceRole serviceRole;
	
	@GetMapping(name = "/")
	public List<Role> getall() {
		return serviceRole.rechercheRole();
	}
	
	@PostMapping(value = "/")
	public void add(@RequestBody Role role) {
		//System.out.println(cl.getId());
		serviceRole.creerRole(role);
	}
	@PutMapping(value = "/{id}")
	public void modifier(@PathVariable Integer id,@RequestBody Role role) {

		serviceRole.modifierRole(role);
	}
//	@DeleteMapping(value= "/clients/{id}")
//	public void modifier(@PathVariable Integer id) throws Exception {
//		serviceclient.desactiverClient();
//	}

	

}