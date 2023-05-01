//Corresponde a la Intro Developer
//Se accede desde el Dashboard Developer botón Intro
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="intro")
public class Intro {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    Long id;
    
    @NotNull
    @Column(name="overview", length=100)
    private String overview;
    
    /*
    @NotNull
    @Column(name="industry", length=100)
    private String industry;    
    
    @NotNull
    @Column(name="history", length=50)
    private String history;  

    @NotNull
    @Column(name="line_one", length=200)
    private String line_one;  

    @NotNull
    @Column(name="line_two", length=200)
    private String line_two;  

    */    

    public Intro() {
    }

    public Intro (Long id, String overview/*, String industry, String history, String line_one, String line_two*/) {
        this.id = id;
        this.overview = overview;
    /*
        this.industry = industry;
        this.history = history;
        this.line_one = line_one;
        this.line_two = line_two; 
*/
    }
}
