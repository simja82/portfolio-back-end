package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Soft;
import com.portfolio.pov.services.SoftService;

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
@RequestMapping("soft")
public class SoftController {
    
    //Enlazado
    @Autowired
    SoftService softService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Soft> getSofts(){
        return softService.getSofts();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Soft findSoft(@PathVariable int id){
        return softService.findSoft(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveSoft(@RequestBody Soft soft){
        softService.saveSoft(soft);
        return "Muy bien!!! Creaste una nueva Habilidad Blanda!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateSoft(@PathVariable int id, @RequestBody Soft soft){
        softService.updateSoft(id, soft);
        return "Ok. Actualizaste la Habilidad Blanda.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteSoft(@PathVariable int id){
        softService.deleteSoft(id);
        return "Espero que no te arrepientas... Borraste la Habilidad Blanda...";
    }    
}
