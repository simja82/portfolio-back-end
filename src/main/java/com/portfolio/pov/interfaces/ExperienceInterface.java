package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Experience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExperienceInterface extends JpaRepository<Experience, Integer>{
    
}
