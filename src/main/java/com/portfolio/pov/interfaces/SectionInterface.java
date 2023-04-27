package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Section;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SectionInterface extends JpaRepository<Section, Integer>{
    
}
