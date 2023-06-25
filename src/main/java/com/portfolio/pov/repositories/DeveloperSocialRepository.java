package com.portfolio.pov.repositories;

import com.portfolio.pov.entities.DeveloperSocial;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DeveloperSocialRepository extends JpaRepository<DeveloperSocial, Integer>{
    
}