//Corresponde a la Intro Developer
//Se accede desde el Dashboard Developer botón Intro
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="intro")
public class Intro {
    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    int id;
    
    @NotBlank
    @Column(name="overview", length=100)
    private String overview;
    
    @NotBlank
    @Column(name="industry", length=100)
    private String industry;    
    
    @NotBlank
    @Column(name="history", length=50)
    private String history;  

    @NotBlank
    @Column(name="line_one", length=255)
    private String line_one;  

    @NotBlank
    @Column(name="line_two", length=255)
    private String line_two;  

    public Intro() {
    }

    public Intro (String overview, String industry, String history, String line_one, String line_two) {
        this.overview = overview;
        this.industry = industry;
        this.history = history;
        this.line_one = line_one;
        this.line_two = line_two; 
    }
    
}
