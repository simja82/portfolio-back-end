package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Login;
import com.portfolio.pov.services.LoginService;

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
@RequestMapping("login")
public class LoginController {
    
    //Enlazado
    @Autowired
    LoginService loginService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Login> getLogins(){
        return loginService.getLogins();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Login findLogin(@PathVariable int id){
        return loginService.findLogin(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveLogin(@RequestBody Login login){
        loginService.saveLogin(login);
        return "Muy bien!!! Creaste un nuevo Login!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateLogin(@PathVariable int id, @RequestBody Login login){
        loginService.updateLogin(id, login);
        return "Ok. Actualizaste el Login.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteLogin(@PathVariable int id){
        loginService.deleteLogin(id);
        return "Espero que no te arrepientas... Borraste el Login...";
    }    
}
