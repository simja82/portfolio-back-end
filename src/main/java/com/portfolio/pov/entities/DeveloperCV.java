//Corresponde al CV Developer
//Se accede desde el Dashboard Developer botón CV
package com.portfolio.pov.entities;

import jakarta.persistence.*;

import jakarta.validation.constraints.NotNull;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
@Table(name="developer_cv")
public class DeveloperCV {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    int id; 
    
    @NotNull
    @Column(name="line_one", length=50)
    private String line_one;    

    @NotNull
    @Column(name="line_two", length=50)
    private String line_two;
    
    @NotNull
    @Column(name="line_three", length=50)
    private String line_three;  
    
    @NotNull
    @Column(name="line_four", length=50)
    private String line_four; 

    @NotNull
    @Column(name="first_icon", length=50)
    private String first_icon; 

    @NotNull
    @Column(name="line_five", length=50)
    private String line_five; 

    @NotNull
    @Column(name="second_icon", length=50)
    private String second_icon; 

    @NotNull
    @Column(name="line_six", length=50)
    private String line_six;     
    
    public DeveloperCV() {
    }

    public DeveloperCV (int id, String line_one, String line_two, String line_three, String line_four, String first_icon, String line_five, String second_icon, String line_six) {
        this.id = id;
        this.line_one = line_one;
        this.line_two = line_two;
        this.line_three = line_three;
        this.line_four = line_four;
        this.first_icon = first_icon;
        this.line_five = line_five;
        this.second_icon = second_icon;
        this.line_six = line_six;
    }
}
