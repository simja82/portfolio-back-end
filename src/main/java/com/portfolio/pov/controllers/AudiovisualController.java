package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Audiovisual;
import com.portfolio.pov.services.AudiovisualService;

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
@RequestMapping("audiovisual")
public class AudiovisualController {
    
    //Enlazado
    @Autowired
    AudiovisualService audiovisualService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Audiovisual> getAudiovisuals(){
        return audiovisualService.getAudiovisuals();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Audiovisual findAudiovisual(@PathVariable int id){
        return audiovisualService.findAudiovisual(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveAudiovisual(@RequestBody Audiovisual audiovisual){
        audiovisualService.saveAudiovisual(audiovisual);
        return "Muy bien!!! Creaste un nuevo Audiovisual!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateAudiovisual(@PathVariable int id, @RequestBody Audiovisual audiovisual){
        audiovisualService.updateAudiovisual(id, audiovisual);
        return "Ok. Actualizaste el audiovisual.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteAudiovisual(@PathVariable int id){
        audiovisualService.deleteAudiovisual(id);
        return "Espero que no te arrepientas... Borraste el Audiovisual...";
    }    
}
