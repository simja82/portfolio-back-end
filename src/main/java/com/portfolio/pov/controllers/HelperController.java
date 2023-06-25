package com.portfolio.pov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.portfolio.pov.entities.Helper;
import com.portfolio.pov.services.HelperService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://pov-portfolio.web.app")
@RequestMapping("helper")
public class HelperController {
    
    //Enlazado
    @Autowired
    HelperService helperService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Helper> getHelpers(){
        return helperService.getHelpers();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Helper findHelper(@PathVariable Integer id){
        return helperService.findHelper(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveHelper(@RequestBody Helper helper){
        helperService.saveHelper(helper);
        return "Muy bien!!! Creaste un nuevo Helper!!!";
    }
    
    //Editar    
    @PutMapping("/update")
    public String updateHelper(@RequestBody Helper helper){
        helperService.updateHelper(helper);
        return "Ok. Actualizaste el Helper!!!";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteHelper(@PathVariable Integer id){
        helperService.deleteHelper(id);
        return "Espero que no te arrepientas... Borraste el Helper...";
    }    
    
}
