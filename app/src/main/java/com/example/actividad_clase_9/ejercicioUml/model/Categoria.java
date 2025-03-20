package com.example.actividad_clase_9.ejercicioUml.model;

public class Categoria {
    private String nombre = "";

    public Categoria(
            String nombre
    ){
        this.nombre = nombre;
    }

    public void setNombre(
            String nombre
    ){
        this.nombre = nombre;
    }

    public String getNombre(){
        return nombre;
    }

}
