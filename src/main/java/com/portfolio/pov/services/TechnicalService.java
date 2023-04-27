package com.portfolio.pov.services;

import com.portfolio.pov.entities.Technical;
import com.portfolio.pov.interfaces.TechnicalInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TechnicalService {
    
    //Enlazado
    @Autowired  
    TechnicalInterface technicalInterface;

    //Listar
    public List<Technical> getTechnicals() {
        return technicalInterface.findAll();
    }
    
    //Encontrar
    public Technical findTechnical(Integer id) {
        return technicalInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveTechnical(Technical technical) {
        technicalInterface.save(technical);  
    }
    
    //Editar
    public void updateTechnical(int id, Technical newTechnical) {
        Optional<Technical> optionalTechnical = technicalInterface.findById(id);
        if (optionalTechnical.isPresent()) {
            Technical existingTechnical = optionalTechnical.get();
            existingTechnical.setProgress(newTechnical.getProgress());
            existingTechnical.setIcon(newTechnical.getIcon());
            existingTechnical.setTechnology(newTechnical.getTechnology());
            existingTechnical.setPercentage(newTechnical.getPercentage());                    
            technicalInterface.save(existingTechnical);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar una Habilidad Técnica inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteTechnical(Integer id) {
        technicalInterface.deleteById(id);
    }    
}
