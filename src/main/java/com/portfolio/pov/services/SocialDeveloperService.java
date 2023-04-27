package com.portfolio.pov.services;

import com.portfolio.pov.entities.SocialDeveloper;
import com.portfolio.pov.interfaces.SocialDeveloperInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SocialDeveloperService {
    
    //Enlazado
    @Autowired  
    SocialDeveloperInterface socialDeveloperInterface;

    //Listar
    public List<SocialDeveloper> getSocialDevelopers() {
        return socialDeveloperInterface.findAll();
    }
    
    //Encontrar
    public SocialDeveloper findSocialDeveloper(Integer id) {
        return socialDeveloperInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveSocialDeveloper(SocialDeveloper socialdeveloper) {
        socialDeveloperInterface.save(socialdeveloper);  
    }
    
    //Editar
    public void updateSocialDeveloper(int id, SocialDeveloper newSocialDeveloper) {
        Optional<SocialDeveloper> optionalSocialDeveloper = socialDeveloperInterface.findById(id);
        if (optionalSocialDeveloper.isPresent()) {
            SocialDeveloper existingSocialDeveloper = optionalSocialDeveloper.get();
            existingSocialDeveloper.setIcon(newSocialDeveloper.getIcon());
            existingSocialDeveloper.setLink(newSocialDeveloper.getLink());                     
            socialDeveloperInterface.save(existingSocialDeveloper);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar una Red Social inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteSocialDeveloper(Integer id) {
        socialDeveloperInterface.deleteById(id);
    }    
}
