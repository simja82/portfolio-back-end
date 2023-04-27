package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.DeveloperCV;
import com.portfolio.pov.services.DeveloperCVService;

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
@RequestMapping("developercv")
public class DeveloperCVController {
    
    //Enlazado
    @Autowired
    DeveloperCVService developerCVService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<DeveloperCV> getDeveloperCVs(){
        return developerCVService.getDeveloperCVs();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public DeveloperCV findDeveloperCV(@PathVariable int id){
        return developerCVService.findDeveloperCV(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveDeveloperCV(@RequestBody DeveloperCV developercv){
        developerCVService.saveDeveloperCV(developercv);
        return "Muy bien!!! Creaste un nuevo CV Developer!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateDeveloperCV(@PathVariable int id, @RequestBody DeveloperCV developercv){
        developerCVService.updateDeveloperCV(id, developercv);
        return "Ok. Actualizaste el CV Developer.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteDeveloperCV(@PathVariable int id){
        developerCVService.deleteDeveloperCV(id);
        return "Espero que no te arrepientas... Borraste el CV Developer...";
    }    
}
