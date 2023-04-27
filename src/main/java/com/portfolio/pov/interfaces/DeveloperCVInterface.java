package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.DeveloperCV;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperCVInterface extends JpaRepository<DeveloperCV, Integer>{
    
}
