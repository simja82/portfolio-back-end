//Corresponde al modal de Logout
//Se accede desde Base de Datos
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="logout")
public class Logout {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id; 
    
    @NotBlank
    @Column(name="icon", length=50)
    private String icon;    

    @NotBlank
    @Column(name="text", length=150)
    private String text;
        
    public Logout() {
    }

    public Logout (String icon, String text) {
        this.icon = icon;
        this.text = text;
    }
}
