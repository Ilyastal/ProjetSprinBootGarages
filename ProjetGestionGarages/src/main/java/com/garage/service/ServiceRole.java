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
	private DaoRole roleDao;
	
	@Transactional
	@Override
	public List<Role> rechercheRole() {
		
		return roleDao.findAll();
	}

	@Transactional
	@Override
	public Role rechercherRoleId(int id) {
		
		return roleDao.findById(id).get();
	}

	@Transactional
	@Override
	public void creerRole(Role role) {
		roleDao.save(role);
		
	}

	@Transactional
	@Override
	public void modifierRole(Role role) {
		roleDao.save(role);
		
	}

	@Transactional
	@Override
	public void supprimerRole(Role role) {
		roleDao.deleteById(role.getId());
		
	}

}