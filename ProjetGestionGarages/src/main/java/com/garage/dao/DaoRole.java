package com.garage.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.garage.bean.Role;

public interface DaoRole extends JpaRepository<Role, Integer>{
	@Query(value="FROM Role r WHERE r.fonction != 'ADMINISTRATEUR'") List<Role> findExceptAdmin();
}