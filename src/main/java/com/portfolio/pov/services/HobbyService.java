package com.portfolio.pov.services;

import com.portfolio.pov.entities.Hobby;
import com.portfolio.pov.interfaces.HobbyInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HobbyService {
    
    //Enlazado
    @Autowired  
    HobbyInterface hobbyInterface;

    //Listar
    public List<Hobby> getHobbies() {
        return hobbyInterface.findAll();
    }
    
    //Encontrar
    public Hobby findHobby(Integer id) {
        return hobbyInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveHobby(Hobby hobby) {
        hobbyInterface.save(hobby);  
    }
    
    //Editar
    public void updateHobby(int id, Hobby newHobby) {
        Optional<Hobby> optionalHobby = hobbyInterface.findById(id);
        if (optionalHobby.isPresent()) {
            Hobby existingHobby = optionalHobby.get();
            existingHobby.setIcon(newHobby.getIcon());
            existingHobby.setDescription(newHobby.getDescription());                     
            hobbyInterface.save(existingHobby);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un Hobby inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteHobby(Integer id) {
        hobbyInterface.deleteById(id);
    }    
}
