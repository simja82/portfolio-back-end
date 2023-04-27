package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.BlooperCredit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BlooperCreditInterface extends JpaRepository<BlooperCredit, Integer>{
    
}
