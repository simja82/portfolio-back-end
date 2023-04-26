package com.portfolio.pov.services;

import com.portfolio.pov.entities.AudiovisualPresentation;
import com.portfolio.pov.interfaces.AudiovisualPresentationInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudiovisualPresentationService {
    
    //Enlazado
    @Autowired  
    AudiovisualPresentationInterface audiovisualPresentationInterface;

    //Listar
    public List<AudiovisualPresentation> getAudiovisualPresentations() {
        return audiovisualPresentationInterface.findAll();
    }
    
    //Encontrar
    public AudiovisualPresentation findAudiovisualPresentation(Integer id) {
        return audiovisualPresentationInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveAudiovisualPresentation(AudiovisualPresentation audiovisualpresentation) {
        audiovisualPresentationInterface.save(audiovisualpresentation);  
    }
    
    //Editar
    public void updateAudiovisualPresentation(int id, AudiovisualPresentation newAudiovisualPresentation) {
        Optional<AudiovisualPresentation> optionalAudiovisualPresentation = audiovisualPresentationInterface.findById(id);
        if (optionalAudiovisualPresentation.isPresent()) {
            AudiovisualPresentation existingAudiovisualPresentation = optionalAudiovisualPresentation.get();
            existingAudiovisualPresentation.setTitle(newAudiovisualPresentation.getTitle());
            existingAudiovisualPresentation.setLine_one(newAudiovisualPresentation.getLine_one());
            existingAudiovisualPresentation.setLine_two(newAudiovisualPresentation.getLine_two());
            existingAudiovisualPresentation.setLine_three(newAudiovisualPresentation.getLine_three());
            existingAudiovisualPresentation.setMinibio_icon(newAudiovisualPresentation.getMinibio_icon());
            existingAudiovisualPresentation.setMinibio_text(newAudiovisualPresentation.getMinibio_text());                     
            existingAudiovisualPresentation.setMywork_icon(newAudiovisualPresentation.getMywork_icon());
            existingAudiovisualPresentation.setMywork_text(newAudiovisualPresentation.getMywork_text());                     
            existingAudiovisualPresentation.setIwant_icon(newAudiovisualPresentation.getIwant_icon());
            existingAudiovisualPresentation.setIwant_text(newAudiovisualPresentation.getIwant_text());
            existingAudiovisualPresentation.setSubtitle(newAudiovisualPresentation.getSubtitle());
            existingAudiovisualPresentation.setParagraph(newAudiovisualPresentation.getParagraph());
            audiovisualPresentationInterface.save(existingAudiovisualPresentation);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar una presentación inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteAudiovisualPresentation(Integer id) {
        audiovisualPresentationInterface.deleteById(id);
    }    
}
