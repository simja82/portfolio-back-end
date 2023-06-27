//Corresponde a la primera sección de Presentación Audiovisual
//Se accede desde el Dashboard Audiovisual botón Presentación
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="audiovisual_presentation")
public class AudiovisualPresentation {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotBlank
    @Column(name="title", length=50)
    private String title;
    
    @NotBlank
    @Column(name="line_one", length=100)
    private String line_one;
    
    @NotBlank
    @Column(name="line_two", length=100)
    private String line_two;

    @NotBlank
    @Column(name="line_three", length=100)
    private String line_three;
    
    @NotBlank
    @Column(name="minibio_icon", length=50)
    private String minibio_icon;

    @NotBlank
    @Column(name="minibio_text", length=50)
    private String minibio_text;

    @NotBlank
    @Column(name="mywork_icon", length=50)
    private String mywork_icon;

    @NotBlank
    @Column(name="mywork_text", length=50)
    private String mywork_text;

    @NotBlank
    @Column(name="iwant_icon", length=50)
    private String iwant_icon;

    @NotBlank
    @Column(name="iwant_text", length=50)
    private String iwant_text;    
    
    @NotBlank
    @Column(name="subtitle", length=100)
    private String subtitle;

    @NotBlank
    @Column(name="paragraph", length=100)
    private String paragraph;    
        
    public AudiovisualPresentation() {
    }

    public AudiovisualPresentation (String title, String line_one, String line_two, String line_three, String minibio_icon, String minibio_text, String mywork_icon, String mywork_text, String iwant_icon, String iwant_text, String subtitle, String paragraph) {
        this.title = title;
        this.line_one = line_one;
        this.line_two = line_two;
        this.line_three = line_three;
        this.minibio_icon = minibio_icon;
        this.minibio_text = minibio_text;
        this.mywork_icon = mywork_icon;
        this.mywork_text = mywork_text;
        this.iwant_icon = iwant_icon;
        this.iwant_text = iwant_text;
        this.subtitle = subtitle;
        this.paragraph = paragraph;        
    }
}
