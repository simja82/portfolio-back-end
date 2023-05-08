package com.portfolio.pov.services;

import com.portfolio.pov.entities.Intro;
import com.portfolio.pov.interfaces.IntroInterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IntroService {
    
    //Enlazado
    @Autowired  
    IntroInterface introInterface;

    //Listar
    public List<Intro> getIntros() {
        return introInterface.findAll();
    }
    
    //Encontrar
    public Intro findIntro(Long id) {
        return introInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveIntro(Intro intro) {
        introInterface.save(intro);  
    }
    
    //Editar
    public void updateIntro(Intro intro){	
        introInterface.save(intro);
    }     
    
    //Eliminar
    public void deleteIntro(Long id) {
        introInterface.deleteById(id);
    }
           
}
