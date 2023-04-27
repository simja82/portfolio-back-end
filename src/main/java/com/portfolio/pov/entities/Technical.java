//Corresponde a la sección de Técnicas Developer
//Se accede desde el Dashboard Developer botón Skills
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="technicals")
public class Technical {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="progress", length=50)
    private String progress;

    @NotNull
    @Column(name="icon", length=50)
    private String icon;

    @NotNull
    @Column(name="technology", length=100)
    private String technology;
    
    @NotNull
    @Column(name="percentage", length=3)
    private String percentage;
    
    public Technical() {
    }

    public Technical (int id, String progress, String icon, String technology, String percentage) {
        this.id = id;
        this.progress = progress;
        this.icon = icon;
        this.technology = technology;
        this.percentage = percentage;
    }
}
