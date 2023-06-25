package com.portfolio.pov.repositories;

import com.portfolio.pov.entities.GeneralSocial;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeneralSocialRepository extends JpaRepository<GeneralSocial, Integer>{
    
}