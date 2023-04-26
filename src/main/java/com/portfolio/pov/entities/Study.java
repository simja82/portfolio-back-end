//Corresponde a Educación Developer
//Se accede desde el Dashboard Developer botón Educación
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="studies")
public class Study {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="image", length=255)
    private String image;

    @NotNull
    @Column(name="title", length=100)
    private String title;
    
    @NotNull
    @Column(name="institution", length=150)
    private String institution;

    @NotNull
    @Column(name="start_date", length=10)
    private String start_date;
    
    @NotNull
    @Column(name="end_date", length=10)
    private String end_date;
    
    public Study() {
    }

    public Study (int id, String image, String title, String institution, String start_date, String end_date) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.institution = institution;
        this.start_date = start_date;
        this.end_date = end_date;      
    }
}
