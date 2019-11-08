package com.garage.dao;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.garage.bean.Role;
import com.garage.enums.Fonction;

/**
 * 
 */
public interface DaoRole extends JpaRepository<Role, Integer>{
	@Query(value="select fonction from role where fonction != 'administrateur'", nativeQuery = true) List<Role> findByFonction(Fonction fonction);
}