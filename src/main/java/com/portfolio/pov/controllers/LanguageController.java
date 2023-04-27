package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Language;
import com.portfolio.pov.services.LanguageService;

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
@RequestMapping("language")
public class LanguageController {
    
    //Enlazado
    @Autowired
    LanguageService languageService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Language> getLanguages(){
        return languageService.getLanguages();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Language findLanguage(@PathVariable int id){
        return languageService.findLanguage(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveLanguage(@RequestBody Language language){
        languageService.saveLanguage(language);
        return "Muy bien!!! Creaste un nuevo Idioma!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateLanguage(@PathVariable int id, @RequestBody Language language){
        languageService.updateLanguage(id, language);
        return "Ok. Actualizaste el Idioma.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteLanguage(@PathVariable int id){
        languageService.deleteLanguage(id);
        return "Espero que no te arrepientas... Borraste el Idioma...";
    }    
}
