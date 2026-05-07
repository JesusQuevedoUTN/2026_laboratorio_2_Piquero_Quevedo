package com.mycompany.laboratorio2.laboratorio4;

import java.util.ArrayList;

public class Gerente extends Empleado {

    private double bono;
    private ArrayList<Administrativo> administrativos;
    private ArrayList<Vendedor> vendedores;

    public Gerente(String nombre, String apellido, int dni, String email, double sueldoBasico, double bono) {
        super(nombre, apellido, dni, email, sueldoBasico);
        this.bono = bono;
        this.administrativos = new ArrayList<Administrativo>();
        this.vendedores = new ArrayList<Vendedor>();
    }

    public void agregarEmpleado(ArrayList<Administrativo> administradores, ArrayList<Vendedor> ventas) {
        this.administrativos = administradores;
        this.vendedores = ventas;
    }

    ;

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() + bono;
    }

}
