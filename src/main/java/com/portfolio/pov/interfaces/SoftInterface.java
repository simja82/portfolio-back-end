package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Soft;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SoftInterface extends JpaRepository<Soft, Integer>{
    
}
