package com.garage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.garage.bean.CommandeVoiture;

/**
*
*/
public interface DaoCommandeVoiture extends JpaRepository<CommandeVoiture, Integer> {
   @Query(value="FROM CommandeVoiture c WHERE c.dateReception IS NULL") List<CommandeVoiture> findCommande();
}