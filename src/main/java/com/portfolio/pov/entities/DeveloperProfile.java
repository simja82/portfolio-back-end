//Corresponde al Perfil Developer
//Se accede desde el Dashboard Developer botón Perfil
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="developer_profile")
public class DeveloperProfile {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="icon", length=50)
    private String icon;
    
    @NotNull
    @Column(name="name_intro", length=255)
    private String name_intro;

    @NotNull
    @Column(name="line_one", length=150)
    private String line_one;    
    
    @NotNull
    @Column(name="photo", length=150)
    private String photo;

    @NotNull
    @Column(name="phrase_one", length=100)
    private String phrase_one;
    
    @NotNull
    @Column(name="phrase_two", length=100)
    private String phrase_two;     
    
    @NotNull
    @Column(name="author", length=100)
    private String author;
    
    @NotNull
    @Column(name="credit", length=100)
    private String credit;
    
    public DeveloperProfile() {
    }

    public DeveloperProfile (int id, String icon, String name_intro, String line_one, String photo, String phrase_one, String phrase_two, String author, String credit) {
        this.id = id;
        this.icon = icon;
        this.name_intro = name_intro;
        this.line_one = line_one;        
        this.photo = photo;
        this.phrase_one = phrase_one;
        this.phrase_two = phrase_two;        
        this.author = author;
        this.credit = credit;
    }
}
