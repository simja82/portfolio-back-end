package com.portfolio.pov.services;

import com.portfolio.pov.entities.DeveloperProfile;
import com.portfolio.pov.interfaces.DeveloperProfileInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperProfileService {
    
    //Enlazado
    @Autowired  
    DeveloperProfileInterface developerProfileInterface;

    //Listar
    public List<DeveloperProfile> getDeveloperProfiles() {
        return developerProfileInterface.findAll();
    }
    
    //Encontrar
    public DeveloperProfile findDeveloperProfile(Integer id) {
        return developerProfileInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveDeveloperProfile(DeveloperProfile developerprofile) {
        developerProfileInterface.save(developerprofile);  
    }
    
    //Editar
    public void updateDeveloperProfile(int id, DeveloperProfile newDeveloperProfile) {
        Optional<DeveloperProfile> optionalDeveloperProfile = developerProfileInterface.findById(id);
        if (optionalDeveloperProfile.isPresent()) {
            DeveloperProfile existingDeveloperProfile = optionalDeveloperProfile.get();
            existingDeveloperProfile.setIcon(newDeveloperProfile.getIcon());
            existingDeveloperProfile.setTitle(newDeveloperProfile.getTitle());
            existingDeveloperProfile.setName_intro(newDeveloperProfile.getName_intro());
            existingDeveloperProfile.setFullname(newDeveloperProfile.getFullname());
            existingDeveloperProfile.setLine_one(newDeveloperProfile.getLine_one()); 
            existingDeveloperProfile.setPhoto(newDeveloperProfile.getPhoto());
            existingDeveloperProfile.setPhrase_one(newDeveloperProfile.getPhrase_one());
            existingDeveloperProfile.setPhrase_two(newDeveloperProfile.getPhrase_two());
            existingDeveloperProfile.setAuthor(newDeveloperProfile.getAuthor());
            existingDeveloperProfile.setCredit(newDeveloperProfile.getCredit());                                                                                
            developerProfileInterface.save(existingDeveloperProfile);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un Perfil Audiovisual inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteDeveloperProfile(Integer id) {
        developerProfileInterface.deleteById(id);
    }    
}
