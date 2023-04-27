package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Comment;
import com.portfolio.pov.services.CommentService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://pov-portfolio.web.app/")
@RequestMapping("comment")
public class CommentController {
    
    //Enlazado
    @Autowired
    CommentService commentService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Comment> getComments(){
        return commentService.getComments();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Comment findComment(@PathVariable int id){
        return commentService.findComment(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveComment(@RequestBody Comment comment){
        commentService.saveComment(comment);
        return "Muy bien!!! Creaste un nuevo Comentario!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateComment(@PathVariable int id, @RequestBody Comment comment){
        commentService.updateComment(id, comment);
        return "Ok. Actualizaste el Comentario.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteComment(@PathVariable int id){
        commentService.deleteComment(id);
        return "Espero que no te arrepientas... Borraste el Comentario...";
    }    
}
