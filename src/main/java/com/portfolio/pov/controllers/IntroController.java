package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Intro;
import com.portfolio.pov.services.IntroService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://pov-portfolio.web.app/")
@RequestMapping("intro")
public class IntroController {
    
    //Enlazado
    @Autowired
    IntroService introService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Intro> getIntros(){
        return introService.getIntros();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Intro findIntro(@PathVariable Long id){
        return introService.findIntro(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveIntro(@RequestBody Intro intro){
        introService.saveIntro(intro);
        return "Muy bien!!! Creaste una nueva Intro!!!";
    }
    
    //Editar    
    @PutMapping("/update")
    public String updateIntro(@RequestBody Intro intro){
        introService.updateIntro(intro);
        return "Ok. Actualizaste la Intro!!!";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteIntro(@PathVariable Long id){
        introService.deleteIntro(id);
        return "Espero que no te arrepientas... Borraste la Intro...";
    }    
    
}
