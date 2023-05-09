package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Study;
import com.portfolio.pov.services.StudyService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://pov-portfolio.web.app/")
@RequestMapping("study")
public class StudyController {
    
    //Enlazado
    @Autowired
    StudyService studyService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Study> getStudies(){
        return studyService.getStudies();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Study findStudy(@PathVariable Long id){
        return studyService.findStudy(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveStudy(@RequestBody Study study){
        studyService.saveStudy(study);
        return "Muy bien!!! Creaste un nuevo Estudio!!!";
    }
    
    //Editar    
    @PutMapping("/update/{id}")   
    public String updateStudy(@RequestBody Study study){
        studyService.updateStudy(study);
        return "Ok. Actualizaste el Estudio!!!";
    }
     
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteStudy(@PathVariable Long id){
        studyService.deleteStudy(id);
        return "Espero que no te arrepientas... Borraste el Estudio...";
    }  
    
}
