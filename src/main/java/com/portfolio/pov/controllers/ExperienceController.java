package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Experience;
import com.portfolio.pov.services.ExperienceService;

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
@RequestMapping("experience")
public class ExperienceController {
    
    //Enlazado
    @Autowired
    ExperienceService experienceService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Experience> getExperiences(){
        return experienceService.getExperiences();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Experience findExperience(@PathVariable int id){
        return experienceService.findExperience(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveExperience(@RequestBody Experience experience){
        experienceService.saveExperience(experience);
        return "Muy bien!!! Creaste una nueva Experiencia!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateExperience(@PathVariable int id, @RequestBody Experience experience){
        experienceService.updateExperience(id, experience);
        return "Ok. Actualizaste la Experiencia.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteExperience(@PathVariable int id){
        experienceService.deleteExperience(id);
        return "Espero que no te arrepientas... Borraste la Experiencia...";
    }    
}
