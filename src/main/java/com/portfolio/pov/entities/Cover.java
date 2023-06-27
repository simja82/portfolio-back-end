//Corresponde al Cover de Audiovisuales
//Se accede desde el Dashboard Audiovisual botón Cover
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="cover")
public class Cover {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotBlank
    @Column(name="title", length=100)
    private String title;
    
    @NotBlank
    @Column(name="based", length=100)
    private String based;

    @NotBlank
    @Column(name="draft", length=100)
    private String draft;

    @NotBlank
    @Column(name="to_visitors", length=50)
    private String to_visitors;       
        
    public Cover() {
    }

    public Cover (String title, String based, String draft, String to_visitors) {
        this.title = title;
        this.based = based;
        this.draft = draft;
        this.to_visitors = to_visitors;
    }
}
