//Corresponde a los Hobbies Developer
//Se accede desde el Dashboard Developer botón Hobbies
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="hobbies")
public class Hobby {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id; 
    
    @NotNull
    @Column(name="icon", length=50)
    private String icon;    

    @NotNull
    @Column(name="description", length=50)
    private String description;
    
    public Hobby() {
    }

    public Hobby (int id, String icon, String description) {
        this.id = id;
        this.icon = icon;
        this.description = description;
    }
}
