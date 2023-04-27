//Corresponde a la sección Idiomas de Skills Developer
//Se accede desde el Dashboard Developer botón Skills
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="languages")
public class Language {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;     

    @NotNull
    @Column(name="language", length=50)
    private String language;

    @NotNull
    @Column(name="level", length=2)
    private String level;
    
    @NotNull
    @Column(name="percentage", length=3)
    private String percentage;
    
    public Language() {
    }

    public Language (int id, String language, String level, String percentage) {
        this.id = id;
        this.language = language;
        this.level = level;
        this.percentage = percentage;
    }
}
