package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Study;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudyInterface extends JpaRepository<Study, Integer>{
    
}
