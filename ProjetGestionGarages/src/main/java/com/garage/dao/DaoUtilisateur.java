package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage.bean.Utilisateur;

/**
 * 
 */
public interface DaoUtilisateur extends JpaRepository<Utilisateur, Integer>{

}