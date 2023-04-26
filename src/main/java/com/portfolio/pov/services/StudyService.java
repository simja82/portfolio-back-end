package com.portfolio.pov.services;

import com.portfolio.pov.entities.Study;
import com.portfolio.pov.interfaces.StudyInterface;

import java.util.List;
import java.util.Optional;

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
    public Study findStudy(Integer id) {
        return studyInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveStudy(Study study) {
        studyInterface.save(study);  
    }
    
    //Editar
    public void updateStudy(int id, Study newStudy) {
        Optional<Study> optionalStudy = studyInterface.findById(id);
        if (optionalStudy.isPresent()) {
            Study existingStudy = optionalStudy.get();
            existingStudy.setImage(newStudy.getImage());
            existingStudy.setTitle(newStudy.getTitle());
            existingStudy.setInstitution(newStudy.getInstitution());
            existingStudy.setStart_date(newStudy.getStart_date());
            existingStudy.setEnd_date(newStudy.getEnd_date());                     
            studyInterface.save(existingStudy);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un estudio inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteStudy(Integer id) {
        studyInterface.deleteById(id);
    }    
}
