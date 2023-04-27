package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Contact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactInterface extends JpaRepository<Contact, Integer>{
    
}
