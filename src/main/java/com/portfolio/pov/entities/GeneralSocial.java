//Corresponde a General Social
//Se accede desde el Dashboard General botón Social
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="social_general")
public class GeneralSocial {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
       
    @NotBlank
    @Column(name="icon")
    private String icon;
    
    @NotBlank
    @Column(name="link")
    private String link;
    
    public GeneralSocial() {
    }

    public GeneralSocial(String icon, String link ) {
        this.icon = icon;
        this.link = link; 
    }

}
