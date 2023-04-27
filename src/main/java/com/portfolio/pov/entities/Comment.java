//Corresponde a los Comentarios Developer
//Se accede desde el Dashboard Developer botón Comentarios
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="comments")
public class Comment {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id; 
    
    @NotNull
    @Column(name="icon", length=50)
    private String icon;    

    @NotNull
    @Column(name="one", length=150)
    private String one;
    
    @NotNull
    @Column(name="two", length=150)
    private String two;    

    @NotNull
    @Column(name="fullname", length=100)
    private String fullname;

    @NotNull
    @Column(name="position", length=100)
    private String position;    
    
    public Comment() {
    }

    public Comment (int id, String icon, String one, String two, String fullname, String position) {
        this.id = id;
        this.icon = icon;
        this.one = one;
        this.two = two;
        this.fullname = fullname;
        this.position = position;
    }
}
