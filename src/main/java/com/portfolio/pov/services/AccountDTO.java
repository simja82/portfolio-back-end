package com.portfolio.pov.services;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AccountDTO {
    
    private int id;   
    
    private String fullname;
    
    public AccountDTO() {
    }

    public AccountDTO(int id, String fullname) {
        this.id = id;
        this.fullname = fullname;
    }    
}