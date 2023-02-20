package com.roberto.agenda.services;

import java.util.List;

import com.roberto.agenda.model.Contacto;

public interface ContactoServices {
    
    public List<Contacto> findAll();

    public Contacto findById(int codigo);

    public void save(Contacto contacto);

    public void update(int codigo, Contacto contacto);

    public void delete(int codigo);
}
