/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.Libro.demo.models;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import java.sql.Date;
import lombok.Data;


/**
 *
 * @author María Fernanda Ochoa
 */
@Entity
@Table (name="tablalibro")
@Data
public class Libro implements Serializable{
    
    private static final long serialVersionUID = 1L;
    @Id
    private int id;                // PK, AI
    private String titulo;            // varchar
    private int paginas;           // int
    private float precio;            // float
    private String fechaPublicacion;  // fecha
    @Column(nullable = true)
    private Integer usuarioId;
    

//    public Libro(int id, String titulo, int paginas, float precio, Date fechaPublicacion, int usuarioId) {
//        this.id = id;
//        this.titulo = titulo;
//        this.paginas = paginas;
//        this.precio = precio;
//        this.fechaPublicacion = fechaPublicacion;
//        this.usuarioId = usuarioId;
//    }
//
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getPaginas() {
        return paginas;
    }

    public float getPrecio() {
        return precio;
    }

    public String getFechaPublicacion() {
        return fechaPublicacion;
    }

    public int getUsuarioId() {
        return usuarioId;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setFechaPublicacion(String fechaPublicacion) {
        this.fechaPublicacion = fechaPublicacion;
    }

    public void setUsuarioId(int usuarioId) {
        this.usuarioId = usuarioId;
    }

    public void setFechapublicacion(String mafegmailcom) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPrecio(String mafegmailcom) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setPaginas(String mafe_ochoa) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setId(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    
}
