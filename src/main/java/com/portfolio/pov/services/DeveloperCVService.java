package com.portfolio.pov.services;

import com.portfolio.pov.entities.DeveloperCV;
import com.portfolio.pov.interfaces.DeveloperCVInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperCVService {
    
    //Enlazado
    @Autowired  
    DeveloperCVInterface developerCVInterface;

    //Listar
    public List<DeveloperCV> getDeveloperCVs() {
        return developerCVInterface.findAll();
    }
    
    //Encontrar
    public DeveloperCV findDeveloperCV(Integer id) {
        return developerCVInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveDeveloperCV(DeveloperCV developercv) {
        developerCVInterface.save(developercv);  
    }
    
    //Editar
    public void updateDeveloperCV(int id, DeveloperCV newDeveloperCV) {
        Optional<DeveloperCV> optionalDeveloperCV = developerCVInterface.findById(id);
        if (optionalDeveloperCV.isPresent()) {
            DeveloperCV existingDeveloperCV = optionalDeveloperCV.get();
            existingDeveloperCV.setLine_one(newDeveloperCV.getLine_one());
            existingDeveloperCV.setLine_two(newDeveloperCV.getLine_two());
            existingDeveloperCV.setLine_three(newDeveloperCV.getLine_three());
            existingDeveloperCV.setLine_four(newDeveloperCV.getLine_four());
            existingDeveloperCV.setFirst_icon(newDeveloperCV.getFirst_icon());  
            existingDeveloperCV.setLine_five(newDeveloperCV.getLine_five()); 
            existingDeveloperCV.setSecond_icon(newDeveloperCV.getSecond_icon()); 
            existingDeveloperCV.setLine_six(newDeveloperCV.getLine_six());                                                        
            developerCVInterface.save(existingDeveloperCV);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un CV Developer inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteDeveloperCV(Integer id) {
        developerCVInterface.deleteById(id);
    }    
}

