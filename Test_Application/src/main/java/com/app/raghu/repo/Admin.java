package com.app.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Admin extends JpaRepository<Admin, Integer>{
	
}
