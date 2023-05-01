package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Intro;
import com.portfolio.pov.services.IntroService;

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
@RequestMapping("intro")
public class IntroController {
    
    //Enlazado
    @Autowired
    IntroService introService;
    
    /*
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Intro> getIntros(){
        return introService.getIntros();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Intro findIntro(@PathVariable int id){
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
    @PutMapping("/update/{id}")   
    public String updateIntro(@PathVariable int id, @RequestBody Intro intro){
        introService.updateIntro(id, intro);
        return "Ok. Actualizaste la Intro.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteIntro(@PathVariable int id){
        introService.deleteIntro(id);
        return "Espero que no te arrepientas... Borraste la intro...";
    }    
    
    */
    
    	@GetMapping("/intro/{id}")
	@ResponseBody
	public Intro cargarItem(@PathVariable Long id){
		return introService.cargarItem(id);
	}
	
	@PutMapping("/intro")
	public String modificarItem(@RequestBody Intro intro){
		introService.modificarItem(intro);
		return "La intro fue modificada correctamente!!";
	}
}
