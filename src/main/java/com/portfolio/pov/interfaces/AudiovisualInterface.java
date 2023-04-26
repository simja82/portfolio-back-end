package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Audiovisual;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudiovisualInterface extends JpaRepository<Audiovisual, Integer>{
    
}
