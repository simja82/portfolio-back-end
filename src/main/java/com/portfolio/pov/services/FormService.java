package com.portfolio.pov.services;

import com.portfolio.pov.entities.Form;
import com.portfolio.pov.repositories.FormRepository;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class FormService {
    
    //Enlazado
    @Autowired  
    FormRepository formRepository;

    //Listar
    public List<Form> getForms() {
        return formRepository.findAll();
    }

    //Encontrar
    public Form findForm(Integer id) {
        return formRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveForm(Form form) {
        formRepository.save(form);
    }
    
    //Editar
    public void updateForm(Form form) {
        formRepository.save(form);
    }
    
    //Eliminar
    public void deleteForm(Integer id) {
        formRepository.deleteById(id);
    }
    
}
