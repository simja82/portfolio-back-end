package com.portfolio.pov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.portfolio.pov.entities.DeveloperProfile;
import com.portfolio.pov.services.DeveloperProfileService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://pov-portfolio.web.app")
@RequestMapping("developerprofile")
public class DeveloperProfileController {
    
    //Enlazado
    @Autowired
    DeveloperProfileService developerprofileService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<DeveloperProfile> getDeveloperProfiles(){
        return developerprofileService.getDeveloperProfiles();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public DeveloperProfile findDeveloperProfile(@PathVariable Integer id){
        return developerprofileService.findDeveloperProfile(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveDeveloperProfile(@RequestBody DeveloperProfile developerprofile){
        developerprofileService.saveDeveloperProfile(developerprofile);
        return "Muy bien!!! Creaste un nuevo Perfil Developer!!!";
    }
    
    //Editar    
    @PutMapping("/update")
    public String updateDeveloperProfile(@RequestBody DeveloperProfile developerprofile){
        developerprofileService.updateDeveloperProfile(developerprofile);
        return "Ok. Actualizaste el Perfil Developer!!!";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteDeveloperProfile(@PathVariable Integer id){
        developerprofileService.deleteDeveloperProfile(id);
        return "Espero que no te arrepientas... Borraste el Perfil Developer...";
    }    
    
}
