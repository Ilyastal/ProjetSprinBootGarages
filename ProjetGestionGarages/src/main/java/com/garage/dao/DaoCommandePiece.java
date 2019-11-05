package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage.bean.CommandePiece;

/**
 * 
 */
public interface DaoCommandePiece extends JpaRepository<CommandePiece, Integer> {

}