package com.example.actividad_clase_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.actividad_clase_9.ejercicioUml.model.Categoria;
import com.example.actividad_clase_9.ejercicioUml.model.Inventario;
import com.example.actividad_clase_9.ejercicioUml.model.Producto;

public class MainActivity extends AppCompatActivity {

    Categoria categoria;
    Producto producto;
    Inventario inventario;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        categoria = new Categoria("Gamer");
        inventario = new Inventario(45, 5000000, producto);
        producto = new Producto("Teclado mecánico", "Teclado RGB para gamers", categoria);
    }


}