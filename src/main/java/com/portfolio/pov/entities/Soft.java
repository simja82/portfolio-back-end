//Corresponde a la sección de Blandas Developer
//Se accede desde el Dashboard Developer botón Skills
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="softs")
public class Soft {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;

    @NotNull
    @Column(name="soft", length=50)
    private String soft;
    
    @NotNull
    @Column(name="percentage", length=3)
    private String percentage;
    
    public Soft() {
    }

    public Soft (int id, String soft, String percentage) {
        this.id = id;
        this.soft = soft;
        this.percentage = percentage;
    }
}
