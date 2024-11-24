/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.Libro.demo.servicio;
import java.util.List;
import com.Libro.demo.models.Libro;
import java.util.Optional;
/**
 *
 * @author María Fernanda Ochoa
 */
public interface IULibroServicio {
    

    public List<Libro> listarLibros();

    public void guardar(Libro libro);

    public void eliminar(Libro libro);

    public Optional<Libro> buscar(Libro libro);
    
}
