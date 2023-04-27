package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.DeveloperProject;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperProjectInterface extends JpaRepository<DeveloperProject, Integer>{
    
}
