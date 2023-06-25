//Corresponde a Developer Social
//Se accede desde el Dashboard General botón Social
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="social_developer")
public class DeveloperSocial {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
       
    @NotBlank
    @Column(name="icon")
    private String icon;
    
    @NotBlank
    @Column(name="link")
    private String link;
    
    public DeveloperSocial() {
    }

    public DeveloperSocial(String icon, String link ) {
        this.icon = icon;
        this.link = link; 
    }

}
