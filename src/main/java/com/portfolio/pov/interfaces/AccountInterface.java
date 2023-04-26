package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountInterface extends JpaRepository<Account, Integer>{
    public Account findByEmailAndPassword(String email, String password);
}
