//Corresponde a los Forms
//Se accede desde el Dashboard General botón Forms
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="forms")
public class Form {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotBlank
    @Column(name="value", length=100)
    private String value;
        
    public Form() {
    }

    public Form (String value) {
        this.value = value;
    }
    
}
