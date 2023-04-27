package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.AudiovisualPresentation;
import com.portfolio.pov.services.AudiovisualPresentationService;

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
@RequestMapping("audiovisualpresentation")
public class AudiovisualPresentationController {
    
    //Enlazado
    @Autowired
    AudiovisualPresentationService audiovisualPresentationService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<AudiovisualPresentation> getAudiovisualPresentations(){
        return audiovisualPresentationService.getAudiovisualPresentations();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public AudiovisualPresentation findAudiovisualPresentation(@PathVariable int id){
        return audiovisualPresentationService.findAudiovisualPresentation(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveAudiovisualPresentation(@RequestBody AudiovisualPresentation audiovisualpresentation){
        audiovisualPresentationService.saveAudiovisualPresentation(audiovisualpresentation);
        return "Muy bien!!! Creaste una mueva Presentación Audiovisual!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateAudiovisualPresentation(@PathVariable int id, @RequestBody AudiovisualPresentation audiovisualpresentation){
        audiovisualPresentationService.updateAudiovisualPresentation(id, audiovisualpresentation);
        return "Ok. Actualizaste la Presentación Audiovisual.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteAudiovisualPresentation(@PathVariable int id){
        audiovisualPresentationService.deleteAudiovisualPresentation(id);
        return "Espero que no te arrepientas... Borraste la Presentación Audiovisual...";
    }    
}
