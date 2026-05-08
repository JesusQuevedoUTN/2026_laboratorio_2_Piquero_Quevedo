package com.mycompany.laboratorio2.laboratorio4;

import com.mycompany.laboratorio2.labotario2.Auto;
import java.util.ArrayList;

public class Administrativo extends Empleado {

    private int horasExtra;

    public Administrativo(String nombre, String apellido, int dni, String email, double sueldoBasico, int horasExtra) {
        super(nombre, apellido, dni, email, sueldoBasico);
        this.horasExtra = horasExtra;
    }

    public void cargarAuto(ArrayList<Auto> stock, Auto auto) {
        stock.add(auto);
    }

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() + (getSueldoBasico() * horasExtra);
    }
}
