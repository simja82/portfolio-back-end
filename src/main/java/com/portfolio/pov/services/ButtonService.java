package com.portfolio.pov.services;

import com.portfolio.pov.entities.Button;
import com.portfolio.pov.repositories.ButtonRepository;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class ButtonService {
    
    //Enlazado
    @Autowired  
    ButtonRepository buttonRepository;

    //Listar
    public List<Button> getButtons() {
        return buttonRepository.findAll();
    }

    //Encontrar
    public Button findButton(Integer id) {
        return buttonRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveButton(Button button) {
        buttonRepository.save(button);
    }
    
    //Editar
    public void updateButton(Button button) {
        buttonRepository.save(button);
    }
    
    //Eliminar
    public void deleteButton(Integer id) {
        buttonRepository.deleteById(id);
    }
    
}
