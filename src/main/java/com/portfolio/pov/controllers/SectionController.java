package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Section;
import com.portfolio.pov.services.SectionService;

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
@RequestMapping("section")
public class SectionController {
    
    //Enlazado
    @Autowired
    SectionService sectionService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Section> getSections(){
        return sectionService.getSections();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Section findSection(@PathVariable int id){
        return sectionService.findSection(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveSection(@RequestBody Section section){
        sectionService.saveSection(section);
        return "Muy bien!!! Creaste una nueva Sección!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateSection(@PathVariable int id, @RequestBody Section section){
        sectionService.updateSection(id, section);
        return "Ok. Actualizaste la Sección.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteSection(@PathVariable int id){
        sectionService.deleteSection(id);
        return "Espero que no te arrepientas... Borraste la Sección...";
    }    
}
