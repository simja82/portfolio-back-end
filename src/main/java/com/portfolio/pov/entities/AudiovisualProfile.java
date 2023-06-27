//Corresponde al Perfil Audiovisual
//Se accede desde el Dashboard Audiovisual botón Perfil
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="audiovisual_profile")
public class AudiovisualProfile {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotBlank
    @Column(name="title", length=45)
    private String title;
    
    @NotBlank
    @Column(name="intro", length=250)
    private String intro;
    
    @NotBlank
    @Column(name="photo", length=150)
    private String photo;

    @NotBlank
    @Column(name="author", length=100)
    private String author;
    
    @NotBlank
    @Column(name="credit", length=100)
    private String credit;

    @NotBlank
    @Column(name="one", length=100)
    private String one;
    
    @NotBlank
    @Column(name="two", length=100)
    private String two;     
        
    public AudiovisualProfile() {
    }

    public AudiovisualProfile (String title, String intro, String photo, String author, String credit, String one, String two) {
        this.title = title;
        this.intro = intro;
        this.photo = photo;
        this.author = author;
        this.credit = credit;
        this.one = one;
        this.two = two;
    }
}
