package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Contact;
import com.portfolio.pov.services.ContactService;

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
@RequestMapping("contact")
public class ContactController {
    
    //Enlazado
    @Autowired
    ContactService contactService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Contact> getContacts(){
        return contactService.getContacts();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Contact findContact(@PathVariable int id){
        return contactService.findContact(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveContact(@RequestBody Contact contact){
        contactService.saveContact(contact);
        return "Muy bien!!! Creaste un nuevo Contacto!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateContact(@PathVariable int id, @RequestBody Contact contact){
        contactService.updateContact(id, contact);
        return "Ok. Actualizaste el Contacto.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteContact(@PathVariable int id){
        contactService.deleteContact(id);
        return "Espero que no te arrepientas... Borraste el Contacto...";
    }    
}
