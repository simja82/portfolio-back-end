//Corresponde a la última sección de Credits
//Se accede desde el Dashboard General botón Credits
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="blooper_credits")
public class BlooperCredit {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   
   
    @NotNull
    @Column(name="see", length=150)
    private String see;
    
    @NotNull
    @Column(name="icon", length=50)
    private String icon;
    
    @NotNull
    @Column(name="closing", length=150)
    private String closing;    

    public BlooperCredit() {
    }

    public BlooperCredit (int id, String see, String icon, String closing) {
        this.id = id;
        this.see = see;
        this.icon = icon;
        this.closing = closing;
    }
}
