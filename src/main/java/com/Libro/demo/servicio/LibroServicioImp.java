/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Libro.demo.servicio;

import java.util.List;
import com.Libro.demo.dao.IULibroCrud;
import com.Libro.demo.models.Libro;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author María Fernanda Ochoa
 */
@Service
public class LibroServicioImp implements IULibroServicio {
    @Autowired
    IULibroCrud crudLibro;
    
    
    @Transactional (readOnly =true)
    @Override
    public List <Libro> listarLibros(){
        
        return (List<Libro>) crudLibro.findAll();
    }

    @Override
    public void guardar(Libro libro) {
        crudLibro.save(libro);
    }

    @Override
    public void eliminar(Libro libro) {
        crudLibro.deleteById(String.valueOf(libro.getId()));
    }

    @Override
    public Optional<Libro> buscar(Libro libro) {
        return crudLibro.findById(String.valueOf(libro.getId()));
    }
    
    
}
