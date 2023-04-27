package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.DeveloperProfile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperProfileInterface extends JpaRepository<DeveloperProfile, Integer>{
    
}
