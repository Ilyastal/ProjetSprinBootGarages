package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage.bean.FactureEntretien;

/**
 * 
 */
public interface DaoFactureEntretien extends JpaRepository<FactureEntretien, Integer>{

}