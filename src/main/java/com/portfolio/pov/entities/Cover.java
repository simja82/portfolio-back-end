//Corresponde al Cover de Audiovisuales
//Se accede desde el Dashboard Audiovisual botón Cover
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="cover")
public class Cover {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="title", length=100)
    private String title;
    
    @NotNull
    @Column(name="based", length=100)
    private String based;

    @NotNull
    @Column(name="draft", length=100)
    private String draft;

    @NotNull
    @Column(name="to_visitors", length=50)
    private String to_visitors;       
        
    public Cover() {
    }

    public Cover (int id,String title, String based, String draft, String to_visitors) {
        this.id = id;
        this.title = title;
        this.based = based;
        this.draft = draft;
        this.to_visitors = to_visitors;
    }
}
