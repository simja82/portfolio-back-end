package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.SocialDeveloper;
import com.portfolio.pov.services.SocialDeveloperService;

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
@RequestMapping("socialdeveloper")
public class SocialDeveloperController {
    
    //Enlazado
    @Autowired
    SocialDeveloperService socialDeveloperService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<SocialDeveloper> getSocialDevelopers(){
        return socialDeveloperService.getSocialDevelopers();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public SocialDeveloper findSocialDeveloper(@PathVariable int id){
        return socialDeveloperService.findSocialDeveloper(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveSocialDeveloper(@RequestBody SocialDeveloper socialdeveloper){
        socialDeveloperService.saveSocialDeveloper(socialdeveloper);
        return "Muy bien!!! Creaste una nueva Red Social!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateSocialDeveloper(@PathVariable int id, @RequestBody SocialDeveloper socialdeveloper){
        socialDeveloperService.updateSocialDeveloper(id, socialdeveloper);
        return "Ok. Actualizaste la Red Social.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteSocialDeveloper(@PathVariable int id){
        socialDeveloperService.deleteSocialDeveloper(id);
        return "Espero que no te arrepientas... Borraste la Red Social...";
    }    
}
