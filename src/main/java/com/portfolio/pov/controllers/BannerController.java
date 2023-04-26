package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Banner;
import com.portfolio.pov.services.BannerService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
//@CrossOrigin(origins = "https://pov-portfolio.web.app/")
@RequestMapping("banner")
public class BannerController {
    
    //Enlazado
    @Autowired
    BannerService bannerService;
    
    //Listar
    @GetMapping("/list") 
    @ResponseBody 
    public List<Banner> getBanners(){
        return bannerService.getBanners();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Banner findBanner(@PathVariable int id){
        return bannerService.findBanner(id);  
    }
    
    //Crear
    @PostMapping("/new")
    @ResponseBody
    public String saveBanner(@RequestBody Banner banner){
        bannerService.saveBanner(banner);
        return "Muy bien!!! Creaste un nuevo banner!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateBanner(@PathVariable int id, @RequestBody Banner banner){
        bannerService.updateBanner(id, banner);
        return "Ok. Actualizaste el banner.";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteBanner(@PathVariable int id){
        bannerService.deleteBanner(id);
        return "Espero que no te arrepientas... Borraste el banner...";
    }    
}
