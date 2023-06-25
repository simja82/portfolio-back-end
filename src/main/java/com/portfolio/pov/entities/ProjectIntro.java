//Corresponde a Proyectos Audiovisual
//Se accede desde el Dashboard Audiovisual botón Proyectos
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="projects_intro")
public class ProjectIntro {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="title", length=100)
    private String title;
    
    @NotNull
    @Column(name="line_one", length=100)
    private String line_one;
    
    @NotNull
    @Column(name="line_two", length=100)
    private String line_two;

    @NotNull
    @Column(name="line_three", length=50)
    private String line_three;
    
    @NotNull
    @Column(name="series", length=50)
    private String series;
    
    @NotNull
    @Column(name="icon_series", length=50)
    private String icon_series;

    @NotNull
    @Column(name="longshots", length=50)
    private String longshots;

    @NotNull
    @Column(name="icon_longshots", length=50)
    private String icon_longshots;

    @NotNull
    @Column(name="others", length=50)
    private String others;    

    @NotNull
    @Column(name="icon_others", length=50)
    private String icon_others;
    
    @NotNull
    @Column(name="one_samples", length=100)
    private String one_samples;

    @NotNull
    @Column(name="two_samples", length=100)
    private String two_samples;    

    @NotNull
    @Column(name="three_samples", length=100)
    private String three_samples;    
    
    public ProjectIntro() {
    }

    public ProjectIntro (int id, String title, String line_one, String line_two, String line_three, String series, String icon_series, String longshots, String icon_longshots, String others, String icon_others, String one_samples, String two_samples, String three_samples) {
        this.id = id;
        this.title = title;
        this.line_one = line_one;
        this.line_two = line_two;
        this.line_three = line_three;
        this.series = series;
        this.icon_series = icon_series;
        this.longshots = longshots;
        this.icon_longshots = icon_longshots;
        this.others = others;
        this.icon_others = icon_others;
        this.one_samples = one_samples;
        this.two_samples = two_samples;
        this.three_samples = three_samples;
    }
}
