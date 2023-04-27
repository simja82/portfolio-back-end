package com.portfolio.pov.services;

import com.portfolio.pov.entities.Experience;
import com.portfolio.pov.interfaces.ExperienceInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ExperienceService {
    
    //Enlazado
    @Autowired  
    ExperienceInterface experienceInterface;

    //Listar
    public List<Experience> getExperiences() {
        return experienceInterface.findAll();
    }
    
    //Encontrar
    public Experience findExperience(Integer id) {
        return experienceInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveExperience(Experience experience) {
        experienceInterface.save(experience);  
    }
    
    //Editar
    public void updateExperience(int id, Experience newExperience) {
        Optional<Experience> optionalExperience = experienceInterface.findById(id);
        if (optionalExperience.isPresent()) {
            Experience existingExperience = optionalExperience.get();
            existingExperience.setImage(newExperience.getImage());
            existingExperience.setPosition(newExperience.getPosition());
            existingExperience.setPlace(newExperience.getPlace());
            existingExperience.setStart_date(newExperience.getStart_date());
            existingExperience.setEnd_date(newExperience.getEnd_date());   
            existingExperience.setDescription(newExperience.getDescription());
            existingExperience.setTask_one(newExperience.getTask_one());
            existingExperience.setTask_two(newExperience.getTask_two());
            existingExperience.setTask_three(newExperience.getTask_three());                                                                  
            experienceInterface.save(existingExperience);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar una Experiencia inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteExperience(Integer id) {
        experienceInterface.deleteById(id);
    }    
}
