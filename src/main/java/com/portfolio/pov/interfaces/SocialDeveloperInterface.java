package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.SocialDeveloper;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SocialDeveloperInterface extends JpaRepository<SocialDeveloper, Integer>{
    
}
