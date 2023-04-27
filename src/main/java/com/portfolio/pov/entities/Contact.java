//Corresponde a la sección de Contacto Developer
//Se accede desde la Base de Datos
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="contact")
public class Contact {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id; 
    
    @NotNull
    @Column(name="icon_phone", length=50)
    private String icon_phone;    

    @NotNull
    @Column(name="phone", length=100)
    private String phone;
    
    @NotNull
    @Column(name="icon_email", length=50)
    private String icon_email;    

    @NotNull
    @Column(name="email", length=100)
    private String email;

    @NotNull
    @Column(name="icon_availability", length=50)
    private String icon_availability; 

    @NotNull
    @Column(name="availability", length=100)
    private String availability;     
    
    public Contact() {
    }

    public Contact (int id, String icon_phone, String phone, String icon_email, String email, String icon_availability, String availability) {
        this.id = id;
        this.icon_phone = icon_phone;
        this.phone = phone;
        this.icon_email = icon_email;
        this.email = email;
        this.icon_availability = icon_availability;
        this.availability = availability;
    }
}
