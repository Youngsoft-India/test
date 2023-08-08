package com.onetomany.onetomany.repository;

import com.onetomany.onetomany.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
