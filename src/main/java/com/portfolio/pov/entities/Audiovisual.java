//Corresponde al Dashboard Audiovisual
//Se accede desde Base de Datos
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="audiovisual")
public class Audiovisual {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id; 
    
    @NotNull
    @Column(name="icon", length=50)
    private String icon;    

    @NotNull
    @Column(name="section", length=50)
    private String section;
    
    @NotNull
    @Column(name="target", length=100)
    private String target;    
    
    public Audiovisual() {
    }

    public Audiovisual (int id, String icon, String section, String target) {
        this.id = id;
        this.icon = icon;
        this.section = section;
        this.target = target;
    }
}
