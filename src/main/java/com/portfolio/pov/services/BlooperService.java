package com.portfolio.pov.services;

import com.portfolio.pov.entities.Blooper;
import com.portfolio.pov.interfaces.BlooperInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlooperService {
    
    //Enlazado
    @Autowired  
    BlooperInterface blooperInterface;

    //Listar
    public List<Blooper> getBloopers() {
        return blooperInterface.findAll();
    }
    
    //Encontrar
    public Blooper findBlooper(Integer id) {
        return blooperInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveBlooper(Blooper blooper) {
        blooperInterface.save(blooper);  
    }
    
    //Editar
    public void updateBlooper(int id, Blooper newBlooper) {
        Optional<Blooper> optionalBlooper = blooperInterface.findById(id);
        if (optionalBlooper.isPresent()) {
            Blooper existingBlooper = optionalBlooper.get();
            existingBlooper.setThanks(newBlooper.getThanks());
            existingBlooper.setSignature(newBlooper.getSignature());
            existingBlooper.setRegister(newBlooper.getRegister());                     
            blooperInterface.save(existingBlooper);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un blooper inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteBlooper(Integer id) {
        blooperInterface.deleteById(id);
    }    
}
