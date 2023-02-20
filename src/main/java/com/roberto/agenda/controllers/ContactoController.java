package com.roberto.agenda.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.roberto.agenda.model.Contacto;
import com.roberto.agenda.services.ContactoServices;

@RestController
public class ContactoController {
    
    @Autowired
    ContactoServices contactoServices;

    @GetMapping("/contactos")
    List<Contacto> all(){
        return contactoServices.findAll();
    }

    @GetMapping("/contactos/{id}")
    Contacto findContacto(@PathVariable int id){
        return contactoServices.findById(id);
    }

    @DeleteMapping("/contactos/{id}")
    void deleteContacto(@PathVariable int id){
        contactoServices.delete(id);
    }

    @PostMapping("/contactos")
    Contacto guardar(@RequestBody Contacto contacto){
        contactoServices.save(contacto);

        return contacto;
    }

    @PutMapping("/contactos/{id}")
    void actualizar(@PathVariable int id, @RequestBody Contacto contacto){
        contactoServices.update(id, contacto);
    }

    
}
