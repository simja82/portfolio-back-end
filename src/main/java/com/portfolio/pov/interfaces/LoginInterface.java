package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Login;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginInterface extends JpaRepository<Login, Integer>{
    
}
