package com.portfolio.pov.services;

import com.portfolio.pov.entities.Comment;
import com.portfolio.pov.interfaces.CommentInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CommentService {
    
    //Enlazado
    @Autowired  
    CommentInterface commentInterface;

    //Listar
    public List<Comment> getComments() {
        return commentInterface.findAll();
    }
    
    //Encontrar
    public Comment findComment(Integer id) {
        return commentInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveComment(Comment comment) {
        commentInterface.save(comment);  
    }
    
    //Editar
    public void updateComment(int id, Comment newComment) {
        Optional<Comment> optionalComment = commentInterface.findById(id);
        if (optionalComment.isPresent()) {
            Comment existingComment = optionalComment.get();
            existingComment.setIcon(newComment.getIcon());
            existingComment.setOne(newComment.getOne());
            existingComment.setTwo(newComment.getTwo());
            existingComment.setFullname(newComment.getFullname());
            existingComment.setPosition(newComment.getPosition());                     
            commentInterface.save(existingComment);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un Comentario inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteComment(Integer id) {
        commentInterface.deleteById(id);
    }    
}
