package com.portfolio.pov.services;

import com.portfolio.pov.entities.DeveloperProfile;
import com.portfolio.pov.repositories.DeveloperProfileRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperProfileService {
    
    //Enlazado
    @Autowired  
    DeveloperProfileRepository developerprofileRepository;

    //Listar
    public List<DeveloperProfile> getDeveloperProfiles() {
        return developerprofileRepository.findAll();
    }
    
    //Encontrar
    public DeveloperProfile findDeveloperProfile(int id) {
        return developerprofileRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveDeveloperProfile(DeveloperProfile developerprofile) {
        developerprofileRepository.save(developerprofile);  
    }
    
    //Editar
    public void updateDeveloperProfile(DeveloperProfile developerprofile){	
        developerprofileRepository.save(developerprofile);
    }     
    
    //Eliminar
    public void deleteDeveloperProfile(int id) {
        developerprofileRepository.deleteById(id);
    }
           
}
