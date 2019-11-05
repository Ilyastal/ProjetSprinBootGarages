package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage.bean.Piece;

/**
 * 
 */
public interface DaoPiece extends JpaRepository<Piece, Integer>{

}