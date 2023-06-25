package com.portfolio.pov.services;

import com.portfolio.pov.entities.DeveloperSocial;
import com.portfolio.pov.repositories.DeveloperSocialRepository;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class DeveloperSocialService {
    
    //Enlazado
    @Autowired  
    DeveloperSocialRepository developersocialRepository;

    //Listar
    public List<DeveloperSocial> getDeveloperSocials() {
        return developersocialRepository.findAll();
    }

    //Encontrar
    public DeveloperSocial findDeveloperSocial(Integer id) {
        return developersocialRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveDeveloperSocial(DeveloperSocial developersocial) {
        developersocialRepository.save(developersocial);
    }
    
    //Editar
    public void updateDeveloperSocial(DeveloperSocial developersocial) {
        developersocialRepository.save(developersocial);
    }
    
    //Eliminar
    public void deleteDeveloperSocial(Integer id) {
        developersocialRepository.deleteById(id);
    }
    
}
