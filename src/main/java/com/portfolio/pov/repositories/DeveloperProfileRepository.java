package com.portfolio.pov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.pov.entities.DeveloperProfile;

@Repository
public interface DeveloperProfileRepository extends JpaRepository<DeveloperProfile, Integer>{
    
}
