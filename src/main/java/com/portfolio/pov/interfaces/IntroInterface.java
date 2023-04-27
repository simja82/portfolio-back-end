package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Intro;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IntroInterface extends JpaRepository<Intro, Integer>{
    
}
