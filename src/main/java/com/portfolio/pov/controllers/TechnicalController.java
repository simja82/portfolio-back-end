package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Technical;
import com.portfolio.pov.services.TechnicalService;

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
@RequestMapping("technical")
public class TechnicalController {
    
    //Enlazado
    @Autowired
    TechnicalService technicalService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Technical> getTechnicals(){
        return technicalService.getTechnicals();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Technical findTechnical(@PathVariable int id){
        return technicalService.findTechnical(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveTechnical(@RequestBody Technical technical){
        technicalService.saveTechnical(technical);
        return "Muy bien!!! Creaste una nueva Habilidad Técnica!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateTechnical(@PathVariable int id, @RequestBody Technical technical){
        technicalService.updateTechnical(id, technical);
        return "Ok. Actualizaste la Habilidad Técnica.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteTechnical(@PathVariable int id){
        technicalService.deleteTechnical(id);
        return "Espero que no te arrepientas... Borraste la Habilidad Técnica...";
    }    
}
