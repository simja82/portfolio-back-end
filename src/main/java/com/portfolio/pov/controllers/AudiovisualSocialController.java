package com.portfolio.pov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.portfolio.pov.entities.AudiovisualSocial;
import com.portfolio.pov.services.AudiovisualSocialService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://pov-portfolio.web.app")
@RequestMapping("audiovisualsocial")
public class AudiovisualSocialController {
    
    //Enlazado
    @Autowired
    AudiovisualSocialService audiovisualsocialService;

    //Listar
    @GetMapping("/list")
    @ResponseBody 
    public List<AudiovisualSocial> getAudiovisualSocials(){
        return audiovisualsocialService.getAudiovisualSocials();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public AudiovisualSocial findAudiovisualSocial(@PathVariable Integer id){
        return audiovisualsocialService.findAudiovisualSocial(id);  
    }
    
    //Crear
    @PostMapping ("/new")
    @ResponseBody
    public String saveAudiovisualSocial(@RequestBody AudiovisualSocial audiovisualsocial){
        audiovisualsocialService.saveAudiovisualSocial(audiovisualsocial);
        return "Muy bien!!! Creaste una nueva Red Audiovisual!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateAudiovisualSocial(@RequestBody AudiovisualSocial audiovisualsocial){
        audiovisualsocialService.updateAudiovisualSocial(audiovisualsocial);
        return "Ok. Actualizaste la Red Audiovisual!!!";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteAudiovisualSocial(@PathVariable int id){
        audiovisualsocialService.deleteAudiovisualSocial(id);
        return "Espero que no te arrepientas... Borraste la Red Audiovisual...";
    }

}
