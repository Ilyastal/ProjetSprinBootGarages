package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage.bean.Tache;

/**
 * 
 */
public interface DaoTache extends JpaRepository<Tache, Integer> {

}