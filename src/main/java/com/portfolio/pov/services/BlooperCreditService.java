package com.portfolio.pov.services;

import com.portfolio.pov.entities.BlooperCredit;
import com.portfolio.pov.interfaces.BlooperCreditInterface;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BlooperCreditService {
    
    //Enlazado
    @Autowired  
    BlooperCreditInterface blooperCreditInterface;

    //Listar
    public List<BlooperCredit> getBlooperCredits() {
        return blooperCreditInterface.findAll();
    }
    
    //Encontrar
    public BlooperCredit findBlooperCredit(Integer id) {
        return blooperCreditInterface.findById(id).orElse(null);   
    }
    
    //Crear
    public void saveBlooperCredit(BlooperCredit bloopercredit) {
        blooperCreditInterface.save(bloopercredit);  
    }
    
    //Editar
    public void updateBlooperCredit(int id, BlooperCredit newBlooperCredit) {
        Optional<BlooperCredit> optionalBlooperCredit = blooperCreditInterface.findById(id);
        if (optionalBlooperCredit.isPresent()) {
            BlooperCredit existingBlooperCredit = optionalBlooperCredit.get();
            existingBlooperCredit.setSee(newBlooperCredit.getSee());
            existingBlooperCredit.setIcon(newBlooperCredit.getIcon());
            existingBlooperCredit.setClosing(newBlooperCredit.getClosing());                   
            blooperCreditInterface.save(existingBlooperCredit);
        } else {
            throw new IllegalArgumentException("Nope... No podés actualizar un crédito de blooper inexistente...");
        }
    }    
    
    //Eliminar
    public void deleteBlooperCredit(Integer id) {
        blooperCreditInterface.deleteById(id);
    }    
}
