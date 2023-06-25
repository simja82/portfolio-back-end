package com.portfolio.pov.services;

import com.portfolio.pov.entities.Intro;
import com.portfolio.pov.repositories.IntroRepository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntroService {
    
    //Enlazado
    @Autowired  
    IntroRepository introRepository;

    //Listar
    public List<Intro> getIntros() {
        return introRepository.findAll();
    }
    
    //Encontrar
    public Intro findIntro(int id) {
        return introRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveIntro(Intro intro) {
        introRepository.save(intro);  
    }
    
    //Editar
    public void updateIntro(Intro intro){	
        introRepository.save(intro);
    }     
    
    //Eliminar
    public void deleteIntro(int id) {
        introRepository.deleteById(id);
    }
           
}
