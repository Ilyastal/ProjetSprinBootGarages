package com.garage.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.garage.bean.Fiche;

/**
 * 
 */
public interface DaoFiche extends JpaRepository<Fiche, Integer> {
	 @Query(value="FROM Fiche f WHERE f.validation = false") List<Fiche> findFiche();
}