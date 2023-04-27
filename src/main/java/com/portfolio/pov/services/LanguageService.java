package com.portfolio.pov.services;

import com.portfolio.pov.entities.Language;
import com.portfolio.pov.interfaces.LanguageInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageService {
    
    //Enlazado
    @Autowired  
    LanguageInterface languageInterface;

    //Listar
    public List<Language> getLanguages() {
        return languageInterface.findAll();
    }
    
    //Encontrar
    public Language findLanguage(Integer id) {
        return languageInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveLanguage(Language language) {
        languageInterface.save(language);  
    }
    
    //Editar
    public void updateLanguage(int id, Language newLanguage) {
        Optional<Language> optionalLanguage = languageInterface.findById(id);
        if (optionalLanguage.isPresent()) {
            Language existingLanguage = optionalLanguage.get();
            existingLanguage.setLanguage(newLanguage.getLanguage());
            existingLanguage.setLevel(newLanguage.getLevel());
            existingLanguage.setPercentage(newLanguage.getPercentage());                   
            languageInterface.save(existingLanguage);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un Idioma inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteLanguage(Integer id) {
        languageInterface.deleteById(id);
    }    
}
