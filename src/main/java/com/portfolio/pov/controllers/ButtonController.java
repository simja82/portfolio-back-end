package com.portfolio.pov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.portfolio.pov.entities.Button;
import com.portfolio.pov.services.ButtonService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://pov-portfolio.web.app")
@RequestMapping("button")
public class ButtonController {
    
    //Enlazado
    @Autowired
    ButtonService buttonService;

    //Listar
    @GetMapping("/list")
    @ResponseBody 
    public List<Button> getButtons(){
        return buttonService.getButtons();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Button findButton(@PathVariable Integer id){
        return buttonService.findButton(id);  
    }
    
    //Crear
    @PostMapping ("/new")
    @ResponseBody
    public String saveButton(@RequestBody Button button){
        buttonService.saveButton(button);
        return "Muy bien!!! Creaste un nuevo Botón!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateButton(@RequestBody Button button){
        buttonService.updateButton(button);
        return "Ok. Actualizaste el Botón!!!";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteButton(@PathVariable int id){
        buttonService.deleteButton(id);
        return "Espero que no te arrepientas... Borraste el Botón...";
    }

}
