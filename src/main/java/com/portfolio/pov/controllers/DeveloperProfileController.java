package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.DeveloperProfile;
import com.portfolio.pov.services.DeveloperProfileService;

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
@RequestMapping("developerprofile")
public class DeveloperProfileController {
    
    //Enlazado
    @Autowired
    DeveloperProfileService developerProfileService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<DeveloperProfile> getDeveloperProfiles(){
        return developerProfileService.getDeveloperProfiles();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public DeveloperProfile findDeveloperProfile(@PathVariable int id){
        return developerProfileService.findDeveloperProfile(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveDeveloperProfile(@RequestBody DeveloperProfile developerprofile){
        developerProfileService.saveDeveloperProfile(developerprofile);
        return "Muy bien!!! Creaste un nuevo Perfil Developer!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateDeveloperProfile(@PathVariable int id, @RequestBody DeveloperProfile developerprofile){
        developerProfileService.updateDeveloperProfile(id, developerprofile);
        return "Ok. Actualizaste el Perfil Developer.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteDeveloperProfile(@PathVariable int id){
        developerProfileService.deleteDeveloperProfile(id);
        return "Espero que no te arrepientas... Borraste el Perfil Developer...";
    }    
}

