package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.garage.bean.Utilisateur;

/**
 * 
 */
public interface DaoUtilisateur extends JpaRepository<Utilisateur, Integer>{
	
	@Query(value="SELECT * FROM Utilisateur u WHERE u.user= ?1 AND u.password = ?2  ", nativeQuery = true)
	Utilisateur findLogin(String user, String password);

}