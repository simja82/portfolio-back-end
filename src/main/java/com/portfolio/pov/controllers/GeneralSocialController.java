package com.portfolio.pov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.portfolio.pov.entities.GeneralSocial;
import com.portfolio.pov.services.GeneralSocialService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://pov-portfolio.web.app")
@RequestMapping("generalsocial")
public class GeneralSocialController {
    
    //Enlazado
    @Autowired
    GeneralSocialService generalsocialService;

    //Listar
    @GetMapping("/list")
    @ResponseBody 
    public List<GeneralSocial> getGeneralSocials(){
        return generalsocialService.getGeneralSocials();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public GeneralSocial findGeneralSocial(@PathVariable Integer id){
        return generalsocialService.findGeneralSocial(id);  
    }
    
    //Crear
    @PostMapping ("/new")
    @ResponseBody
    public String saveGeneralSocial(@RequestBody GeneralSocial generalsocial){
        generalsocialService.saveGeneralSocial(generalsocial);
        return "Muy bien!!! Creaste una nueva Red General!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateGeneralSocial(@RequestBody GeneralSocial generalsocial){
        generalsocialService.updateGeneralSocial(generalsocial);
        return "Ok. Actualizaste la Red General!!!";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteGeneralSocial(@PathVariable int id){
        generalsocialService.deleteGeneralSocial(id);
        return "Espero que no te arrepientas... Borraste la Red General...";
    }

}
