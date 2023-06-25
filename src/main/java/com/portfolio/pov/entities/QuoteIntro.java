//Corresponde a la primera sección de Quotes Audiovisual
//Se accede desde el Dashboard Audiovisual botón Quotes
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="quotes_intro")
public class QuoteIntro {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
    
    @NotNull
    @Column(name="line_one", length=100)
    private String line_one;
    
    @NotNull
    @Column(name="line_two", length=100)
    private String line_two;

    @NotNull
    @Column(name="line_three", length=100)
    private String line_three;
        
    public QuoteIntro() {
    }

    public QuoteIntro (int id, String line_one, String line_two, String line_three) {
        this.id = id;
        this.line_one = line_one;
        this.line_two = line_two;
        this.line_three = line_three;
    }
}
