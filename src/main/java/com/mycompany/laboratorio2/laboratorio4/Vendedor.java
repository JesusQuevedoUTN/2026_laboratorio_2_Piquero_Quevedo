package com.mycompany.laboratorio2.laboratorio4;

import com.mycompany.laboratorio2.labotario2.Auto;
import java.util.ArrayList;

public class Vendedor extends Empleado {

    private int cantidadDeVentas;

    public Vendedor(String nombre, String apellido, int dni, String email, double sueldoBasico, int cantidadDeVentas) {
        super(nombre, apellido, dni, email, sueldoBasico);
        this.cantidadDeVentas = cantidadDeVentas;
    }

    public void venderAuto(ArrayList<Auto> stock, ArrayList<Auto> vendidos, Auto auto) {
        stock.remove(auto);
        vendidos.add(auto);
    }

    public int getCantidadDeVentas() {
        return cantidadDeVentas;
    }

    public void setCantidadDeVentas(int cantidadDeVentas) {
        this.cantidadDeVentas = cantidadDeVentas;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() * cantidadDeVentas;
    }

}
