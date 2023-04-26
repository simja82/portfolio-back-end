//Corresponde a los Banners
//Se accede desde el Dashboard General botón Banners
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="banners")
public class Banner {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="banner")
    private String banner;
        
    @NotNull
    @Column(name="image")
    private String image;
    
    @NotNull
    @Column(name="description")
    private String description;
    
    @NotNull
    @Column(name="hero")
    private String hero;

    @NotNull
    @Column(name="subhero")
    private String subhero;
    
    public Banner() {
    }

    public Banner (int id, String banner, String image, String description, String hero, String subhero) {
        this.id = id;
        this.banner = banner;
        this.image = image;
        this.description = description;
        this.hero = hero;
        this.subhero = subhero;
    }
}
