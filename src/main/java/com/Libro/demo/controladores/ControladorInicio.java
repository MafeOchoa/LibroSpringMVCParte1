/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Libro.demo.controladores;
import com.Libro.demo.dao.IULibroCrud;
import com.Libro.demo.models.Libro;
import com.Libro.demo.servicio.IULibroServicio;
import java.sql.Date;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
//import lombok.extern.slf4j.Slf4j;
import  org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;



 
/**
 *
 * @author María Fernanda Ochoa
 */

@Controller
//@Slf4j
public class ControladorInicio {
    @Autowired
   // IULibroCrud crudLibro;
    IULibroServicio libroServicio;
    @Value("${index.mensaje}")
    String dato;
    private static final Logger logger = LogManager.getLogger(ControladorInicio.class);
  
    
    @GetMapping("/")
    public String inicio(Model models){
       // List<Libro> listaLibro = (List<Libro>) crudLibro.findAll();
       List<Libro> listaLibro = (List<Libro>) libroServicio.listarLibros();
        for (int i = 0; i < listaLibro.size(); i++) {
            logger.info(listaLibro.get(i).getTitulo());
        }
        models.addAttribute("Libros", listaLibro);
        String mensaje = "¡Tu próxima gran aventura te espera entre estas páginas.!";
        models.addAttribute("mensaje", mensaje);
        models.addAttribute("dato", dato);
                        
        logger.info("Ejecutando el controlador inicio MVC");
        return "index";
    }

    @GetMapping("/agregar")
    public String agregar(Libro libro) {
        return "modificar";
    }

    @PostMapping("/guardar")
    public String guardar(Libro libro) {
        libroServicio.guardar(libro);
        return "redirect:/";
    }
    @GetMapping("/editar/{id}")
    public String editar(Libro libro, Model models ){
        logger.info("invocando el método EDITAR");
        Optional<Libro> libroEncontrado = libroServicio.buscar(libro);
        models.addAttribute("libro", libroEncontrado);
        return "modificar";
    }
    
     @GetMapping("/eliminar/{id}")
    public String eliminar(Libro libro) {
        libroServicio.eliminar(libro);
        return "redirect:/";
    
    }
}



