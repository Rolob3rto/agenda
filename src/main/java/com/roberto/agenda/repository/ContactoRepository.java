package com.roberto.agenda.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.roberto.agenda.model.Contacto;

public interface ContactoRepository extends JpaRepository<Contacto, Integer> {
    
}
