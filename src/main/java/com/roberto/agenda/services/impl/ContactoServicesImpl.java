package com.roberto.agenda.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.roberto.agenda.model.Contacto;
import com.roberto.agenda.repository.ContactoRepository;
import com.roberto.agenda.services.ContactoServices;

@Service
public class ContactoServicesImpl implements ContactoServices {
    
    @Autowired
    ContactoRepository contactoRepository;

    public List<Contacto> findAll(){
        return contactoRepository.findAll();
    }

    public Contacto findById(int codigo){
        Optional<Contacto> findById = contactoRepository.findById(codigo);
        if(findById != null){
            return findById.get();
        } 
        return null;    
    }

    public void save(Contacto contacto){
        contactoRepository.save(contacto);
    }

    public void update(int codigo,Contacto contacto){
        this.findById(codigo);
        contacto.setCodigo(codigo);
        contactoRepository.save(contacto);
    }

    public void delete(int codigo){
        contactoRepository.deleteById(codigo);
    }
}
