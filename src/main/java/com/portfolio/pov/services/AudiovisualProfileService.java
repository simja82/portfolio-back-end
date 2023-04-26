package com.portfolio.pov.services;

import com.portfolio.pov.entities.AudiovisualProfile;
import com.portfolio.pov.interfaces.AudiovisualProfileInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AudiovisualProfileService {
    
    //Enlazado
    @Autowired  
    AudiovisualProfileInterface audiovisualProfileInterface;

    //Listar
    public List<AudiovisualProfile> getAudiovisualProfiles() {
        return audiovisualProfileInterface.findAll();
    }
    
    //Encontrar
    public AudiovisualProfile findAudiovisualProfile(Integer id) {
        return audiovisualProfileInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveAudiovisualProfile(AudiovisualProfile audiovisualprofile) {
        audiovisualProfileInterface.save(audiovisualprofile);  
    }
    
    //Editar
    public void updateAudiovisualProfile(int id, AudiovisualProfile newAudiovisualProfile) {
        Optional<AudiovisualProfile> optionalAudiovisualProfile = audiovisualProfileInterface.findById(id);
        if (optionalAudiovisualProfile.isPresent()) {
            AudiovisualProfile existingAudiovisualProfile = optionalAudiovisualProfile.get();
            existingAudiovisualProfile.setTitle(newAudiovisualProfile.getTitle());
            existingAudiovisualProfile.setIntro(newAudiovisualProfile.getIntro());
            existingAudiovisualProfile.setPhoto(newAudiovisualProfile.getPhoto());
            existingAudiovisualProfile.setAuthor(newAudiovisualProfile.getAuthor());
            existingAudiovisualProfile.setCredit(newAudiovisualProfile.getCredit()); 
            existingAudiovisualProfile.setOne(newAudiovisualProfile.getOne()); 
            existingAudiovisualProfile.setTwo(newAudiovisualProfile.getTwo());                                             
            audiovisualProfileInterface.save(existingAudiovisualProfile);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un Perfil Audiovisual inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteAudiovisualProfile(Integer id) {
        audiovisualProfileInterface.deleteById(id);
    }    
}
