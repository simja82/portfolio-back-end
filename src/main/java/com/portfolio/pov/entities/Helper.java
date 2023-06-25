//Corresponde a los Helpers
//Se accede desde el Dashboard General botón Helpers
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="helpers")
public class Helper {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotBlank
    @Column(name="value", length=100)
    private String value;
        
    public Helper() {
    }

    public Helper (String value) {
        this.value = value;
    }

}
