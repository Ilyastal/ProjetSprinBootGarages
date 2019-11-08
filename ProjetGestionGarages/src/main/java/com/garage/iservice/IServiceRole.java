package com.garage.iservice;

import java.util.List;

import com.garage.bean.Role;

public interface IServiceRole {
	
	public List<Role> rechercheRole();
	public Role rechercherRoleId(final int id);
	public void creerRole(final Role role);
	public void modifierRole(final Role role);
	public void supprimerRole(final Role role);

}