package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.AudiovisualPresentation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudiovisualPresentationInterface extends JpaRepository<AudiovisualPresentation, Integer>{
    
}