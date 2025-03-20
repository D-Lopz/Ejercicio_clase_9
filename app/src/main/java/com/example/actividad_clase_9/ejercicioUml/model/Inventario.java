package com.example.actividad_clase_9.ejercicioUml.model;

public class Inventario {
    private int stock = 0;
    private double precio = 0;
    private Producto producto;
    public Inventario(
            int stock,
            double precio,
            Producto producto
    ){
        this.stock = stock;
        this.precio = precio;
        this.producto = producto;
    }

    public void setStock(
            int stock
    ){
        this.stock = stock;
    }

    public int getStock(){
        return stock;
    }

    public void setPrecio(
            double precio
    ){
        this.precio = precio;
    }

    public double getPrecio(){
        return precio;
    }

    public void setProducto(
            Producto producto
    ){
        this.producto = producto;
    }

    public Producto getProducto(){
        return producto;
    }
}
