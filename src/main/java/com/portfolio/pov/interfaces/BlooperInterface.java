package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Blooper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlooperInterface extends JpaRepository<Blooper, Integer>{
    
}
