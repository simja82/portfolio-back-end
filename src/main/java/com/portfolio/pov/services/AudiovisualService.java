package com.portfolio.pov.services;

import com.portfolio.pov.entities.Audiovisual;
import com.portfolio.pov.interfaces.AudiovisualInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudiovisualService {
    
    //Enlazado
    @Autowired  
    AudiovisualInterface audiovisualInterface;

    //Listar
    public List<Audiovisual> getAudiovisuals() {
        return audiovisualInterface.findAll();
    }
    
    //Encontrar
    public Audiovisual findAudiovisual(Integer id) {
        return audiovisualInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveAudiovisual(Audiovisual audiovisual) {
        audiovisualInterface.save(audiovisual);  
    }
    
    //Editar
    public void updateAudiovisual(int id, Audiovisual newAudiovisual) {
        Optional<Audiovisual> optionalAudiovisual = audiovisualInterface.findById(id);
        if (optionalAudiovisual.isPresent()) {
            Audiovisual existingAudiovisual = optionalAudiovisual.get();
            existingAudiovisual.setIcon(newAudiovisual.getIcon());
            existingAudiovisual.setSection(newAudiovisual.getSection());
            existingAudiovisual.setTarget(newAudiovisual.getTarget());
            audiovisualInterface.save(existingAudiovisual);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un audiovisual inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteAudiovisual(Integer id) {
        audiovisualInterface.deleteById(id);
    }    
}
