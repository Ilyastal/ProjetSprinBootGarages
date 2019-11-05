package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage.bean.CommandeVoiture;

/**
 * 
 */
public interface DaoCommandeVoiture extends JpaRepository<CommandeVoiture, Integer> {

}