package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.AudiovisualProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudiovisualProfileInterface extends JpaRepository<AudiovisualProfile, Integer>{
    
}