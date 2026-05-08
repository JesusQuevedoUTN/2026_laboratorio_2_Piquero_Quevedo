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

    public double getBono() {
        return bono;
    }

    public void setBono(double bono) {
        this.bono = bono;
    }

    public ArrayList<Administrativo> getAdministrativos() {
        return administrativos;
    }

    public void setAdministrativos(ArrayList<Administrativo> administrativos) {
        this.administrativos = administrativos;
    }

    public ArrayList<Vendedor> getVendedores() {
        return vendedores;
    }

    public void setVendedores(ArrayList<Vendedor> vendedores) {
        this.vendedores = vendedores;
    }

    @Override
    public double calcularSueldo() {
        return getSueldoBasico() + bono;
    }

}
