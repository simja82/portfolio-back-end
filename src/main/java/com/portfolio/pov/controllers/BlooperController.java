package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Blooper;
import com.portfolio.pov.services.BlooperService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
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
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://pov-portfolio.web.app/")
@RequestMapping("blooper")
public class BlooperController {
    
    //Enlazado
    @Autowired
    BlooperService blooperService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Blooper> getBloopers(){
        return blooperService.getBloopers();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Blooper findBlooper(@PathVariable int id){
        return blooperService.findBlooper(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveBlooper(@RequestBody Blooper blooper){
        blooperService.saveBlooper(blooper);
        return "Muy bien!!! Creaste un nuevo blooper!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateBlooper(@PathVariable int id, @RequestBody Blooper blooper){
        blooperService.updateBlooper(id, blooper);
        return "Ok. Actualizaste el blooper.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteBlooper(@PathVariable int id){
        blooperService.deleteBlooper(id);
        return "Espero que no te arrepientas... Borraste el blooper...";
    }    
}
