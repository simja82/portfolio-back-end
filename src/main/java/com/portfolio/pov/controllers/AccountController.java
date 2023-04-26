package com.portfolio.pov.controllers;

import com.portfolio.pov.entities.Account;
import com.portfolio.pov.services.AccountDTO;
import com.portfolio.pov.services.AccountService;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@CrossOrigin(origins="*", allowedHeaders="*")
@RestController
//@CrossOrigin(origins = "https://pov-portfolio.web.app/")
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("account")
public class AccountController {
    
    //Enlazado
    @Autowired
    AccountService accountService;
   
    //Listar
    @GetMapping("/list")
    @ResponseBody 
    public List<Account> getAccounts(){
       return accountService.getAccounts();  
    }
    
    //Encontrar
    @GetMapping("/find/{id}")
    @ResponseBody 
    public Account findAccount(@PathVariable int id){
        return accountService.findAccount(id);  
    }
    
    //Crear
    @PostMapping ("/new")
    @ResponseBody
    public String saveAccount(@RequestBody Account account){
        accountService.saveAccount(account);
        return "Muy bien!!! Creaste una cuenta!!!";   
    }
    
    //Editar
    @PutMapping("/update/{id}")   
    public String updateAccount(@PathVariable int id, @RequestBody Account account){
        accountService.updateAccount(id, account);
        return "Ok. Actualizaste la cuenta.";
    }

    //Eliminar
    @DeleteMapping("/delete/{id}")
    public String deleteAccount(@PathVariable int id){
        accountService.deleteAccount(id);
        return "Espero que no te arrepientas... Borraste la cuenta...";
    }
    
    //Login
    @PostMapping ("/auth/login")
    @ResponseBody
    public AccountDTO loginAccount(@RequestBody Account account) {
        return accountService.loginAccount(account.getEmail(), account.getPassword());
    }
    
}