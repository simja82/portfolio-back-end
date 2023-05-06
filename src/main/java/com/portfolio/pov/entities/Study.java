//Corresponde a Educación Developer
//Se accede desde el Dashboard Developer botón Educación
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="studies")
public class Study {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;   
   
    @NotBlank
    @Column(name="image", length=255)
    private String image;

    @NotBlank
    @Column(name="title", length=100)
    private String title;
    
    @NotBlank
    @Column(name="institution", length=150)
    private String institution;

    @NotBlank
    @Column(name="start_date", length=10)
    private String start_date;
    
    @NotBlank
    @Column(name="end_date", length=10)
    private String end_date;
    
    public Study() {
    }

    public Study (String image, String title, String institution, String start_date, String end_date) {
        this.image = image;
        this.title = title;
        this.institution = institution;
        this.start_date = start_date;
        this.end_date = end_date;      
    }
}
