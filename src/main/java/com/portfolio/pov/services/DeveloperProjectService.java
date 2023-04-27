package com.portfolio.pov.services;

import com.portfolio.pov.entities.DeveloperProject;
import com.portfolio.pov.interfaces.DeveloperProjectInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeveloperProjectService {
    
    //Enlazado
    @Autowired  
    DeveloperProjectInterface developerProjectInterface;

    //Listar
    public List<DeveloperProject> getDeveloperProjects() {
        return developerProjectInterface.findAll();
    }
    
    //Encontrar
    public DeveloperProject findDeveloperProject(Integer id) {
        return developerProjectInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveDeveloperProject(DeveloperProject developerproject) {
        developerProjectInterface.save(developerproject);  
    }
    
    //Editar
    public void updateDeveloperProject(int id, DeveloperProject newDeveloperProject) {
        Optional<DeveloperProject> optionalDeveloperProject = developerProjectInterface.findById(id);
        if (optionalDeveloperProject.isPresent()) {
            DeveloperProject existingDeveloperProject = optionalDeveloperProject.get();
            existingDeveloperProject.setImage(newDeveloperProject.getImage());
            existingDeveloperProject.setTitle(newDeveloperProject.getTitle());
            existingDeveloperProject.setDescription(newDeveloperProject.getDescription());
            existingDeveloperProject.setLink(newDeveloperProject.getLink());                    
            developerProjectInterface.save(existingDeveloperProject);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un Proyecto de Desarrollador inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteDeveloperProject(Integer id) {
        developerProjectInterface.deleteById(id);
    }    
}
