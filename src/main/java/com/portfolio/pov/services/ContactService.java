package com.portfolio.pov.services;

import com.portfolio.pov.entities.Contact;
import com.portfolio.pov.interfaces.ContactInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {
    
    //Enlazado
    @Autowired  
    ContactInterface contactInterface;

    //Listar
    public List<Contact> getContacts() {
        return contactInterface.findAll();
    }
    
    //Encontrar
    public Contact findContact(Integer id) {
        return contactInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveContact(Contact contact) {
        contactInterface.save(contact);  
    }
    
    //Editar
    public void updateContact(int id, Contact newContact) {
        Optional<Contact> optionalContact = contactInterface.findById(id);
        if (optionalContact.isPresent()) {
            Contact existingContact = optionalContact.get();
            existingContact.setIcon_phone(newContact.getIcon_phone());
            existingContact.setPhone(newContact.getPhone());
            existingContact.setIcon_email(newContact.getIcon_email());
            existingContact.setEmail(newContact.getEmail());
            existingContact.setIcon_availability(newContact.getIcon_availability()); 
            existingContact.setAvailability(newContact.getAvailability());                                 
            contactInterface.save(existingContact);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un Contacto inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteContact(Integer id) {
        contactInterface.deleteById(id);
    }    
}
