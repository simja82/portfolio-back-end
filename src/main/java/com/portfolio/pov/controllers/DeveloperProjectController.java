package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.DeveloperProject;
import com.portfolio.pov.services.DeveloperProjectService;

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
@RequestMapping("developerproject")
public class DeveloperProjectController {
    
    //Enlazado
    @Autowired
    DeveloperProjectService developerProjectService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<DeveloperProject> getDeveloperProjects(){
        return developerProjectService.getDeveloperProjects();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public DeveloperProject findDeveloperProject(@PathVariable int id){
        return developerProjectService.findDeveloperProject(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveDeveloperProject(@RequestBody DeveloperProject developerproject){
        developerProjectService.saveDeveloperProject(developerproject);
        return "Muy bien!!! Creaste un nuevo Proyecto de Desarrollador!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateDeveloperProject(@PathVariable int id, @RequestBody DeveloperProject developerproject){
        developerProjectService.updateDeveloperProject(id, developerproject);
        return "Ok. Actualizaste el Proyecto de Desarrollador.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteDeveloperProject(@PathVariable int id){
        developerProjectService.deleteDeveloperProject(id);
        return "Espero que no te arrepientas... Borraste el Proyecto de Desarrollador...";
    }    
}
