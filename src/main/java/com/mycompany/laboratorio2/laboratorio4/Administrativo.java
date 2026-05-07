package com.mycompany.laboratorio2.laboratorio4;

// Autor: Chisus

import com.mycompany.laboratorio2.Auto;
import java.util.ArrayList;

// Fecha de creación: 07/05/2026

public class Administrativo extends Empleado{
 private int horasExtra;

    public Administrativo(String nombre, String apellido, int dni, String email, double sueldoBasico, int horasExtra) {
        super(nombre, apellido, dni, email, sueldoBasico);
        this.horasExtra = horasExtra;
    }
 
    public void cargarAuto(ArrayList<Auto> stock){
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    };
    
    @Override
    public double calcularSueldo() {
        return getSueldoBasico() + (getSueldoBasico()*horasExtra);
    }
    
}
