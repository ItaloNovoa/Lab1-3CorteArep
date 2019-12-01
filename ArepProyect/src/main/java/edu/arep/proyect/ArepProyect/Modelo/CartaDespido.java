package edu.arep.proyect.ArepProyect.Modelo;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class CartaDespido {

    
    private String cedula;
    private String compañia;
    private String nombre;
    private Date fechaDespido;
    private String descripcion;
    private int puntuacion;

    public CartaDespido() {
    }

    public CartaDespido(String cedula, String compañia, String nombre, Date fechaDespido, String descripcion,
            int puntuacion) {
        this.cedula = cedula;
        this.compañia = compañia;
        this.nombre = nombre;
        this.fechaDespido = fechaDespido;
        this.descripcion = descripcion;
        this.puntuacion = puntuacion;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCompañia() {
        return compañia;
    }

    public void setCompañia(String compañia) {
        this.compañia = compañia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaDespido() {
        return fechaDespido;
    }

    public void setFechaDespido(Date fechaDespido) {
        this.fechaDespido = fechaDespido;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    @Override
    public String toString() {
        return "CartaDespido [cedula=" + cedula + ", compañia=" + compañia + ", descripcion=" + descripcion
                + ", fechaDespido=" + fechaDespido + ", nombre=" + nombre + ", puntuacion=" + puntuacion + "]";
    }    
    
}