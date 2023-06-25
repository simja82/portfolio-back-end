package com.portfolio.pov.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;

import com.portfolio.pov.entities.Brand;
import com.portfolio.pov.services.BrandService;

@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@CrossOrigin(origins = "https://pov-portfolio.web.app")
@RequestMapping("brand")
public class BrandController {
    
    //Enlazado
    @Autowired
    BrandService brandService;

    //Listar
    @GetMapping("/list")
    @ResponseBody 
    public List<Brand> getBrands(){
        return brandService.getBrands();  
    }
    
    //Encontrar 
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Brand findBrand(@PathVariable Integer id){
        return brandService.findBrand(id);  
    }
    
    //Crear
    @PostMapping ("/new")
    @ResponseBody
    public String saveBrand(@RequestBody Brand brand){
        brandService.saveBrand(brand);
        return "Muy bien!!! Creaste un nuevo Logo!!!";
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateBrand(@RequestBody Brand brand){
        brandService.updateBrand(brand);
        return "Ok. Actualizaste el Logo!!!";
    }
    
    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteBrand(@PathVariable int id){
        brandService.deleteBrand(id);
        return "Espero que no te arrepientas... Borraste el Logo...";
    }

}
