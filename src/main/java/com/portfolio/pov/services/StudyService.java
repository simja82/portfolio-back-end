package com.portfolio.pov.services;

import com.portfolio.pov.entities.Study;
import com.portfolio.pov.repositories.StudyRepository;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class StudyService {
    
    //Enlazado
    @Autowired  
    StudyRepository studyRepository;

    //Listar
    public List<Study> getStudies() {
        return studyRepository.findAll();
    }

    //Encontrar
    public Study findStudy(Integer id) {
        return studyRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveStudy(Study study) {
        studyRepository.save(study);
    }
    
    //Editar
    public void updateStudy(Study study) {
        studyRepository.save(study);
    }
    
    //Eliminar
    public void deleteStudy(Integer id) {
        studyRepository.deleteById(id);
    }
    
}
