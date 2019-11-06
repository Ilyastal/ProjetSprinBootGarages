package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage.bean.Fiche;

/**
 * 
 */
public interface DaoFiche extends JpaRepository<Fiche, Integer> {

}