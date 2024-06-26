package com.app.raghu.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.raghu.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer>{
	

}
