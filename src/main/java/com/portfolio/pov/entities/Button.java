//Corresponde a los Button
//Se accede desde el Dashboard General botón Buttons
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="buttons")
public class Button {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotBlank
    @Column(name="value")
    private String value;
        
    public Button() {
    }

    public Button (String value) {
        this.value = value;
    }
    
}
