//Corresponde a todos los títulos de las secciones de Intro Developer
//Se accede desde Base de Datos 
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="sections")
public class Section {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="about", length=50)
    private String about;
    
    @NotNull
    @Column(name="studies", length=50)
    private String studies;

    @NotNull
    @Column(name="experiences", length=50)
    private String experiences;

    @NotNull
    @Column(name="projects", length=50)
    private String projects;

    @NotNull
    @Column(name="skills", length=50)
    private String skills;

    @NotNull
    @Column(name="technicals", length=50)
    private String technicals;

    @NotNull
    @Column(name="softs", length=50)
    private String softs;

    @NotNull
    @Column(name="languages", length=50)
    private String languages;

    @NotNull
    @Column(name="hobbies", length=50)
    private String hobbies;

    @NotNull
    @Column(name="comments", length=50)
    private String comments;

    @NotNull
    @Column(name="contact", length=50)
    private String contact;    
        
    public Section() {
    }

    public Section (int id, String about, String studies, String experiences, String projects, String skills, String technicals, String softs, String languages, String hobbies, String comments, String contact) {
        this.id = id;
        this.about = about;
        this.studies = studies;
        this.experiences = experiences;
        this.projects = projects;
        this.skills = skills;
        this.technicals = technicals;
        this.softs = softs;
        this.languages = languages;
        this.hobbies = hobbies;
        this.comments = comments;
        this.contact = contact;        
    }
}
