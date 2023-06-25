package com.portfolio.pov.repositories;

import com.portfolio.pov.entities.Button;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ButtonRepository  extends JpaRepository<Button, Integer>{
    
}