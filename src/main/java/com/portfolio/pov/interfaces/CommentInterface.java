package com.portfolio.pov.interfaces;

import com.portfolio.pov.entities.Comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentInterface extends JpaRepository<Comment, Integer>{
    
}
