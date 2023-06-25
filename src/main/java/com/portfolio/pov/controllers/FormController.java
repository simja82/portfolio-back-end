package com.portfolio.pov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.portfolio.pov.entities.Form;
import com.portfolio.pov.services.FormService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://pov-portfolio.web.app")
@RequestMapping("form")
public class FormController {
    
    //Enlazado
    @Autowired
    FormService formService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Form> getForms(){
        return formService.getForms();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Form findForm(@PathVariable Integer id){
        return formService.findForm(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveForm(@RequestBody Form form){
        formService.saveForm(form);
        return "Muy bien!!! Creaste un nuevo Form!!!";
    }
    
    //Editar    
    @PutMapping("/update")
    public String updateForm(@RequestBody Form form){
        formService.updateForm(form);
        return "Ok. Actualizaste el Form!!!";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteForm(@PathVariable Integer id){
        formService.deleteForm(id);
        return "Espero que no te arrepientas... Borraste el Form...";
    }    
    
}
