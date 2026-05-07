package com.mycompany.laboratorio2.laboratorio4;

// Autor: Chisus
import com.mycompany.laboratorio2.Auto;
import java.util.ArrayList;

// Fecha de creación: 07/05/2026
public class Vendedor extends Empleado {

    private int cantidadDeVentas;
    private ArrayList<Vendedor> vendedores;

    public Vendedor(String nombre, String apellido, int dni, String email, double sueldoBasico, int cantidadDeVentas) {
        super(nombre, apellido, dni, email, sueldoBasico);
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public void venderAuto(ArrayList<Auto> stock, ArrayList<Auto> vendidos) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public double calcularSueldo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
