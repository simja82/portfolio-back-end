//Corresponde a la Cuenta de Login
//Se accede desde Base de Datos
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="account")
public class Account {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id;   

    @NotNull
    @Column(name="email")
    private String email;
    
    @NotNull
    @Size(min=8, max=20)
    @Column(name="password")
    private String password;   
    
    @NotNull
    @Column(name="fullname", length=100)
    private String fullname;  

    public Account() {
    }

    public Account (int id, String email, String password, String fullname) {
        this.id = id;
        this.email = email;
        this.password = password;
        this.fullname = fullname;
    }
}
