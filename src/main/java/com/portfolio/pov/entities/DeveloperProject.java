//Corresponde al Proyectos Developer
//Se accede desde el Dashboard Developer botón Proyectos
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="developer_projects")
public class DeveloperProject {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="image", length=255)
    private String image;

    @NotNull
    @Column(name="title", length=100)
    private String title;
    
    @NotNull
    @Column(name="description", length=255)
    private String description;
        
    @NotNull
    @Column(name="link", length=255)
    private String link;    
    
    public DeveloperProject() {
    }

    public DeveloperProject (int id, String image, String title, String description, String link) {
        this.id = id;
        this.image = image;
        this.title = title;
        this.description = description;
        this.link = link;
    }
}
