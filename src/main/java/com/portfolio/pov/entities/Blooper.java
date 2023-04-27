//Corresponde a la última sección de Bloopers
//Se accede desde el Dashboard General botón Bloopers
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="bloopers")
public class Blooper {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="thanks", length=150)
    private String thanks;
    
    @NotNull
    @Column(name="signature", length=50)
    private String signature;  
    
    @NotNull
    @Column(name="register", length=4)
    private String register;      

    public Blooper() {
    }

    public Blooper (int id, String thanks, String signature, String register) {
        this.id = id;
        this.thanks = thanks;
        this.signature = signature;
        this.register = register;
    }
}
