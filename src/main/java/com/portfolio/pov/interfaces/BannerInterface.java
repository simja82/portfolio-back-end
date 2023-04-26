package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Banner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BannerInterface extends JpaRepository<Banner, Integer>{
    
}
