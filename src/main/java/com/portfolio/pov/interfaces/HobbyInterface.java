package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Hobby;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HobbyInterface extends JpaRepository<Hobby, Integer>{
    
}
