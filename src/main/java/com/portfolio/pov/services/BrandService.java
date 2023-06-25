package com.portfolio.pov.services;

import com.portfolio.pov.entities.Brand;
import com.portfolio.pov.repositories.BrandRepository;

import jakarta.transaction.Transactional;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class BrandService {
    
    //Enlazado
    @Autowired  
    BrandRepository brandRepository;

    //Listar
    public List<Brand> getBrands() {
        return brandRepository.findAll();
    }

    //Encontrar
    public Brand findBrand(Integer id) {
        return brandRepository.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveBrand(Brand brand) {
        brandRepository.save(brand);
    }
    
    //Editar
    public void updateBrand(Brand brand) {
        brandRepository.save(brand);
    }
    
    //Eliminar
    public void deleteBrand(Integer id) {
        brandRepository.deleteById(id);
    }
    
}
