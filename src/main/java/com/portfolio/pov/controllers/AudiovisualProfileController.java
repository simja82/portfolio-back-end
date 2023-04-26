package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.AudiovisualProfile;
import com.portfolio.pov.services.AudiovisualProfileService;

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
@RequestMapping("audiovisualprofile")
public class AudiovisualProfileController {
    
    //Enlazado
    @Autowired
    AudiovisualProfileService audiovisualProfileService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<AudiovisualProfile> getAudiovisualProfiles(){
        return audiovisualProfileService.getAudiovisualProfiles();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public AudiovisualProfile findAudiovisualProfile(@PathVariable int id){
        return audiovisualProfileService.findAudiovisualProfile(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveAudiovisualProfile(@RequestBody AudiovisualProfile audiovisualprofile){
        audiovisualProfileService.saveAudiovisualProfile(audiovisualprofile);
        return "Muy bien!!! Creaste un nuevo Perfil Audiovisual!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateAudiovisualProfile(@PathVariable int id, @RequestBody AudiovisualProfile audiovisualprofile){
        audiovisualProfileService.updateAudiovisualProfile(id, audiovisualprofile);
        return "Ok. Actualizaste el Perfil Audiovisual.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteAudiovisualProfile(@PathVariable int id){
        audiovisualProfileService.deleteAudiovisualProfile(id);
        return "Espero que no te arrepientas... Borraste el Perfil Audiovisual...";
    }    
}
