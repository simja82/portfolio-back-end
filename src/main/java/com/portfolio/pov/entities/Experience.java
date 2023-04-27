//Corresponde a Experiencia Developer
//Se accede desde el Dashboard Developer botón Experiencia
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="experiences")
public class Experience {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="image", length=255)
    private String image;

    @NotNull
    @Column(name="position", length=100)
    private String position;
    
    @NotNull
    @Column(name="place", length=150)
    private String place;

    @NotNull
    @Column(name="start_date", length=10)
    private String start_date;
    
    @NotNull
    @Column(name="end_date", length=10)
    private String end_date;
    
    @NotNull
    @Column(name="description", length=100)
    private String description;
    
    @NotNull
    @Column(name="task_one", length=50)
    private String task_one;

    @NotNull
    @Column(name="task_two", length=50)
    private String task_two;

    @NotNull
    @Column(name="task_three", length=50)
    private String task_three;    
    
    
    public Experience() {
    }

    public Experience (int id, String image, String position, String place, String start_date, String end_date, String description, String task_one, String task_two, String task_three) {
        this.id = id;
        this.image = image;
        this.position = position;
        this.place = place;
        this.start_date = start_date;
        this.end_date = end_date; 
        this.description = description;
        this.task_one = task_one;
        this.task_two = task_two;
        this.task_three = task_three;
    }
}
