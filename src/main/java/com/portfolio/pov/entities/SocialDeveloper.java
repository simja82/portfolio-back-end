//Corresponde a la sección de Redes Developer en Social
//Se accede desde el Dashboard General botón Social
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="social_developer")
public class SocialDeveloper {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="icon", length=50)
    private String icon;
    
    @NotNull
    @Column(name="link", length=100)
    private String link;
        
    public SocialDeveloper() {
    }

    public SocialDeveloper (int id, String icon, String link) {
        this.id = id;
        this.icon = icon;
        this.link = link;
    }
}
