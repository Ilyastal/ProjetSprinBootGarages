package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage.bean.Voiture;

/**
 * 
 */
public interface DaoVoiture extends JpaRepository<Voiture, Integer>{

}