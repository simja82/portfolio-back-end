package com.portfolio.pov.repositories;

import com.portfolio.pov.entities.AudiovisualSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudiovisualSocialRepository  extends JpaRepository<AudiovisualSocial, Integer>{
    
}