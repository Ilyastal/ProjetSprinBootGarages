package com.garage.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.Role;
import com.garage.dao.DaoRole;
import com.garage.iservice.IServiceRole;

@Service
public class ServiceRole implements IServiceRole {

	@Autowired
	private DaoRole daoRole;
	
	@Transactional
	@Override
	public List<Role> rechercheRole() {
		
		return daoRole.findAll();
	}

	@Transactional
	@Override
	public Role rechercherRoleId(int id) {
		
		return daoRole.findById(id).get();
	}

	@Transactional
	@Override
	public void creerRole(Role role) {
		daoRole.save(role);
		
	}

	@Transactional
	@Override
	public void modifierRole(Role role) {
		daoRole.save(role);
		
	}

	@Transactional
	@Override
	public void supprimerRole(Role role) {
		daoRole.deleteById(role.getId());
		
	}

}