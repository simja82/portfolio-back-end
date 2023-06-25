package com.portfolio.pov.services;

import com.portfolio.pov.entities.AudiovisualSocial;
import com.portfolio.pov.repositories.AudiovisualSocialRepository;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class AudiovisualSocialService {
    
    //Enlazado
    @Autowired  
    AudiovisualSocialRepository audiovisualsocialRepository;

    //Listar
    public List<AudiovisualSocial> getAudiovisualSocials() {
        return audiovisualsocialRepository.findAll();
    }

    //Encontrar
    public AudiovisualSocial findAudiovisualSocial(Integer id) {
        return audiovisualsocialRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveAudiovisualSocial(AudiovisualSocial audiovisualsocial) {
        audiovisualsocialRepository.save(audiovisualsocial);
    }
    
    //Editar
    public void updateAudiovisualSocial(AudiovisualSocial audiovisualsocial) {
        audiovisualsocialRepository.save(audiovisualsocial);
    }
    
    //Eliminar
    public void deleteAudiovisualSocial(Integer id) {
        audiovisualsocialRepository.deleteById(id);
    }
    
}
