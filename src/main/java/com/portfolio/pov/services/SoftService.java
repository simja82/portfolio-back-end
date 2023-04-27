package com.portfolio.pov.services;

import com.portfolio.pov.entities.Soft;
import com.portfolio.pov.interfaces.SoftInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SoftService {
    
    //Enlazado
    @Autowired  
    SoftInterface softInterface;

    //Listar
    public List<Soft> getSofts() {
        return softInterface.findAll();
    }
    
    //Encontrar
    public Soft findSoft(Integer id) {
        return softInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveSoft(Soft soft) {
        softInterface.save(soft);  
    }
    
    //Editar
    public void updateSoft(int id, Soft newSoft) {
        Optional<Soft> optionalSoft = softInterface.findById(id);
        if (optionalSoft.isPresent()) {
            Soft existingSoft = optionalSoft.get();
            existingSoft.setSoft(newSoft.getSoft());
            existingSoft.setPercentage(newSoft.getPercentage());                    
            softInterface.save(existingSoft);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar una Habilidad Blanda inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteSoft(Integer id) {
        softInterface.deleteById(id);
    }    
}
