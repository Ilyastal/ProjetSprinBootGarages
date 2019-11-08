package com.garage.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.garage.bean.Role;
import com.garage.dao.DaoRole;
import com.garage.iservice.IServiceRole;

@Service
public class ServiceRole implements IServiceRole {
	
	@Autowired
	DaoRole daoRole;
	
	@Transactional
	@Override
	public Role rechercherRoleId(int id) {
		return daoRole.findById(id).get();
	}

}