package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Technical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TechnicalInterface extends JpaRepository<Technical, Integer>{
    
}
