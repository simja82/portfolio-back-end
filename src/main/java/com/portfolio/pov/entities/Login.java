//Corresponde a Login General
//Se accede desde el Dashboard General botón Login
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="login")
public class Login {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
        
    @NotBlank
    @Column(name="image", length=150)
    private String image;
    
    @NotBlank
    @Column(name="description", length=100)
    private String description;
        
    public Login() {
    }

    public Login (String image, String description) {
        this.image = image;
        this.description = description;
    }
}
