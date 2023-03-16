package com.jacqueline.artwebstore.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jacqueline.artwebstore.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {

    
    
    
}
