package com.portfolio.pov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.pov.entities.Form;

@Repository
public interface FormRepository extends JpaRepository<Form, Integer>{
    
}
