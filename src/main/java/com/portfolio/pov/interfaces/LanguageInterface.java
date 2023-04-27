package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageInterface extends JpaRepository<Language, Integer>{
    
}
