package com.springboot.Control;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.Entidades.Customer;

public interface CustomerRepository 
                extends JpaRepository<Customer, Integer>{

    
}
