package com.portfolio.pov.services;

import com.portfolio.pov.entities.Helper;
import com.portfolio.pov.repositories.HelperRepository;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class HelperService {
    
    //Enlazado
    @Autowired  
    HelperRepository helperRepository;

    //Listar
    public List<Helper> getHelpers() {
        return helperRepository.findAll();
    }

    //Encontrar
    public Helper findHelper(Integer id) {
        return helperRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveHelper(Helper helper) {
        helperRepository.save(helper);
    }
    
    //Editar
    public void updateHelper(Helper helper) {
        helperRepository.save(helper);
    }
    
    //Eliminar
    public void deleteHelper(Integer id) {
        helperRepository.deleteById(id);
    }
    
}
