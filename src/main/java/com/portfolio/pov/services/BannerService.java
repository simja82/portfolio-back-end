package com.portfolio.pov.services;

import com.portfolio.pov.entities.Banner;
import com.portfolio.pov.interfaces.BannerInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BannerService {
    
    //Enlazado
    @Autowired  
    BannerInterface bannerInterface;

    //Listar
    public List<Banner> getBanners() {
        return bannerInterface.findAll();
    }
    
    //Encontrar
    public Banner findBanner(Integer id) {
        return bannerInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveBanner(Banner banner) {
        bannerInterface.save(banner);  
    }
    
    //Editar
    public void updateBanner(int id, Banner newBanner) {
        Optional<Banner> optionalBanner = bannerInterface.findById(id);
        if (optionalBanner.isPresent()) {
            Banner existingBanner = optionalBanner.get();
            existingBanner.setBanner(newBanner.getBanner());
            existingBanner.setImage(newBanner.getImage());
            existingBanner.setDescription(newBanner.getDescription());
            existingBanner.setHero(newBanner.getHero());
            existingBanner.setSubhero(newBanner.getSubhero());                     
            bannerInterface.save(existingBanner);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un banner inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteBanner(Integer id) {
        bannerInterface.deleteById(id);
    }    
}
