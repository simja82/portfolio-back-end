package com.portfolio.pov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.portfolio.pov.entities.DeveloperSocial;
import com.portfolio.pov.services.DeveloperSocialService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://pov-portfolio.web.app")
@RequestMapping("developersocial")
public class DeveloperSocialController {
    
    //Enlazado
    @Autowired
    DeveloperSocialService developersocialService;

    //Listar
    @GetMapping("/list")
    @ResponseBody 
    public List<DeveloperSocial> getDeveloperSocials(){
        return developersocialService.getDeveloperSocials();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public DeveloperSocial findDeveloperSocial(@PathVariable Integer id){
        return developersocialService.findDeveloperSocial(id);  
    }
    
    //Crear
    @PostMapping ("/new")
    @ResponseBody
    public String saveDeveloperSocial(@RequestBody DeveloperSocial developersocial){
        developersocialService.saveDeveloperSocial(developersocial);
        return "Muy bien!!! Creaste una nueva Red Developer!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateDeveloperSocial(@RequestBody DeveloperSocial developersocial){
        developersocialService.updateDeveloperSocial(developersocial);
        return "Ok. Actualizaste la Red Developer!!!";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteDeveloperSocial(@PathVariable int id){
        developersocialService.deleteDeveloperSocial(id);
        return "Espero que no te arrepientas... Borraste la Red Developer...";
    }

}
