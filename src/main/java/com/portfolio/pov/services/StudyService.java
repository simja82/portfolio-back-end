package com.portfolio.pov.services;

import com.portfolio.pov.entities.Study;
import com.portfolio.pov.interfaces.StudyInterface;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudyService {
    
    //Enlazado
    @Autowired  
    StudyInterface studyInterface;

    //Listar
    public List<Study> getStudies() {
        return studyInterface.findAll();
    }
    
    //Encontrar
    public Study findStudy(Long id) {
        return studyInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveStudy(Study study) {
        studyInterface.save(study);  
    }
    
    //Editar    
    public void updateStudy(Study study){	
        studyInterface.save(study);
    }  
    
    //Eliminar
    public void deleteStudy(Long id) {
        studyInterface.deleteById(id);
    }  
    
}
