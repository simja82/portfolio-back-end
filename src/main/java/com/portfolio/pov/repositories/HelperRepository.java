package com.portfolio.pov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.pov.entities.Helper;

@Repository
public interface HelperRepository extends JpaRepository<Helper, Integer>{
    
}
