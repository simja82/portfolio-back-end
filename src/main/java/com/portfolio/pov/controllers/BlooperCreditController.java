package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.BlooperCredit;
import com.portfolio.pov.services.BlooperCreditService;

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
@RequestMapping("bloopercredit")
public class BlooperCreditController {
    
    //Enlazado
    @Autowired
    BlooperCreditService blooperCreditService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<BlooperCredit> getBlooperCredits(){
        return blooperCreditService.getBlooperCredits();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public BlooperCredit findBlooperCredit(@PathVariable int id){
        return blooperCreditService.findBlooperCredit(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveBlooperCredit(@RequestBody BlooperCredit bloopercredit){
        blooperCreditService.saveBlooperCredit(bloopercredit);
        return "Muy bien!!! Creaste un nuevo crédito de blopper!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateBlooperCredit(@PathVariable int id, @RequestBody BlooperCredit bloopercredit){
        blooperCreditService.updateBlooperCredit(id, bloopercredit);
        return "Ok. Actualizaste el crédito de blooper.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteBlooperCredit(@PathVariable int id){
        blooperCreditService.deleteBlooperCredit(id);
        return "Espero que no te arrepientas... Borraste el crédito de blooper...";
    }    
}
