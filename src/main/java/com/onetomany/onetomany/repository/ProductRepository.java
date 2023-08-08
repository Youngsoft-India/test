package com.onetomany.onetomany.repository;

import com.onetomany.onetomany.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
}
