package com.example.actividad_clase_9.ejercicioUml.model;

public class Producto {

    private String nombre = "";
    private String descripcion = "";
    private Categoria categoria;

    public Producto (
        String nombre,
        String descripcion,
        Categoria categoria
    ){
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.categoria = categoria;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(
            String nombre
    ){
     this.nombre = nombre;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public void setDescripcion(
            String descripcion
    ){
        this.descripcion = descripcion;
    }

    public Categoria getCategoria(){
        return categoria;
    }

    public void setCategoria(Categoria categoria){
        this.categoria = categoria;
    }
}
