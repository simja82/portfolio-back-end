package com.portfolio.pov.services;

import com.portfolio.pov.entities.Login;
import com.portfolio.pov.interfaces.LoginInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    
    //Enlazado
    @Autowired  
    LoginInterface loginInterface;

    //Listar
    public List<Login> getLogins() {
        return loginInterface.findAll();
    }
    
    //Encontrar
    public Login findLogin(Integer id) {
        return loginInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveLogin(Login login) {
        loginInterface.save(login);  
    }
    
    //Editar
    public void updateLogin(int id, Login newLogin) {
        Optional<Login> optionalLogin = loginInterface.findById(id);
        if (optionalLogin.isPresent()) {
            Login existingLogin = optionalLogin.get();
            existingLogin.setImage(newLogin.getImage());
            existingLogin.setDescription(newLogin.getDescription());                    
            loginInterface.save(existingLogin);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un Login inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteLogin(Integer id) {
        loginInterface.deleteById(id);
    }    
}
