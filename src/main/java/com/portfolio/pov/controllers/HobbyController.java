package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Hobby;
import com.portfolio.pov.services.HobbyService;

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
@RequestMapping("hobby")
public class HobbyController {
    
    //Enlazado
    @Autowired
    HobbyService hobbyService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Hobby> getHobbies(){
        return hobbyService.getHobbies();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Hobby findHobby(@PathVariable int id){
        return hobbyService.findHobby(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveHobby(@RequestBody Hobby hobby){
        hobbyService.saveHobby(hobby);
        return "Muy bien!!! Creaste un nuevo Hobby!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateHobby(@PathVariable int id, @RequestBody Hobby hobby){
        hobbyService.updateHobby(id, hobby);
        return "Ok. Actualizaste el Hobby.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteHobby(@PathVariable int id){
        hobbyService.deleteHobby(id);
        return "Espero que no te arrepientas... Borraste el Hobby...";
    }    
}
