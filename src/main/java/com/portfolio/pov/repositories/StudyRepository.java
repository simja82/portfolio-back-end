package com.portfolio.pov.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.pov.entities.Study;

@Repository
public interface StudyRepository extends JpaRepository<Study, Integer>{
    
}
