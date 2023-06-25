package com.portfolio.pov.services;

import com.portfolio.pov.entities.GeneralSocial;
import com.portfolio.pov.repositories.GeneralSocialRepository;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class GeneralSocialService {
    
    //Enlazado
    @Autowired  
    GeneralSocialRepository generalsocialRepository;

    //Listar
    public List<GeneralSocial> getGeneralSocials() {
        return generalsocialRepository.findAll();
    }

    //Encontrar
    public GeneralSocial findGeneralSocial(Integer id) {
        return generalsocialRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveGeneralSocial(GeneralSocial generalsocial) {
        generalsocialRepository.save(generalsocial);
    }
    
    //Editar
    public void updateGeneralSocial(GeneralSocial generalsocial) {
        generalsocialRepository.save(generalsocial);
    }
    
    //Eliminar
    public void deleteGeneralSocial(Integer id) {
        generalsocialRepository.deleteById(id);
    }
    
}
