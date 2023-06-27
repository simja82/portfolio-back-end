//Corresponde al Perfil Developer
//Se accede desde el Dashboard Developer botón Perfil
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="developer_profile")
public class DeveloperProfile {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id; 
    
    @NotBlank
    @Column(name="overview", length=255)
    private String overview;
    
    @NotBlank
    @Column(name="fullname", length=100)
    private String fullname;
    
    @NotBlank
    @Column(name="line_one", length=150)
    private String line_one;    
    
    @NotBlank
    @Column(name="photo", length=150)
    private String photo;

    @NotBlank
    @Column(name="phrase_one", length=100)
    private String phrase_one;
    
    @NotBlank
    @Column(name="phrase_two", length=100)
    private String phrase_two;     
    
    @NotBlank
    @Column(name="author", length=100)
    private String author;
    
    @NotBlank
    @Column(name="credit", length=100)
    private String credit;
    
    public DeveloperProfile() {
    }

    public DeveloperProfile (String overview, String fullname, String line_one, String photo, String phrase_one, String phrase_two, String author, String credit) {
        this.overview = overview;
        this.fullname = fullname;
        this.line_one = line_one;        
        this.photo = photo;
        this.phrase_one = phrase_one;
        this.phrase_two = phrase_two;        
        this.author = author;
        this.credit = credit;
    }
}
