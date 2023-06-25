//Corresponde a la Brand
//Se accede desde el Dashboard General botón Brand
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="brands")
public class Brand {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotBlank
    @Column(name="image", length=150)
    private String image;
    
    @NotBlank
    @Column(name="alt", length=100)
    private String alt;
        
    public Brand() {
    }

    public Brand (String image, String alt) {
        this.image = image;
        this.alt = alt;
    }
    
}
