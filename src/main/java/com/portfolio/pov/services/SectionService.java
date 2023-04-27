package com.portfolio.pov.services;

import com.portfolio.pov.entities.Section;
import com.portfolio.pov.interfaces.SectionInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SectionService {
    
    //Enlazado
    @Autowired  
    SectionInterface sectionInterface;

    //Listar
    public List<Section> getSections() {
        return sectionInterface.findAll();
    }
    
    //Encontrar
    public Section findSection(Integer id) {
        return sectionInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveSection(Section section) {
        sectionInterface.save(section);  
    }
    
    //Editar
    public void updateSection(int id, Section newSection) {
        Optional<Section> optionalSection = sectionInterface.findById(id);
        if (optionalSection.isPresent()) {
            Section existingSection = optionalSection.get();
            existingSection.setAbout(newSection.getAbout());
            existingSection.setStudies(newSection.getStudies());
            existingSection.setExperiences(newSection.getExperiences());
            existingSection.setProjects(newSection.getProjects());
            existingSection.setSkills(newSection.getSkills());     
            existingSection.setTechnicals(newSection.getTechnicals());
            existingSection.setSofts(newSection.getSofts());
            existingSection.setLanguages(newSection.getLanguages());
            existingSection.setHobbies(newSection.getHobbies());
            existingSection.setComments(newSection.getComments()); 
            existingSection.setContact(newSection.getContact());                                         
            sectionInterface.save(existingSection);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar una Sección inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteSection(Integer id) {
        sectionInterface.deleteById(id);
    }    
}
