package com.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.garage.bean.Client;

/**
 * 
 */
public interface DaoClient extends JpaRepository<Client, Integer>  {

}