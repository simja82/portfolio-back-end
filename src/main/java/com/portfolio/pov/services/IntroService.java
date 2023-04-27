package com.portfolio.pov.services;

import com.portfolio.pov.entities.Intro;
import com.portfolio.pov.interfaces.IntroInterface;

import java.util.List;
import java.util.Optional;

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
    public Intro findIntro(Integer id) {
        return introInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveIntro(Intro intro) {
        introInterface.save(intro);  
    }
    
    //Editar
    public void updateIntro(int id, Intro newIntro) {
        Optional<Intro> optionalIntro = introInterface.findById(id);
        if (optionalIntro.isPresent()) {
            Intro existingIntro = optionalIntro.get();
            existingIntro.setOverview(newIntro.getOverview());
            existingIntro.setIndustry(newIntro.getIndustry());
            existingIntro.setHistory(newIntro.getHistory());
            existingIntro.setLine_one(newIntro.getLine_one());
            existingIntro.setLine_two(newIntro.getLine_two());                     
            introInterface.save(existingIntro);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar una intro inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteIntro(Integer id) {
        introInterface.deleteById(id);
    }    
}
