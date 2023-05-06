package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Study;
import com.portfolio.pov.services.StudyService;

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
    /*
    @PutMapping("/update/{id}")   
    public String updateStudy(@PathVariable int id, @RequestBody Study study){
        studyService.updateStudy(id, study);
        return "Ok. Actualizaste el estudio.";
    }
    */
    
    @PutMapping("/update")
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
