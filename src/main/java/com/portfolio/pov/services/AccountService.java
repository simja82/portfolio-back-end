package com.portfolio.pov.services;

import com.portfolio.pov.entities.Account;
import com.portfolio.pov.interfaces.AccountInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AccountService {
    
    //Enlazado
    @Autowired  
    AccountInterface accountInterface;

    //Listar
    public List<Account> getAccounts() {
        return accountInterface.findAll();
    }
    
    //Encontrar
    public Account findAccount(Integer id) {
        return accountInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveAccount(Account account) {
        accountInterface.save(account);  
    }

    //Editar
    public void updateAccount(int id, Account newAccount) {
        Optional<Account> optionalAccount = accountInterface.findById(id);
        if (optionalAccount.isPresent()) {
            Account existingAccount = optionalAccount.get();
            existingAccount.setFullname(newAccount.getFullname());
            existingAccount.setEmail(newAccount.getEmail());
            existingAccount.setPassword(newAccount.getPassword());
            accountInterface.save(existingAccount);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar una cuenta inexistente...");
        }
    }
    
    //Eliminar
    public void deleteAccount(Integer id) {
        accountInterface.deleteById(id);
    }
    
    //Login con DTO
    public AccountDTO loginAccount(String email, String password){
	Account account = accountInterface.findByEmailAndPassword(email, password);
	AccountDTO accountDTO = new AccountDTO(account.getId(), account.getFullname());
	return accountDTO;
    } 
}
